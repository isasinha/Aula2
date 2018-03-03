
public class Circulo extends Figura{

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	
	@Override
	public double area() {
		return Math.PI*Math.pow(raio,2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*raio;
	}

	@Override
	public String nome() {
		return "Circulo";
	}
	
	@Override
	public double volume(){
		return 0.0;
	}
	
	public double diagonal(){
		return 0.0;
	}
	

	
	

}
