package com.kiosk.main;

import com.kiosk.util.Cw;


public class Disp {
	
	String x = "x";
	
	final static String DOT = "=";
	final static int DOT_COUNT = 40;
	public static void line() {
		for(int i=0;i<DOT_COUNT;i=i+1) {
			System.out.print(DOT);
		}
		System.out.println();
	}
	
	public static void title() {
		line();
		dot(13);
		Cw.w("CAFE (v."+Kiosk.VERSION+")");
		dot(13);
		System.out.println();
		line();
	}
	
	public static void dot(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(DOT);
		}
}

}

