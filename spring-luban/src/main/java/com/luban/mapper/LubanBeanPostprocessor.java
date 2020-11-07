package com.luban.mapper;

import com.luban.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author niuchangmeng
 * @date 2020/11/1 14:59
 */

/**
 * 扫描完成之后
 * parse put map 之后
 */
@Component
public class LubanBeanPostprocessor  implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanService = (GenericBeanDefinition)beanFactory.getBeanDefinition("beanService");
		beanService.setBeanClass(TestService.class);

	}
}
