package testeAvisao;

public class AviaoTeste {
	
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		System.out.println("Este é o modelo do aviao: " + aviao.fabricante);
		System.out.println("A velocidade do moto é: " + aviao.motor.velocidadeMotor);
		
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		
		System.out.println("A velocidade do moto é " + aviao.acelerarAviao());
		
		
		Piloto piloto = new Piloto();
		
		

		
		
		
		
		
	}

}
