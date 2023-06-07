package com.kiosk.main;

import com.kiosk.util.Cw;

public class Kiosk {
	public static final String VERSION = "0.0.1";

	void run() {
		KioskObj.productload();
		Disp.title();
		xx:while(true) {
			Cw.wn("order[1.Beverage/2.Dessert/e.exit]:");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				ProcmenuBeverage.run();
				break;
			case "2":
				ProcmenuDessert.run();
				break;
			case "e":
				Cw.wn("basket items:"+KioskObj.basket.size());
				int sum = 0;
				for(Order o:KioskObj.basket) {	// 향상된for문(for-each)으로 적용
					sum = sum + o.selectedProduct.price;
				}
				Cw.wn("totals :"+sum+"KRW");
				
				Cw.wn("====================");	////	산거 리스팅	////
				for(Order o:KioskObj.basket) {
					Cw.wn(o.selectedProduct.name);
				}
				Cw.wn("====================");
				Cw.wn("order complete");
				break xx;
			}
		}		
	}
}
