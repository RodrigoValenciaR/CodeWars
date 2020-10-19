package codeWars1;

public class Kata10 {
	public static boolean isDivisible(long n, long x, long y) {
		boolean resul;
		if(n%x==0 && n%y==0) {
			resul=true;
		}else {
			resul=false;
		}
		return resul;
	}
}
