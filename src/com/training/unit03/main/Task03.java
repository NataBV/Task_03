package com.training.unit03.main;

public class Task03 {

	public static void main(String[] args) {
		// Задача 3  Дан массив действительных чисел, размерность которого N.
				//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
				int N = 10;
				int[] mas = new int[N];
				int negCount=0, posCount=0, zeroCount=0;
								
				//заполнение массива						
				for (int i = 0; i < mas.length; i++) {
					mas[i] = (int)(Math.random()*200 - 100);
					System.out.print("[" + mas[i] + "] ");
				}
				System.out.println();

				//подсчет
				for (int i = 0; i < mas.length; i++) {
					if (mas[i]>0) {
						posCount++;
					}else if (mas[i]<0) {
						negCount++;
					}else {
						zeroCount++;
					}
				}
				//вывод данных
				System.out.println("количество положительных элементов=" + posCount);
				System.out.println("количество отрицательных элементов=" + negCount);
				System.out.println("количество нулевых элементов=" + zeroCount);

			}

		}
