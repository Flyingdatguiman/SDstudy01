package com.kiosk.product;

public class Product {
//	//변수들
//	//오버로딩 : 함수이름이 같지만 매개변수의 갯수나 형만 달리해서 중복 추가하는 것.
//	
//	//생성자함수 - 그중에 매개변수 2개짜리
//	Product(int price, String name){
//		this.name = name;
//		this.price = price;
//	}
//	Product(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	Product(String name){
//		this.name = name;
//		this.price = 1000;
//	}
//	Product(){
//		
//	}
//	
//	//함수들
//	public static void main(String[] args) {
//		
//	}
	public String name;
	public int price;
	
	public Product(String xx,int yy) {
		name = xx;
		price = yy;		
	}
	
	public void info() {
		System.out.println(name+"cost :"+price+"KRW");
	}
	
}
