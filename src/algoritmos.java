
public abstract class algoritmos {
	public static int fibonacci(int n) {
		 
        
        if (n == 0) {
            return 0;
          
        } else if (n == 1) {
            return 1;
        } else {
         
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
 
}
	 public static int calcularFactorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * calcularFactorial(n - 1);
	        }
	    }

}
