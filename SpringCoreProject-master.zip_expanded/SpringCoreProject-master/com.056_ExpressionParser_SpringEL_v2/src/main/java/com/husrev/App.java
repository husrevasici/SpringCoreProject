package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ExpressionParser parser = new SpelExpressionParser();

		// literal ifadeler

		Expression exp1 = parser.parseExpression("100L");
		String mesaj1 = exp1.getValue(String.class);
		System.out.println(mesaj1);

		// metot Cagirma,
		
		
		
		((ConfigurableApplicationContext) context).close();
	}
}
