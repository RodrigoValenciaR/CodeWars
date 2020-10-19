package codeWars1;

public class Kata2 {
	 public static int nthPower(int[] array, int n) {
		 	try {
		    return (int)Math.pow(array[n], n);
		 	}catch(ArrayIndexOutOfBoundsException ex) {
		 		return -1;
		 	}
		  }
}
