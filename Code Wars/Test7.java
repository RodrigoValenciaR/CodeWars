package codeWars1;

public class Test7 {
    public static String repeatStr(final int repeat, final String string) {
    	String Concat="";
        for (int i = 0;i<repeat;i++) {
        	Concat +=string;
        }
        return Concat;
    }
}
