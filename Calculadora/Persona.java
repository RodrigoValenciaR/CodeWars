package firstTest;

import java.util.Scanner;

public class Persona {
private String nombre;
private String pass;

Scanner pedir = new Scanner(System.in);

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

Persona(String mensaje1, String mensaje2){
	pedirNombre(mensaje1);
	pedirPass(mensaje2);
}

/**
 *Método usado para pedir el nombre del usuario
 *<br>
 *String mensaje: Mensaje que se muestra al usuario para pedirle el nombre
 * */
public void pedirNombre(String mensaje) {
	System.out.println(mensaje);
	nombre=pedir.nextLine();
}

/**
 * Método usado para pedir al usuario su contraseña
 * <br>
 * String mensaje: Mensaje que se muestra a la hora de pedirle al usuario su contraseña
 * */
public void pedirPass(String mensaje) {
	System.out.println(mensaje);
	pass=pedir.nextLine();
	comprobarPass();
}

/**
 * Método utilizado para comprobar los requisitos de seguridad de la contraseña
 * */
public void comprobarPass() {
	boolean seg=false;
	while(seg==false) {
	if(pass.length()>=7) {
		System.out.println("Su contraseña es segura");
		seg=true;
	}else {
		System.out.print("Su contraseña no es segura, por favor inserte una contraseña de al menos 7 dígitos de largo: ");
		pass= pedir.nextLine();
	}
	}
}

/**
 * Método utilizado para que una vez se tiene la contraseña se compruebe que se ha escrito bien esta misma
 * <br>
 * String mensaje1: Mensaje que se mostrará al usuario al la hora de pedirle la contraseña
 * */
public void verificarPass(String mensaje1) {
	String passTemp;
	System.out.println(mensaje1);
	passTemp=pedir.nextLine();
	boolean seg=false;
	while(seg==false) {
		if(passTemp.equals(getPass())) {
			System.out.println("Contraseña correcta");
			seg=true;
		}else {
			System.out.println("Contraseña incorrecta, vuelva a introducir la contraseña: ");
			passTemp= pedir.nextLine();
		}
	}
	
	
}

}
