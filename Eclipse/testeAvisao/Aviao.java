package testeAvisao;

public class Aviao {
	
	String fabricante = "Embraer";
	String modelo;
	int passageiros;
	int qtdeMotores;
	Piloto piloto;
	Motor motor = new Motor();
	
	void acelerarAviao() {
		motor.velocidadeMotor += 10;
	}
	
	String nomeDono;
}
