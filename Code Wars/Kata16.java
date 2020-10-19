package codeWars1;

public class Kata16 {
    public static int points(String[] games) {
    	String apoyo;
    	int puntostotales=0;
    	for (int i = 0; i <games.length; i++) {
    		apoyo=games[i];
    		if(apoyo.charAt(0)==apoyo.charAt(2)) {
    			puntostotales+=1;
    		}else if(apoyo.charAt(0)=='0'&& apoyo.charAt(2)=='0') {
    			puntostotales+=1;
    		}else if(apoyo.charAt(0)=='4'&& apoyo.charAt(2)=='4') {
    			puntostotales+=1;
    		}else if(apoyo.charAt(0)=='4'&&apoyo.charAt(2)!='4') {
    			puntostotales+=3;
    		}else if(apoyo.charAt(0)=='2'&& apoyo.charAt(2)=='1') {
    			puntostotales+=3;
    		}else if(apoyo.charAt(0)=='3'&& (apoyo.charAt(2)=='2'||apoyo.charAt(2)=='1')) {
    			puntostotales+=3;
    		}else if(apoyo.charAt(0)!='0'&& apoyo.charAt(2)=='0') {
    			puntostotales+=3;
    		}
    	}
    	
    	return puntostotales;
      }
}