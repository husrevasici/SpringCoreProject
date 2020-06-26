// https://dzone.com/articles/learn-spring-expression-language-with-examples
// Expression parser spring core

package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class App {

	public static void main(String[] args) throws Exception {

		ExpressionParser parser = new SpelExpressionParser();

		// literal ifadeler
		Expression exp1 = parser.parseExpression("'Adnan Aydemir'.length()");
		String mesaj1 = (String) exp1.getValue(String.class);
		System.out.println(mesaj1);

		Expression exp2 = parser.parseExpression("'Adnan Aydemir'.length()");
		int mesaj2 = (Integer) exp2.getValue();
		System.out.println(mesaj2);

		Expression exp3 = (Expression) parser.parseExpression("14*53");
		int mesaj3 = (Integer) exp3.getValue();
		System.out.println(mesaj3);

		Kaynak kaynak = new Kaynak();
		StandardEvaluationContext testContext = new StandardEvaluationContext(kaynak);

		Expression exp4 = (Expression) parser.parseExpression("ePosta");
		String mesaj4 = (String) exp4.getValue(testContext, String.class);
		System.out.println("4: "+mesaj4);

		Expression exp5 = (Expression) parser.parseExpression("ePosta.equals('mimaraslan@yandex.ru')");
		String mesaj5 = exp5.getValue(testContext, String.class);
		System.out.println(mesaj5);

	}
}
