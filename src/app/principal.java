package app;

import java.util.Random;

import util.Algo;

public class principal {

	public static void main(String[] args) {
	   
		int[] numeros = new int[5];
	        Random random = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = random.nextInt(10) + 1; // Números aleatorios del 1 al 10
	        }
	        int[] resultadosfibonacci = new int[5];
	        for (int i =0; i<numeros.length;i++) {
	        	resultadosfibonacci[i]= Algo.fibonacci(i);
	        	
	        }
	        int[] resultadosfactorial = new int[5];
	        for (int i =0; i<numeros.length;i++) {
	        	resultadosfibonacci[i]= Algo.calcularFactorial(i);
	        	
	        }
	        boolean[] resultadosprimo = new boolean[5];
	        for (int i =0; i<numeros.length;i++) {
	        
	        	resultadosprimo[i]= Algo.esPrimo(i);
	        	
	        }

	}

}
