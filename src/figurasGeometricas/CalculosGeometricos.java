package figurasGeometricas;

public class CalculosGeometricos extends FigurasGeometricas{
	
	public void areaQuadrado() {
		
		System.out.println("Insira o valor do lado do quadrado: ");
		setLadoA(getDados().nextDouble());
		
		setArea(getLadoA() * getLadoA());
		
		System.out.println("Area do Quadrado: " + getArea());
			
	}

	public void areaRetangulo() {
		
		System.out.println("Insira o valor do lado A do Retangulo: ");
		setLadoA(getDados().nextDouble());
		
		System.out.println("Insira o valor do lado B do Retangulo: ");
		setLadoB(getDados().nextDouble());
		
		setArea(getLadoA() * getLadoB());
		
		System.out.println("Area do Quadrado: " + getArea());
	}
	
	public void areaTriangulo() {
		
		System.out.println("Insira o valor da base do Triangulo: ");
		setBase(getDados().nextDouble());
		
		System.out.println("Insira o valor da altura do Triangulo: ");
		setAltura(getDados().nextDouble());
		
		setArea(getBase() * getAltura() / 2);
		
		System.out.println("Area do Triangulo: " + getArea());
	}
	
	public void areaCirculo() {
		
		System.out.println("Insira o raio do circulo: ");
		setLadoA(getDados().nextDouble());
		
		setArea(Math.pow(getLadoA(), 2) * Math.PI);
		
		System.out.println("Area do Circulo: " + getArea());
	}
	
}
