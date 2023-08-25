package provaCarro;

public class main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.veloMax = 200;
		carro.cor = "Preto";
		carro.marca = "Chevrolet";
		carro.modelo = "Celta";
		
		System.out.println(carro.veloMax);
		System.out.println(carro.cor);
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		
		carro.ligar();
		System.out.println(carro.ligado);
		carro.acelerar(180);
		System.out.println(carro.veloAtual);
		carro.acelerar(30);
		System.out.println(carro.veloAtual);

		carro.frear(80);
		System.out.println(carro.veloAtual);
		
		carro.frear(30);
		System.out.println(carro.veloAtual);
		
		carro.desligar();
		System.out.println(carro.ligado);
		System.out.println(carro.veloAtual);
		carro.acelerar(30);
		System.out.println(carro.veloAtual);
	}

}
