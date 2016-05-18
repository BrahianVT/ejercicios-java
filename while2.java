import java.util.Scanner;
public class while2{

	public static void main(String[] args){
	 int num,cont=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica un numero");
		num = teclado.nextInt();
		
		while( cont <= num){
			System.out.print(cont);
			System.out.println("-");
			cont = cont + 1;
		
		
		}
	}
}