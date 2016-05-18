import java.util.Scanner;

class suma_resta{

	public static void main(String[] args){
	int num1,num2,suma,mul;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese primer numero");
	num1 = entrada.nextInt();
	System.out.println("Ingrese segundo numero");
	num2 = entrada.nextInt();
	suma = num1 + num2;
	mul = num1 * num2;
	System.out.print("La suma es: ");
	System.out.println(suma);
	System.out.print("La multiplicacion es: ");
	System.out.println(mul);
	}



}