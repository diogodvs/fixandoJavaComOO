package caminhaoMonstro;

public class CaminhaoMonstro extends Caminhao {

	public void m1() {
		System.out.println("Monstro 1");
	}
	
	public void m2() {
		super.m1();
		super.m2();
	
	}
	
	public String toString(Caminhao caminhao) {
		return "Monstro " + super.toString();
	}
}
