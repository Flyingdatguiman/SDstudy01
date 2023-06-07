package com.kiosk.main;

import com.kiosk.product.*;
import com.kiosk.util.*;
public class ProcmenuDessert {

	public static void run() {
		
		Cw.wn("==================================");
		Cw.wn("========  Cake/Dessert     =======");
		Cw.wn("==================================");
		
		for(Product p:KioskObj.Products) {
			if(p instanceof Dessert) {
				Cw.wn(p.name+" "+p.price +"KRW");
			}
		}
		yy:while(true) {
			Cw.wn("[1.piece of cake/2.whole cake/3.maccaron/x.prev]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.Products.get(2).name+" selected");
				Order d = new Order(KioskObj.Products.get(2));
				KioskObj.basket.add(d);			
				break;
			case "2":
				Cw.wn(KioskObj.Products.get(3).name+" selected");
				Order d1 = new Order(KioskObj.Products.get(3));
				KioskObj.basket.add(d1);			
				break;
			case "3":
				Cw.wn(KioskObj.Products.get(4).name+" selected");
				Order d2 = new Order(KioskObj.Products.get(4));
				KioskObj.basket.add(d2);			
				break;
			case "x":
				Cw.wn("prev menu");
				break yy;
			}
		  }
	   }	
	}