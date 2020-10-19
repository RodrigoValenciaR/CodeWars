package codeWars1;

public class Kata19 {
    public static boolean check(Object[] a, Object x) {
    	boolean respuesta = false;
        for (int i = 0; i<a.length; i++) {
        	if(a[i].equals(x)) {
        		respuesta= true;
        	}
        }
        return respuesta;
    }
}
