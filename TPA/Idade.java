package algoritmoCaderno;
import java.util.Scanner;

public class Idade {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in); //Cria o objeto Scanner (Que Vai Ler o Terminal)
		
		int anoNasc, anoAtual, idade; //Criar variáveis inteiras
		
		System.out.println("Coloque o ano de nascimento"); //Escreve o texto entre aspas no terminal
		anoNasc = ler.nextInt(); //Lê o terminal
		
		System.out.println("Coloque o ano atual"); //Escreve o texto entre aspas no terminal
		anoAtual = ler.nextInt(); //Lê o terminal
		
		idade = anoAtual - anoNasc; //Calcula a idade
		
		System.out.println("Sua idade é:" + idade); //Escreve a idade no terminal
	}
}
