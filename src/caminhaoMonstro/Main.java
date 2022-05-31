package caminhaoMonstro;

public class Main {

	public static void main(String[] args) {

		CaminhaoMonstro monstro = new CaminhaoMonstro();

		Caminhao caminhao = new Caminhao();

		monstro.m1();
		System.out.println();
		
		monstro.m2();
		System.out.println();
		
		System.out.println(monstro.toString(caminhao));

	}

}
