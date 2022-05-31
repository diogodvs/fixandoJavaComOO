package figurasGeometricas;

import java.util.Scanner;

public class FigurasGeometricas {

	private double ladoA;
	private double ladoB;
	private double altura;
	private double base;
	private double area;
	private Scanner dados;
	
	public FigurasGeometricas() {
		super();
		
		this.setDados(new Scanner(System.in));
		
	}

	public double getLadoA() {
		return ladoA;
	}
	
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

	public Scanner getDados() {
		return dados;
	}

	public void setDados(Scanner dados) {
		this.dados = dados;
	}
	
	
	
}
