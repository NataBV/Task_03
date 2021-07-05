package com.training.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// Дана последовательность чисел а1 ,а2 ,..., ап.
				//Указать наимень¬шую длину числовой оси, содержащую все эти числа.
				
				int n = 10;
				int[] mas = new int[n];
				long maxL, minL;
				long result;
						
				//заполнение массива
				Random rand = new Random();
				
				for (int i = 0; i < mas.length; i++) {
					mas[i] = rand.nextInt();
					System.out.print("[" + mas[i] + "] ");
				}
				System.out.println();
				
				//max and max
				maxL = mas[0];
				minL = mas[0];
				
				for (int i = 1; i < mas.length; i++) {
					if (maxL<mas[i]) {
						maxL=mas[i];
					}
					if (minL>mas[i]) {
						minL=mas[i];
					}
				}
				
				System.out.println("max=" + maxL);
				System.out.println("min=" + minL);
				result = maxL-minL;
				System.out.println("min length =" + result);

			}

		}
