package com.training.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		
		int n = (int)(Math.random()*10+1);
		int m = (int)(Math.random()*10+1);
		int[][] mas = new int [n][m];
		
		//заполнение массива				
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				mas[i][j] = (int)(Math.random()*20-10);
				System.out.printf("[%3d]", mas[i][j]);
			} 
			System.out.println();
		}
		System.out.println();
		
		//выбор значения для k и вывод строки
		int k=(int)(Math.random()*10);
		while (k+1 > mas.length) {
			k = (int)(Math.random()*10);
		}
		
		System.out.println(k+1 + " строка массива");
		for(int j=0; j<mas[0].length; j++) {
			System.out.printf("[%3d]", mas[k][j]);
		}
		System.out.println();
		
		//выбор значения для p и вывод столбца
		int p=(int)(Math.random()*10);
			while (p+1 > mas[0].length) {
					p = (int)(Math.random()*10);
			}
			
		System.out.println(p+1 + " столбец массива");
		for(int i=0; i<mas.length; i++) {
			System.out.printf("[%3d]", mas[i][p]);
		} 

	}

}
