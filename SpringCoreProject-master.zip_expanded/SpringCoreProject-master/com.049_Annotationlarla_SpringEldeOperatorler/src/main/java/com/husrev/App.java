package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Operatorler operatorler = context.getBean("OperatorlerBean", Operatorler.class);
		
    	System.out.println("equalTest : "+operatorler.isEqualTest() +"\n"+
				"notEqualTest : "+operatorler.isNotequalTest()+"\n"+
				"LessThanTest : "+operatorler.isLessThanTest()+"\n"+
				"LessThanOrEqualTest : "+operatorler.isLessThanOrEqualTest()+"\n"+
				"GreaterThanTest : "+operatorler.isGreaterThanTest()+"\n"+
				"GreaterThanOrEqualTest : "+operatorler.isGreaterThanOrEqualTest()+"\n"+
				"AndTest : "+operatorler.isAndTest()+"\n"+
				"OrTest : "+operatorler.isOrTest()+"\n"+
				"NotTest : "+operatorler.isNotTest()+"\n"+
				"AddTest : "+operatorler.getAddTest()+"\n"+
				"AddStringTest : "+operatorler.getAddStringTest()+"\n"+
				"SubstractionTest : "+operatorler.getSubstractionTest()+"\n"+
				"MultiplicationTest : "+operatorler.getMultiplicationTest()+"\n"+
				"DivisionTest : "+operatorler.getDivisionTest()+"\n"+
				"ModulusTest : "+operatorler.getModulusTest()+"\n"+
				"ExponentialPowerTest : "+operatorler.getExponentialPowerTest()
	);
    	((ConfigurableApplicationContext) context).close();
    }
}
