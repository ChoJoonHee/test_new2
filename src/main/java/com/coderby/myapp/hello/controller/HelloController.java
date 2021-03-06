package com.coderby.myapp.hello.controller;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.coderby.myapp.hello.service.HelloService;
import com.coderby.myapp.hello.service.IHelloService;

@Controller
public class HelloController {
	
	@Resource(name="helloService")
	IHelloService helloService;
	
	/*@Autowired
	@Qualifier("helloService") //if문과 비슷 Autowired와 쓴다 */
	//@Resource(name="helloService") //정확히 찾아낼때 사용한다.
	//IHelloService helloService;
	
	/*// 1. 생성자 의존성 주입
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	/*//2. setter 의존성 주입
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	
	public void Hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
}
