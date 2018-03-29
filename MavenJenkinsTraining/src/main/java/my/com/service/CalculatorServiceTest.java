package my.com.service;

public class CalculatorServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String operation=args[2];
		System.out.println(new CalculatorServiceTest().performOperation(a,b,operation));
		
		

	}
	
	
      public int performOperation(int a,int b,String operation)
      {
    	  int result=0;
    	  CalculatorService serv=new CalculatorService();
  		switch(operation)
  		{
  		case "add":result= (serv.add(a, b));
  		break;
  		case "sub":result=(serv.subtract(a, b));
  		break;
  		case "mul":result=(serv.multiply(a, b));
  		break;
  		case "div":result=(serv.divide(a, b));
  		break;
  		}
  		return result;
      }
}
