package com.training.unit03.main;

public class Task07 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на
		//диагонали.
		
		int n = (int)(Math.random()*10+1);
		int[][] mas = new int [n][n];
		
		//заполнение массива и вывод элементов			
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			mas[i][j] = (int)(Math.random()*20-10);
				if (i == j) {
					System.out.printf("[%3d]", mas[i][j]);
				} else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
		
	}

}
