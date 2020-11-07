package com.luban.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author niuchangmeng
 * @date 2020/4/21 12:33
 */
@Component
@Scope("prototype")
public class IndexService {

	public void query(){
		System.out.println("logic");
	}
}
