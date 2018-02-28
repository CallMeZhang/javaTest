package com.dora.java;

/**
 * 9*9³Ë·¨¿Ú¾÷
 * @author win10
 * @version 1.0
 * 
 */
public class Multiplication {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" * "+i+" ");
				if(i==j) {
					System.out.println();
				}
			}
		}
	}
	/**
	 * 
	 */
	public static void test() {
		
	}
}
