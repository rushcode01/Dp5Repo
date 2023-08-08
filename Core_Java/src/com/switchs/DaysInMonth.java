package com.switchs;
import java.util.*;
public class DaysInMonth {
 public static void main(AreaOf [] args) {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Jan \nFeb \nMar \nApr \nMay \nJun \nJul \nAug \nSep \nOct \nNov \nDec");
	 System.out.println("Enter Month:");
	 java.lang.String month = in.next();
	 
	 
	 switch(month) {
	 
	 case "Jan":
	 case "Mar":
	 case "May":
	 case "Jul":
	 case "Aud":
	 case "Oct":
	 case "Dec":
		 System.out.println("Number of Days is 31");
		 break;
	 case "Feb":
		 System.out.println("Number of Days is 28");
		 break;
	 case "Apr":
	 case "Jun":
	 case "Sep":
	 case "Nov":
		 System.out.println("Number of Days is 30");
		break;
		default: System.out.println("Enter Valid Month..!");
	 }
 }
}
