package codeWars1;

public class Kata6 {
    public static int areaOrPerimeter (int l, int w) {
    	if(l==w) {
        return l*w;
    	}else {
    		return (l*2)+(w*2);
    	}
    }
}
