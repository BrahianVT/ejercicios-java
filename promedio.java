import java.util.Scanner;
public class promedio{

	public static void main(String[] args){
	
		int nota1,nota2,nota3;
		float nota4;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica calificacion 1");
		nota1 = entrada.nextInt();
		System.out.println("Indica calificacion 2");
		nota2 = entrada.nextInt();
		System.out.println("Indica calificacion 3");
		nota3 = entrada.nextInt();
		nota4 = (nota1 + nota2 + nota3) / 3;
		
		if(nota4 <= 5){
			System.out.println("Has reprobado :( "+nota4);
		}
		else {
			if(nota4 >=6 && nota4 <=8){
				System.out.println("Estas regular: "+nota4);
			}
		 else {
			System.out.println("Eres pro: "+nota4);
		
		}
	} }
}