package com.bridzelabz.linecomparision;

public class Line {

		public static void main(String[] args) {
			double x1=2;
			double x2=4;
			double y1=3;
			double y2=6;
			
			//calculation of length
			double length= Math.sqrt((Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)));
			System.out.println(" Length of line: " + length);
		}
}
