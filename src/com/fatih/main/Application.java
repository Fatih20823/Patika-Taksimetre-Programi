package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int gidilenKM,acilisUcreti=10;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gidilen kilometre giriniz: ");
		gidilenKM = scan.nextInt();
		
		double kilometreBasina = 2.20;
		double taksimetreTutar = kilometreBasina*gidilenKM;
			
		if (taksimetreTutar<=20) {
			System.out.println("Taksimetre Tutar: 20 TL ");
		}else if (taksimetreTutar>20) {
			System.out.println("Taksimetre Tutar: "+(taksimetreTutar+acilisUcreti));
		}
	}

}
