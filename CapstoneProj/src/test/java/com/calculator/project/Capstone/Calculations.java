package com.calculator.project.Capstone;


public class Calculations {

	public void performClickonCalculator(String ip, CalculatorPage cp) throws InterruptedException {
		// TODO Auto-generated method stub
		int size = ip.length();
		for(int i=0; i<size; i++)
		{
			char ch = ip.charAt(i);
			switch(ch)
			{
			case '1' : cp.number1();
						break;
			case '2' : cp.number2();
			break;
			case '3' : cp.number3();
			break;
			case '4' : cp.number4();
			break;
			case '5' : cp.number5();
			break;
			case '6' : cp.number6();
			break;
			case '7' : cp.number7();
			break;
			case '8' : cp.number8();
			break;
			case '9' : cp.number9();
			break;
			case '0' : cp.number0();
			break;
			case '+' : cp.clickplus();
			break;
			case '-' : cp.clickminus();
			break;
			case '/' : cp.clickdiv();
			break;
			case '*' : cp.clickmul();
			break;
			case '.' : cp.clickdot();
			break;
			case '=': cp.clickEquals();	
			break;
			default : break;
			}
			
			Thread.sleep(1000);
		
			
		}
		Thread.sleep(1000);
		System.out.println("value= "+cp.getCalculatedValue());
		cp.clickAllClear();
	}

	

}
