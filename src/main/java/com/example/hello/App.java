package com.example.hello;

import org.joda.time.LocalDate;
import org.joda.time.Months;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.parse("2017-07-01");
		LocalDate date2 = LocalDate.now();

		int months = Months.monthsBetween(date1, date2).getMonths();

		System.out.println("Number of months: " + months);
	}
}
