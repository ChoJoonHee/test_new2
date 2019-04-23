package com.coderby.myapp.hello.service;

import org.springframework.stereotype.Component;

//Aspect + Pointcut = weaving
//sayHello에 로그를 집어넣는것을 위빙이라함

@Component("helloServiceProxy")
public class HelloServiceProxy extends HelloService{
	
	@Override	//Joinpoint 
	public String sayHello(String name) {
		HelloLog.log(); 
		return super.sayHello(name);
	}
	
	@Override	//Jointpoint
	public String sayGoodbye(String name) {
		return "Goodbye~" + name;
	}
}
