package com;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		
		float d = 888f;
		
//		NumberFormat nf = NumberFormat.getInstance(Locale.JAPAN);
//		
//		System.out.println(nf.format(d));
		
		
		
//		Locale india = new Locale("en", "UK");
//		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
//		
//		System.out.println(nf.format(d));
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(567.8998));
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(76));
		
		
		
	}

}
