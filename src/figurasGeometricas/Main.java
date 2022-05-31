package figurasGeometricas;

public class Main {

	public static void main(String[] args) {

		CalculosGeometricos calculos = new CalculosGeometricos();

		int opcao;

		do {
			System.out.println("Qual figura geometrica deseja calcular a area? ");
			System.out.println("[ 1 - quadrado ]");
			System.out.println("[ 2 - retangulo ]");
			System.out.println("[ 3 - triangulo ]");
			System.out.println("[ 4 - circulo ]");
			System.out.println("[ 5 - encerrar ]");

			opcao = calculos.getDados().nextInt();

			switch (opcao) {
			case 1:
				calculos.areaQuadrado();
				System.out.println();
				break;

			case 2:
				calculos.areaRetangulo();
				System.out.println();
				break;

			case 3:
				calculos.areaTriangulo();
				System.out.println();
				break;

			case 4:
				calculos.areaCirculo();
				System.out.println();
				break;

			case 5:
				System.out.println("Programa Encerrado!");
				System.out.println();

			default:
				System.out.println("Opção invalida!!");
				System.out.println();

			}
		} while (opcao != 5);
	}
}
