package com.training.unit03.main;

public class Task01 {

	public static void main(String[] args) {
		// Задача 1  Дана последовательность натуральных чисел а1 , а2 ,..., ап.
				//Со¬здать массив из четных чисел этой последовательности.
				//Если та¬ких чисел нет, то вывести сообщение об этом факте.
				
			int n = 10;
			int[] mas = new int[n];
			
			//заполнение массива
			int j = 0;
			for (int i = 0; i < mas.length; i++) {
				mas[i] = (int)(Math.random()*200);
				System.out.print("[" + mas[i]+ "] ");
				if (mas[i]%2 ==0) {
					j++;
				}
			}
			System.out.println();
					
			//заполнение нового массива
			if (j > 0) {
				int[] masNew = new int[j];
				for (int i = 0, k = 0 ; i < mas.length; i++) {
					if (mas[i] %2 ==0) {
						masNew[k]=mas[i];
						System.out.print("[" + masNew[k]+ "] ");
						k++;
					}
				}
			}else {
				System.out.println("Нет четных чисел");
			}
				
	}
				
}


