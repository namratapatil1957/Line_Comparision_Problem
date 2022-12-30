
package com.bridzelabz.linecomparision;

public class Equality_of_Line {

		public static void main(String[] args) {
			double x1=2;
			double x2=8;
			double y1=3;
			double y2=6;
			
			double x3=2;
			double x4=8;
			double y3=3;
			double y4=6;
			
			//calculation of line length
			double line1=(((x2-x1))*((x2-x1)) + ((y2-y1))*((y2-y1)));
			double line2=(((x4-x3))*((x4-x3)) + ((y4-y3))*((y4-y3)));
			
			System.out.println(" Distance between first line is: " + line1);
			System.out.println(" Distance between second line is: " + line2);
			
			if ( line1 == line2 ) {
				System.out.println("Lines are equal");
			}
			else {
				System.out.println("Lines are not equal");
			}
		}
}
