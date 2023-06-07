package com.kiosk.main;

import com.kiosk.product.*;
import com.kiosk.util.Cw;

public class ProcmenuBeverage {

    public static void run() {
    	
    	Cw.wn("==================================");
		Cw.wn("========      beverage     =======");
		Cw.wn("==================================");
		
    	for(Product p:KioskObj.Products) {
    		if(p instanceof Beverage) {
    			Cw.wn (p.name+" "+p.price +"KRW");
    		}
    	}
    	yy:while (true) {
    		Cw.wn("[1.coffee/2.latte/x.prev]");
    		KioskObj.cmd = KioskObj.sc.next();
    		switch(KioskObj.cmd) {
    		case"1":
    			Cw.wn(KioskObj.Products.get(0).name+" selected");
    			KioskObj.basket.add(new Order (KioskObj.Products.get(0)));
    			break;
    		case"2":
    			Cw.wn(KioskObj.Products.get(1).name+" selected");
    			KioskObj.basket.add(new Order (KioskObj.Products.get(1)));
    			break;
    		case"x":
    			Cw.wn("prev menu");
    			break yy;
    		}
    	}
}
}		