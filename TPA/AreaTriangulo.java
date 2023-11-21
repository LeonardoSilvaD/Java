package algoritmoCaderno;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		
		System.out.println("Coloque o valor da base");
		base = ler.nextDouble();
		
		System.out.println("Coloque o valor da altura");
		altura = ler.nextDouble();
		
		area = base*altura/2;
		
		System.out.println("A área do triangulo é: " + area);
	}
}