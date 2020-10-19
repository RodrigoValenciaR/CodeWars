package codeWars1;

public class Kata18 {
	 public static int arrayPlusArray(int[] arr1, int[] arr2) {
		    int resultado=0;
		    for (int i = 0; i< arr1.length ; i++) {
		    	resultado += arr1[i];
		    }
		    for (int o = 0 ; o<arr2.length ; o++) {
		    	resultado += arr2[o];
		    }
		    return resultado;
		  }
}
