package com.training.unit03.main;

public class Task09 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n -
		//четное):
		
		int n = (int)(Math.random()*10+1);
		if (n%2 != 0) {
			n++;
		}
		int[][] mas = new int [n][n];
		
		//заполнение массива				
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				if (i == ((n-1)-j)) {
					mas[i][j] = i+1;
					System.out.printf("[%3d]", mas[i][j]);
				} else {
					System.out.printf("[%3d]", mas[i][j]);
				}
			} 
			System.out.println();
		}
		
	}

}
