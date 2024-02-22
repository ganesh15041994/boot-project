package com.org.SPEL;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ApplicationContext cont =new  ClassPathXmlApplicationContext("com/org/SPEL/spel.xml");
	Demo d	=cont.getBean("demo",Demo.class);
	System.out.println(d);
	
	
	SpelExpressionParser temp= new SpelExpressionParser();
	org.springframework.expression.Expression exp = temp.parseExpression("11+22");
	System.out.println(exp.getValue());
	}

}
