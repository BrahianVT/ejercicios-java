import java.util.Scanner;
public class gastos{

	public static void main(String[] args){
	 int num,cont=1,sueldo=0,sueldo_100_300=0,sueldo_300_o_mas=0,total=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica total de trabajadores");
		num = teclado.nextInt();
		
		while(cont <= num){
				System.out.println("Indica el sueldo del trabajador "+cont);
				sueldo = teclado.nextInt();
				total = total + sueldo;
				if(sueldo < 300 && sueldo > 100)
				sueldo_100_300 = sueldo_100_300 + 1;
				if(sueldo >= 300)
				sueldo_300_o_mas = sueldo_300_o_mas + 1;
		cont = cont + 1;
		}
		System.out.println("Tu gasto total en sueldos es :"+total);
		System.out.println("Numero de empleados con sueldo entre 100 y 300:"+sueldo_100_300);
		System.out.println("Numero de empleados con sueldos mayor a 300:"+sueldo_300_o_mas);
	}
}