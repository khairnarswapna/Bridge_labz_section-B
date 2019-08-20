package StaticFunction;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class MathFun {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		double futureVal,presentVal,epsilon;
		
	 
	    
		
		System.out.println("-------MENU----------------");
		System.out.println("1.Math Function");
		System.out.println("2.calculate future and present value");
		System.out.println("3.finding min max value for Integer array");
		System.out.println("4.finding min max value for String array");
		System.out.println("5.finding square root using newtons method");
		System.out.println("6.Calculate prime number");
		System.out.println("7.factorial number");
		System.out.println("8.Finding collinear slope and area");
		System.out.println("Enter your choice:");
		int ch= sc.nextInt();
		switch (ch) 
		{
		case 1:
			System.out.println("================Menu of Basic Math Function==========");
			System.out.println("1.Binary Number\n2.sin of angle\n3.cosine of angle\n 4.Harmonicnumber");
			System.out.println("Enter choice that you have to Perform Operation");
			int ch1=sc.nextInt();
			 
			switch (ch1) 
			{
			case 1:

				System.out.println("Enter decimal number");
				int decimalno = sc.nextInt();
			    System.out.println("Binary is: " + Utility.Binary(decimalno));
				break;
				 
			case 2:
				System.out.println("Enter angle to find sin");
				int ang = sc.nextInt();
		  //   	double radian = Utility.findRadiun(angle);
		   //  	double sin = Utility.findSin(radian);
		 	//	System.out.println("Sin(" + angle + ") = " + sin);
				break;
				
			case 3:
				System.out.println("Enter angle to find cosine");
				int angle2 = sc.nextInt();
			//	double radian2 = Utility.findRadiun(angle2);
			//	double cos = Utility.findSin(radian2);
			//	System.out.println("Cos(" + angle2 + ") = " + cos);
				break;
			case 4:

				System.out.println("Enter number for harmonic number");
				num = sc.nextInt();
				Utility.HarmonicNo(num);
				break;
			}
			
			break;
							
			case 2:  
				       int  a,r,t;
				       System.out.println("Calculate present and future value");
	
						System.out.println("-------------------------");
					
						System.out.println("Enter amount");
						a=sc.nextInt();
						System.out.println("Enter interest rate");
						r=sc.nextInt();
						System.out.println("Enter Year:");
						t=sc.nextInt();
						t=t*12;
				        futureVal=Utility.futureValue(a, r, t);
						presentVal=Utility.presentValue(a, r, t);
						System.out.println("Future values =>"+futureVal);
						System.out.println("Present values =>: "+presentVal);;
						break;
						
		case 3:
			
			System.out.println("min and max from integer array");/*min max for integer*/
			System.out.println("------------------------------");
			int arr[]= {11,22,33,44,55};
	     	int min=Utility.minValue(arr);
		    System.out.println("Min value of array is: "+min);
			int max=Utility.maxValue(arr);
		     System.out.println("Max value of array is: "+max);
			break;
			
		case 4:
			
			System.out.println("min and max from string array");
			System.out.println("-------------------------");
			
			String stra[]= {"Ashwini","Rani","swati","damini","jyostana","pinu"};
			
		    String minStr=Utility.minValue(stra);
	        String maxStr=Utility.maxValue(stra);
	        System.out.println("Min String from array =>"+minStr);
		    System.out.println("Max String from array =>"+maxStr);
			break;
					
		case 5:
			
			System.out.println("Enter number to find sqrt using newtons method");
			int c = sc.nextInt();
			epsilon = 1e-15;
		    System.out.println(Utility.findSqrtNewtonsMethod(c,epsilon));
			break;
			
			
		case 6:

			System.out.println("Enter number to find prime number");
			num = sc.nextInt();

			if (Utility.isPrime(num))
			{
				System.out.println("number is Prime");
			} else
			{
				System.out.println("Prime is not Prime");
			}
			break;
			
			
			
		case 7:
			System.out.println("Enter number for find factorial");
			 num = sc.nextInt();
	     	System.out.println(Utility.CalculateFactorial(num));
			break;

			
			
		case 8:
			System.out.println("finding Collinear slope and triangle");
			System.out.println("--------------------------");
			int x1,y1,x2,y2,x3,y3;
			System.out.print("x1->");
			x1=sc.nextInt();
			System.out.print("y1->");
			y1=sc.nextInt();
			System.out.print("x2->");
			x2=sc.nextInt();
			System.out.print("y2->");
			y2=sc.nextInt();
			System.out.print("x3->");
			x3=sc.nextInt();
			System.out.print("y3->");
			y3=sc.nextInt();
			System.out.println();
			
			if(Utility.chkCollinearSlope(x1, y1, x2, y2, x3, y3))
			{
				System.out.println("Points are collinear");
			}
			else
			{
				System.out.println("Points are non - collinear");
			}
				
			if(Utility.chkCollinearArea(x1, y1, x2, y2, x3, y3)) 
			{
				System.out.println("area of triangle collinear");
			}
			else
			{
				System.out.println("area of triangle are not collinear");
			}
			
		}

		 

	}

}