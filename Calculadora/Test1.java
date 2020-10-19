package firstTest;

public class Test1 {

	public static void main(String[] args) {
		TestMethod tm= new TestMethod("Hola, introduzca su nombre","Hola, introduzca una contraseña con al menos 7 dígitos");
		tm.menu("\n Menú"
				+ "\n 1. Suma"
				+ "\n 2. Resta"
				+ "\n 3. Multiplicación"
				+ "\n 4. División"
				+ "\n 5. Potencia al cuadrado"
				+ "\n 6. Potencia entre 2 números"
				+ "\n 7. Raiz cuadrada"
				+ "\n Inserte en forma de número la opción que desee, si no desea realizar ninguna acción inserte una letra: ",
				"\n Ha elegido la suma",
				"\n Ha elegido la resta",
				"\n Ha elegido la multiplicación",
				"\n Ha elegido la división",
				"\n Ha elegido la potencia cuadrada",
				"\n Ha elegido la potencia entre dos factores", 
				"\n Ha elegido la raiz cuadrada");
	}

}			
