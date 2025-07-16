package br.com.study.testes;

import java.util.Arrays;
import java.util.List;

public class Repeticoes {

	public static void main(String[] args) {
		
		int[] arrayNumbers = {2,4,9,2,4,5};
		
		int count = 0;
		
		while(count < arrayNumbers.length) {
			System.out.println(arrayNumbers[count]);
			count++;
		}
		
		do {
			System.out.println(arrayNumbers[count]);
			count++;
		}
		while(count < arrayNumbers.length);
		
		
		for(int i = 0; i < arrayNumbers.length; i++) {
			int number = arrayNumbers[i];
			System.out.println(arrayNumbers[i]);
		}
		
		for(int number : arrayNumbers) {
			System.out.println(number);
		}
		
		List<Integer> numbersList = Arrays.asList(2,4,9,2,4,5);
		numbersList.forEach(number -> {System.out.println(number);});
	}

}
