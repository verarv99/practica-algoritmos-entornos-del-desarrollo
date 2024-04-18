package util;


public abstract class Algo {
	/**
	 * metodo para calcular el metodo fibonacci
	 * @param n
	 * @return devuelve un numero entero que es el resultado del metodo fibonacci
	 */
	public static int fibonacci(int n) {
		 
        
        if (n == 0) {
            return 0;
          
        } else if (n == 1) {
            return 1;
        } else {
         
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
 
}
	/**
	 * metodo para calcular el factorial de un numero
	 * @param n
	 * @return devuelve un numero entero que es el resultado del factorial 
	 */
	 public static int calcularFactorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * calcularFactorial(n - 1);
	        }
	    }
	 /**
	  * metodo para decir si un numero es primo o no 
	  * @param numero
	  * @return devuelve un boolean que te dice verdadero si es primo y false si no lo es
	  */
	 public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }


}
