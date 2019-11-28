package es.Studium.Dividir;
//importamos el objeto que nos permite leer por teclados
import java.util.Scanner;

public class Dividir 
{
	public static void main(String[] args) 
	{
		int numerador, denominador; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame un número");
		numerador = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame otro número");
		denominador = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado es: "+ FuncDividir(numerador, denominador));
	}
	public static double FuncDividir(int a, int b)
	{
		return (double)a/(double)b;
	}
}
