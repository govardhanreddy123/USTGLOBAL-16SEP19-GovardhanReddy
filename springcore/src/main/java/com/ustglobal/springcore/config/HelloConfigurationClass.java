package com.ustglobal.springcore.config;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configurable
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	@Bean(name="hello")
	// @Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("i love python");
		return hello;
		
	}
	

	

}
