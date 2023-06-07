package com.kiosk.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kiosk.product.*;


public class KioskObj {
	
	public static ArrayList<Order> basket = new ArrayList<>(); 
	public static ArrayList<Product> Products = new ArrayList<>(); 
	public static Scanner sc = new Scanner(System.in); 
	public static String cmd;

public static void productload() {
	Products.add(new Beverage("coffee",2000));
	Products.add(new Beverage("latte",3000));
	Products.add(new Dessert("piece of cake",4000));
	Products.add(new Dessert("whole cake",20000));
	Products.add(new Dessert("maccaron",3000));
	}
}