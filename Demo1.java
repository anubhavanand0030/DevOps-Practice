// package com.hcl.boxing;

public class Demo1 {
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	
	public static void main(String[] args) {
		Demo1 ob=new Demo1();
		int res=ob.sum();
		System.out.println("Sum is "+res);
		res=ob.sum(73);
		System.out.println("Sum is "+res);
		res=ob.sum(73,13);
		System.out.println("Sum is "+res);
	}
}
