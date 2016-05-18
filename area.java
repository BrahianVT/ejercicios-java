import java.util.Scanner;
class area{
public static void main(String[] args){
int lado,area;
Scanner entrada = new Scanner(System.in); 
System.out.println("Indicael valor del lado");
lado = entrada.nextInt();
area = lado * lado;
System.out.println("El area es : " + area);


}
}