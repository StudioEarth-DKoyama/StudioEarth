package main;

public class Main {


	public static void main(String[] args){

		System.out.println("メインですよテストですよ");

		Main auau = new Main();
		System.out.println(auau.MethodOne());

	}

	String MethodOne(){
		return "methodOne";
	}
}
