import java.util.Scanner;

public class AlgoritmoRobo {

	public static void main(String[] args) {
		String direção;
		int x = 1, y = 3, casas = 0, potencia = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a potência do robô: ");
		potencia = entrada.nextInt();
		
		while (true) {
			System.out.println(" ");
			System.out.println(">>> O robô está no ponto X = " + x + " Y = " + y);
			System.out.println("Status da potência: " + potencia);
			System.out.println(" ");
			System.out.println("Informe a direção que deseja mover o robô: ");
			System.out.println(" C - CIMA");
			System.out.println(" B - BAIXO");
			System.out.println(" E - ESQUERDA");
			System.out.println(" D - DIREITA");
			System.out.print("Escolha: ");
			direção = entrada.next().toUpperCase();
			System.out.print("Informe o número de casas: ");
			casas = entrada.nextInt();
			
			if (potencia >= casas) {
				potencia -= casas;
			}else if (potencia > 0){
				System.out.println(">>> 😐 O robô tem apenas " + potencia + " de potência");
				continue;
			}else {
				System.out.println(">>> 😐 A Potência do robô se esgotou! Fim de linha...");
				System.exit(0);
			}

			if (direção.equals("D")){
				x += casas;
			}else if (direção.equals("E")) {
				x -= casas;
			}else if (direção.equals("C")){
				y += casas;
			}else if (direção.equals("B")){
				y -= casas;
			}else {
				System.out.println("Comando Inválido");
				continue;
			}
			
			if (y > 2 && y < 4 && x > 0 && x < 6) {
				;
			}else if (y > 2 && y < 10 && x > 4 && x < 6) {
				;
			}else if(y > 8 && y < 10 && x > 4 && x < 11) {
				;
			}else if(y > 5 && y < 10 && x > 9 && x < 11) {
				;
			}else if(y > 5 && y < 7 && x > 9 && x < 19) {
				;
			}else if(y > 5 && y < 16 && x > 17 && x < 19) {
				;
			}else {
				break;
			}
			
			if (x == 18 && y == 14) {
				System.out.println(" ");
				System.out.println(">>> 😁 Parabéns! Você completou o desafio!");
				System.out.println(">>> O robô alcançou o ponto X = " + x + ", Y = " + y);
				System.out.println(">>> Potência restatnte: " + potencia);
				System.exit(0);
			}
		}
		System.out.println("");
		System.out.println(">>> OPS! 😐 O robô bateu no ponto X = " + x + ", Y = " + y);
		System.out.println(">>> Tente novamente...");
		entrada.close();

	}

}
