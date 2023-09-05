import java.util.ArrayList;
import java.util.Scanner;

public class AtividadePraticaDescomplica {

	public static void main(String[] args) {
		
		/*Sabemos que existem algumas maneiras de armazenar uma coleção de objetos e existem várias classes do Java Collections Framework, 
		 * que armazenam esses objetos, entre elas a classe ArrayList. Diante disso, desenvolva uma classe em Java que cria uma lista de 
		 * números inteiros, recebe os números digitados pelo usuário e ao final, mostra os números armazenados e a soma total desses números.
		 */
		
		
		
		// Criar um objeto Scanner para ler a entrada do usuário
		Scanner sc = new Scanner(System.in);

		// Criar um objeto ArrayList para armazenar os números inteiros
		ArrayList<Integer> list = new ArrayList<>();

		// Criar uma variável para armazenar a soma dos números
		int sum = 0;

		// Ler os números do usuário até que ele digite 0
		System.out.println("Digite os números inteiros que deseja adicionar à lista (digite 0 para terminar):");
		int number = sc.nextInt();
		while (number != 0) {
			// Adicionar o número à lista
			list.add(number);

			// Atualizar a soma com o número
			sum += number;

			// Ler o próximo número
			number = sc.nextInt();
		}

		// Fechar o objeto Scanner
		sc.close();

		// Mostrar os números armazenados na lista e a soma total
		System.out.println("Os números armazenados na lista são:");
		for (int n : list) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("A soma total dos números é: " + sum);
	}
}
