package com.training.unit03.main;

public class Task05 {

	public static void main(String[] args) {
		// !!!!!! Реализовать алгоритм сортировки вставками.
		
		int n = 8;
		int[] mas = new int[n];
		
		//заполнение массива				
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int)(Math.random()*200);
			System.out.print("[" + mas[i]+ "] ");
		}
		
		System.out.println();

		// выбор элемента (от 2 до последнего)
		for (int i = 1; i < mas.length; i++) {
			int temp = mas[i];
			// сравнение с сортированными элементами
			int count = 0;
			for (int j = i; j > 0; j--) {
				// подсчет шагов до нужной ячейки
				if (temp < mas[j - 1]) {
					count++;
				}
			}
			// перезапись coртированных элментов и текущего
			for (int k = i; k > (i - count); k--) {
				mas[k] = mas[k - 1];
			}
			mas[i - count] = temp;
		}
		
		System.out.println("новый массив:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}
	}

}
