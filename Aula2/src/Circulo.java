
public class Circulo extends Figura{

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

	

}
