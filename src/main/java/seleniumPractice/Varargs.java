package seleniumPractice;

public class Varargs {

	  public static void main(String[] args) {
	        printNumbers(1, 2, 3);
	        printNumbers(10, 20, 30, 40);
	        printNumbers(1,2,3,4);
	    }
	

		    public static void printNumbers(int... numbers) {
		        for (int num : numbers) {
		            System.out.println(num);
		        }
		    }

		
		
		
		
		

	}


