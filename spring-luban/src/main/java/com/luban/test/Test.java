package com.luban.test;

import com.luban.app.AppConf;
import com.luban.service.BeanService;
import com.luban.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author niuchangmeng
 * @date 2020/4/21 12:24
 */

public class Test {

	public static void main(String[] args) {

		//先执行这歌类  在执行 refresh  最后在refresh中完成扫描的
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConf.class);

	//	OrderService bean = ac.getBean(OrderService.class);

	/*	GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(IndexService.class);
		genericBeanDefinition.setScope("singleton");
		ac.registerBeanDefinition("xxx",genericBeanDefinition);
		ac.refresh();*/
		//在refresh中才完成扫描的

		System.out.println(ac.getBean(BeanService.class));

		//往容器中动态注册一个Bean---配置类(类似@Configuration注解的效果)
	//	ac.register();

	/*	//使用xml配置方式
		ClassPathXmlApplicationContext cc =
				new ClassPathXmlApplicationContext("classpath:spring.xml");
*/
	}

}
