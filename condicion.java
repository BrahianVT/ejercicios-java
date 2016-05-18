import java.util.Scanner;
class condicion{
	public static void main(String[] args){
		
		int num1,num2;
		Scanner recibir = new Scanner(System.in);
		System.out.println("Indica el numero ");
		num1 = recibir.nextInt();
		System.out.println("Indica el segundo numero");
		num2 = recibir.nextInt();
		if(num1>num2){
			System.out.println("El dato:"+ num1);
			System.out.print("es mayor");}
			else{
			System.out.println("El dato"+ num2);
			System.out.print("es mayor");}
	
	
	}


}