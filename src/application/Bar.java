package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Bar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.printf("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.printf("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.printf("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.printf("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("");

		System.out.println("RELATÓRIO: ");
		
		System.out.println("Consumo = R$ " + String.format("%.2f ", bill.feeding()));
		
		if(bill.cover() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
		System.out.println("Couvert = R$ " + String.format("%.2f", bill.cover()));
		} 
		
		System.out.println("Ingresso = R$ " + String.format("%.2f", bill.ticket()));
		
		System.out.println("");
		
		System.out.println("Valor a pagar = R$ " + String.format("%.2f", bill.total()));
		
		sc.close();
	}

}
