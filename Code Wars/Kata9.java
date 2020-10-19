package codeWars1;

import java.util.Arrays;

public class Kata9 {
    public static String fakeBin(String numberString) {
    	char bin;
    	char[] charArray= numberString.toCharArray();
    	for(int i=0;i<numberString.length();i++) {
    		if(numberString.charAt(i)=='6'||numberString.charAt(i)=='7'|| numberString.charAt(i)=='8'||numberString.charAt(i)=='9') {
    			bin='1';
    			charArray[i]=bin;
    		}else {
    			bin='0';
    			charArray[i]=bin;
    		}
    	}
    	numberString=Arrays.toString(charArray);
        return numberString	;
    }
}
