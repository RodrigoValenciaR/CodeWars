package codeWars1;

public class Kata15 {
    public static int expressionsMatter(int a, int b, int c){
    	if(a==1&&b==1&&c==1) {
    		return a+b+c;
    	}else if(a==1 || b==1 || c==1) {
    		return((Integer.min(Integer.min(a, b),c))+(Integer.max(Integer.max(Integer.min(a,b),Integer.min(b,c)),Integer.min(a, c))))*(Integer.max(Integer.max(a, b),c));
    	}
    	return a*b*c;
    	
    }
}