package firstTest;

public class Test1 {

	public static void main(String[] args) {
		TestMethod tm= new TestMethod("Hola, introduzca su nombre","Hola, introduzca una contrase�a con al menos 7 d�gitos");
		tm.menu("\n Men�"
				+ "\n 1. Suma"
				+ "\n 2. Resta"
				+ "\n 3. Multiplicaci�n"
				+ "\n 4. Divisi�n"
				+ "\n 5. Potencia al cuadrado"
				+ "\n 6. Potencia entre 2 n�meros"
				+ "\n 7. Raiz cuadrada"
				+ "\n Inserte en forma de n�mero la opci�n que desee, si no desea realizar ninguna acci�n inserte una letra: ",
				"\n Ha elegido la suma",
				"\n Ha elegido la resta",
				"\n Ha elegido la multiplicaci�n",
				"\n Ha elegido la divisi�n",
				"\n Ha elegido la potencia cuadrada",
				"\n Ha elegido la potencia entre dos factores", 
				"\n Ha elegido la raiz cuadrada");
	}

}			
