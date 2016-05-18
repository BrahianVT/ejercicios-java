import java.util.Scanner;
class sueldo{
public static void main(String[] args){
int horas;
float costo_hora,salario;
Scanner entrada = new Scanner(System.in); 
System.out.println("Indica las horas");
horas = entrada.nextInt();
System.out.println("Indica el costo de la hora");
costo_hora = entrada.nextFloat();
salario = horas * costo_hora;
System.out.println("El total de sueldo es : " + salario);


}
}