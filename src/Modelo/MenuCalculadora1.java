package Modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadora1 {
	static Integer valorMenu = 0;
	static Scanner teclado = new Scanner(System.in);
	private static Float numero2;
	public static void main(String[] args) {
		Calculadora1 calculadora = new Calculadora1();
		
		while (valorMenu != 6) {
			if (valorMenu == 1) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.somar();
				chamarMenu();
			} 
			else if (valorMenu == 2) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.dividir();
				chamarMenu();
			}
			else if (valorMenu == 3) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.subtrair();
				chamarMenu();
			}
			else if (valorMenu == 4) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.multiplicar();
				chamarMenu();
			}				
			  if (valorMenu == 5) {
				System.err.println(calculadora.getResultados());
				chamarMenu();
			 }else if (valorMenu == 6) {
				System.exit(0);
			 }else {
				chamarMenu(); 		
			 }

		}
	}
	private static void chamarMenu() {
		System.err.println("-------------------");
		System.err.println("MENU");
		System.err.println("1:SOMAR");
		System.err.println("2:DIVIDIR");
		System.err.println("3:SUBTRAIR");
		System.err.println("4:MULTIPLICAR");
		System.err.println("5:IMPRIMIR");
		System.err.println("6:SAIR");
		valorMenu = teclado.nextInt();
	}
	public static Float getNumero2() {
		return numero2;
	}
	public static void setNumero2(Float numero2) {
		MenuCalculadora1.numero2 = numero2;
	}
	
}

/*
				Float numero1 = null;
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.somar();
				calculadora.dividir();
				calculadora.subtrair();
				calculadora.multiplicar();
				chamarMenu();
*/