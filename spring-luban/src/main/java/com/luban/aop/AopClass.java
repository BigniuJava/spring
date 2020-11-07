package com.luban.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author niuchangmeng
 * @date 2020/4/25 15:58
 */

@Component
@Aspect
public class AopClass {



	@Pointcut("this(com.luban.service.OrderService)")
	public void pointcut(){

		System.out.println("pointcut");
	}

	@Pointcut("target(com.luban.service.OrderService)")
	public void target(){

		System.out.println("target");
	}


	@Pointcut("within(com.luban.beanDefinition..(..))")
	public void within(){

		System.out.println("within");
	}

	@Pointcut("args(java.lang.String)")
	public void args(){

		System.out.println("args");
	}


	@Before("within()")
	public void change(){

		System.out.println("加强的方法");

	}

}
