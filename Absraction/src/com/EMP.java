package com;

import java.util.Scanner;

public class EMP {

public static void main(String[] args) {
	

	        int X,  month, day;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of days:");
	        X = s.nextInt();
	        month = X / 30;
	        X = X % 30;
	        day = X;
	        System.out.println(month+" Month "+day+" Days");
	    
	}}