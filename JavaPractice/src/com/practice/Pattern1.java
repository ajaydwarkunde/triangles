/**
 * @author HP
 * 
 * Write a program to print following pattern
 * 1
 * 22
 * 333
 * 4444
 *
 */
package com.practice;
import java.util.Scanner;
class patterns {
	int i,j,K;
	char c,d,e;
	int z=1;
	void leftsideTriangle(int x) {
		System.out.println("Normal Left Triangle is:");
		for (i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}
	void lefthalfrhombus(int x) {
		System.out.println("Left Half Rhombus is:- ");
		for(i=1;i<x+1;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
		System.out.println();
}
	for(i=x-1;i>0;i--) {
		for(int k=5;k>i;k--) {
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print(j);
	}
		System.out.println();
}

	}
	void leftsideTrianglealphabet(int x) {
		System.out.println("Normal Left Triangle is:");
		for (i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
			System.out.print((i+65)+ " ");
		}
		System.out.println();
	}
}
	void leftsideTriangleforj(int x) {
		System.out.println("Alternative Left Triangle is:");
		for (i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
			System.out.print(j+ " ");
		}
		System.out.println();
	}
}
	void Square(int x) {
		System.out.println("Normal Square is:");
	for (i = 1; i <= x; i++) {
		for (int j = 1; j <= x; j++) {
			System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}
	void Squareforj(int x) {
		System.out.println("Alternative Square is:");
	for (i = 1; i <= x; i++) {
		for (int j = 1; j <= x; j++) {
			System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
			System.out.print(j+ " ");
		}
		System.out.println();
	}
}

	void rightsideTrianglefork(int x) {
		System.out.println("Alternative right side traingle is:");
		
	for (i = 1; i <= x; i++) {
		for (int j = x; j >= i; j--) {
			System.out.print(" ");	
		}
	for (int k=1; k<=i; k++) {
	//	System.out.print(" ");
			System.out.print(k);
		}
		System.out.println();
	}
}
	void rightsideTriangle(int x) {
		System.out.println("Normal right side triangle is:");
		
	for (i = 1; i <= x; i++) {
		for (int j = x; j >= i; j--) {
			System.out.print(" ");	
		}
	for (int k=1; k<=z; k++) {
	//	System.out.print(" ");
			System.out.print(i);
		}
	z++;
		System.out.println();
	}
}

	void patternRhombus(int x) {
		System.out.println("Normal Rhombus is:");
		
	for (i = 1; i <= x; i++) {
		for (int j = x; j > i; j--) {
			System.out.print(" ");	
		}
		for (int k=1; k<=i; k++) {
			System.out.print(i+ " ");
		}
		
	System.out.println();
}

		for ( i = x-1; i >0; i--) {
			for (j = x; j > i; j--) {
			System.out.print(" ");	
		}
		for (int k=1; k<=i; k++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		}
	}
	void patternupsidedownRhombus(int x) {
		System.out.println("Normal upside down Rhombus is:");
		for ( i = x; i >0; i--) {
			for (j = x; j > i; j--) {
			System.out.print(" ");	
		}
		for (int k=1; k<=i; k++) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		}	
		for (i = 2; i <= x; i++) {
			for (int j = x; j > i; j--) {
				System.out.print(" ");	
			}
			for (int k=1; k<=i; k++) {
				System.out.print(i+ " ");
			}
			
		System.out.println();
	}

	}

	void patternRhombusfork(int x) {
		System.out.println("Alternative Rhombus is:");
		
	for (i = 1; i <= x; i++) {
		for (int j = x; j > i; j--) {
			System.out.print(" ");	
		}
		for (int k=1; k<=i; k++) {
			System.out.print(k+ " ");
		}
		
	System.out.println();
}

		for ( i = x-1; i >0; i--) {
			for (j = x; j > i; j--) {
			System.out.print(" ");	
		}
		for (int k=1; k<=i; k++) {
			System.out.print(k+" ");
		}
		
		System.out.println();
		}
	}

	void alphabetleftsideTriangle(int x) {
		System.out.println("Normal Alphabet Left side Triangle is:");
		char c;
			for (c = 'a'; c <= 'e'; c++) {
				for (char d = 'a' ; d <= c; d++) {
				//	System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
					System.out.print(c+ " ");
				}
			System.out.println();
			}
		}
	void alphabetleftsideTriangleforj(int x) {
		System.out.println("Alternative Alphabet Left side Triangle is:");
		//char c;
			for (c = 'a'; c <= 'e'; c++) {
				for(d = 'a' ; d <= c; d++) {
				//	System.out.print(" ");	
	//	}
		//for (int k=1; k<=i; k++) {
					System.out.print(d+ " ");
				}
			System.out.println();
			}
		}
	void alphabetrightsideTriangle(int x) {
		System.out.println("Normal right side triangle is:");
		
	for (c = 'a'; c <= 'e'; c++) {
		for (d = 'a'; d >= c; d--) {
			System.out.print(" ");	
		}
	for (e ='a'; e<=c; e++) {
	//	System.out.print(" ");
			System.out.print(e);
		}
		System.out.println();
	}
}
	void doublevaluerhombus(int x) {
		System.out.println("Double value rhombus:- ");
		for(i=1;i<=x;i+=2) {
			for(int k=x;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=x-2;i>=1;i-=2) {
			for(int k=x;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	}
	
	
}
public class Pattern1 {

	public static void main(String[] args) {
			Scanner abc = new Scanner(System.in);
		//	Scanner sc = new Scanner(System.in);
			patterns s = new patterns();
			System.out.println("Enter the size for Square:- ");
			int size = abc.nextInt();
		//	char ch = sc.nextChar();
		//  char ch = abc.next().charAt(0);
			s.Square(size);
			s.Squareforj(size);
			
			s.leftsideTriangle(size);
			s.leftsideTriangleforj(size);
			
			s.rightsideTriangle(size);
			s.rightsideTrianglefork(size);
				
			s.patternRhombus(size);
			s.patternRhombusfork(size);
			
			s.alphabetleftsideTriangle(size);
			s.alphabetleftsideTriangleforj(size);
			
			//s.alphabetrightsideTriangle(size);
			s.leftsideTrianglealphabet(size);
			s.lefthalfrhombus(size);
			
			s.doublevaluerhombus(size);
			s.patternupsidedownRhombus(size);
			}
}
