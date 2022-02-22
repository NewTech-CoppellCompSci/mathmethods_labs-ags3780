package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer ");
		int num1 = inKey.nextInt();
		System.out.println("Enter a positive intger");
		int num2 = inKey.nextInt();
		double numpow = Math.pow(num1, num2);
		System.out.println(numpow);
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer ");
		int num = inKey.nextInt();
		double numsq = Math.sqrt(num);
		System.out.println(numsq);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a  integer ");
		int sidea = inKey.nextInt();
		System.out.println("Enter a  integer ");
		int sideb = inKey.nextInt();
		int sideb2 = sideb*sideb;
		int sidea2 = sidea*sidea;
		int total = sideb2+sidea2;
	    double totalsq = Math.sqrt(total);
		System.out.println("Hypotenuse = "  + totalsq);
		
		

	}


	
	
	
		public static void problem04() {
			Scanner inKey = new Scanner(System.in);
			

			
			System.out.print("\n\nEnter an integer: "); 
			int cur = inKey.nextInt();
			int max = cur;
			int min = cur;
			
			while (cur != 0) {
				
				System.out.print("Enter an integer: "); 
				cur = inKey.nextInt();
				max = Math.max(max, cur);
				min = Math.max(min, cur);
			}
			

			System.out.printf("\nMax = %d\nMin = %d", max, min);
					

		}
	}