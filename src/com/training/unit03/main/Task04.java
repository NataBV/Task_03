package com.training.unit03.main;

public class Task04 {

	public static void main(String[] args) {
		// Реализовать сортировки выбором или пузырьком по убыванию.
		
		int n = 10;
		int[] mas = new int[n];
		
		//заполнение массива				
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int)(Math.random()*200);
			System.out.print("[" + mas[i]+ "] ");
		}
		
		//сортировка и перезаполнение				
		boolean check = false;
		while(!check) {
			check = true; 
			for (int i = mas.length-1; i > 0; i--) {
				if (mas[i]>mas[i-1]) {
					int temp = mas[i];
					mas[i] = mas[i-1];
					mas[i-1] = temp;
					check = false;
				}
			}
		}
		System.out.println("  -исходный массив");
		
		//вывод отсортированного массива			
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i]+ "] ");
		}
		System.out.println("  -новый массив");
		
	}

}
