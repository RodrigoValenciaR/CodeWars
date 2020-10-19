package codeWars1;

public class Kata14 {
    static Integer find(final int[] array) {
    	try {
    	for (int i=0;i<array.length;i++ ) {
    		if((array[i]+1)!=array[i+1]) {
    			return array[i+1];
    		}
    	}
        return null;
    	}catch(ArrayIndexOutOfBoundsException ex) {
    		return null;
    	}
    }
}
