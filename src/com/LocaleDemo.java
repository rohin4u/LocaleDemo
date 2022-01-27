package com;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
//		String[] l = Locale.getISOCountries();
//		
//		for(String l1 : l) {
//			System.out.println(l1);
//		}
		
//		String[] l = Locale.getISOLanguages();
//		
//		for(String l1: l) {
//			System.out.println(l1);
//		}
//		
//		Locale l2 = new Locale("aa", "AD");
//		System.out.println(l2.getCountry());
//		System.out.println(l2.getDisplayLanguage());
		
//		Locale[] lo = Locale.getAvailableLocales();
//		
//		for(Locale l1 : lo) {
//			System.out.println(l1);
//		}
		
		Locale lm = new Locale("en", "NU");
		System.out.println(lm.getDisplayCountry());
		System.out.println(lm.getDisplayName());
		System.out.println(lm.getCountry());

	}

}
