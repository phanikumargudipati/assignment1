problem1
package com.assignment.java;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=sc.nextInt();
		if(number>0)
			System.out.println("number is positive");
		else
			System.out.println("number is negative");
	}		

}

problem2
package com.assignment.java;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int number1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int number2 = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int number3 = sc.nextInt();
		if (number1 > number2)
			System.out.println(number1 + "is greatest");
		else if (number1 > number3)
			System.out.println(number1 + "is greatest");
		else if (number2 > number3)
			System.out.println(number2 + "is greatest");
		else if (number3 > number2)
			System.out.println(number3 + "is greatest");
		else if (number2 > number1)
			System.out.println(number2 + "is greatest");

		else
			System.out.println(number3 + "is greatest");
	}

}
problem3
package com.java.phani.problem3;
import java.util.Scanner;

public class problem3{
	public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int day = in.nextInt();
            System.out.println(getDayName(day));
	    }
	public static String getDayName(int day) {
	        String dayName = "";
	        switch (day) {
	            case 1: dayName = "Monday"; break;
	            case 2: dayName = "Tuesday"; break;
	            case 3: dayName = "Wednesday"; break;
	            case 4: dayName = "Thursday"; break;
	            case 5: dayName = "Friday"; break;
	            case 6: dayName = "Saturday"; break;
	            case 7: dayName = "Sunday"; break;
	            default:dayName = "Invalid day range";
	        }

	        return dayName;
	    }
}
problem4
package com.java.phani.problem3;

public class Problem4 {
	public static void main(String[] args) {
		int i;
		System.out.println("The first 10 natural numbers:");
		for(i=1;i<=10;i++) {
			System.out.println(i);
	}
		
	}
	}
problem5
package com.java.phani.problem3;
import java.util.Scanner;
public class Problem5 {
	public static void main(String[] args)

	{   
		 Scanner in = new Scanner(System.in);
	    int i,n=0,s=0;
		double avg;
		 System.out.println("Input the 5 numbers : ");  
			for (i=0;i<5;i++)
			{
			    n = in.nextInt();
			    
	  		s +=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
	 
	}

}
Problem6
import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ProductId:");
		int productId=sc.nextInt();
		System.out.println("Enter ProductName");
		String productName=sc.next();
		System.out.println("Enter ProductPrice:");
		double productPrice=sc.nextDouble();
		System.out.println("Enter ProductQuantity");
		int productQuantity=sc.nextInt();
		System.out.println("Enter ProductCategory:");
		String productCategory=sc.next();
		System.out.println("Enter ProductBrand:");
		String productBrand=sc.next();
		System.out.println("ProductId: " + productId + " ProductName: " + productName + " ProductPrice: " + productPrice + " ProductQuantity: " + productQuantity + " PorductCategory: " + productCategory + " ProductBrand: " + productBrand );
	}

}


 
