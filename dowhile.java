import java.util.Scanner;
public class dowhile{
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	int num_cuenta=0;
	float saldo=0,saldo_total=0;
	do {
		 System.out.println("Indica numero de cuenta");
		 num_cuenta = teclado.nextInt();
		 System.out.println("Indica saldo");
		 saldo = teclado.nextFloat();
		if(saldo > 0){
			System.out.println("Cuenta :" + num_cuenta);
			System.out.println("Saldo :"+saldo);
			System.out.println("Acredor");
			saldo_total = saldo_total + saldo;
			}
		if(saldo < 0){
			System.out.println("Cuenta :" + num_cuenta);
			System.out.println("Saldo :"+saldo);
			System.out.println("Deudor");
		}
		if(saldo == 0){
			System.out.println("Cuenta :" + num_cuenta);
			System.out.println("Saldo :"+saldo);
			System.out.println("Nulo");
		}
		
	}while(num_cuenta >= 0);
	System.out.println("Total de saldo en cuentas acreedoras" + saldo_total);

	}
}	 