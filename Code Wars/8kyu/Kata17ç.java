package codeWars1;

public class Kata17ç {
	  public static String abbrevName(String name) {
		  boolean stop=false;
		  int cont=0;
		  String ayuda;
		  ayuda=name.toUpperCase();
		  while(stop==false) {
			  if(ayuda.charAt(cont)==' ') {
				  stop=true;
			  }
			  cont++;
		  }
		    return ayuda.charAt(0) + "."+ ayuda.charAt(cont);
		  }
}
