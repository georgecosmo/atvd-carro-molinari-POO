package provaCarro;

public class Carro {
	int veloAtual;
	int veloMax;
	String cor;
	String marca;
	String modelo;
	boolean ligado = false;
	
	void ligar() {
		this.ligado = true;
	}
	
	boolean acelerar(int velocidade) {
		
		if(this.ligado == true && velocidade <= this.veloMax) {
			this.veloAtual += velocidade;
		
			if(this.veloAtual > this.veloMax) {
				this.veloAtual = this.veloMax;
			}
			
			return true;
		}else {
			return false;
		}
	}
	
	void frear(int veloFreio) {
		if(veloFreio >= 0) {
			this.veloAtual -= veloFreio;
			
			if(this.veloAtual < 0) {
				this.veloAtual = 0;
			}
		}
				
	}
	
	void desligar() {
		this.ligado = false;
		this.veloAtual = 0;
	}
	
	
}
