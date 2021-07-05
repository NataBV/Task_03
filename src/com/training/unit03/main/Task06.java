package com.training.unit03.main;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов. Определить, сколько раз
		// встречается число 7 среди элементов массива.
		
		Random rand = new Random(10);
		int n = (int)(Math.random()*10+1);
		int m = (int)(Math.random()*10+1);
		int[][] mas = new int [n][m];
		
		//заполнение массива				
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		//подсчет количества (можно добавить условием в заполнении)			
		int count = 0;
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.print(count + ": 7ок встретилось в массиве");
		
	}
}

