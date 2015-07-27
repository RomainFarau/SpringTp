package com.bankonet.aspect;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
public class LogAspect {
	private Log log=LogFactory.getLog(this.getClass());
	private final String pointCut="execution(* com.bankonet.dao.*.*(..)) || execution(* com.bankonet.metier.*.*(..))";
	
	@Before(pointCut)
	@Order(0)
	public void logBefore(JoinPoint point){
		
		String methodName=methodName(point);
		StringBuffer sbin = new StringBuffer(methodName +" appelée avec : ");
		
		log.info(sbin+" "+Arrays.toString(point.getArgs()));
	}
	
	@AfterReturning(pointcut=pointCut, returning="result")
	@Order(2)
	public void logAfterReturning(JoinPoint point, Object result){
		log.info(point.getTarget().getClass()+" "+point.getSignature().getName()+" "+Arrays.toString(point.getArgs())
				+" terminée par "+result);
	}
	
	@Around(pointCut)
	@Order(1)
	public Object logAround(ProceedingJoinPoint point) throws Throwable{
		log.info(point.getTarget().getClass()+" "+point.getSignature().getName()+" "+Arrays.toString(point.getArgs()));
		try{
			Object result=point.proceed();
			log.info(point.getTarget().getClass()+" "+point.getSignature().getName()+" "+Arrays.toString(point.getArgs())
					+" terminée par "+result);
			return result;
		}
		catch(IllegalArgumentException e){
			log.error("Argument invalide "
						+Arrays.toString(point.getArgs())+" dans "
						+point.getSignature().getName()+"()");
			throw e;
		}
	}
	
	public String methodName(JoinPoint point){
		String methodName = point.getTarget().getClass().getSimpleName() + "."
				+ point.getSignature().getName();
		return methodName;
	}
	
}
