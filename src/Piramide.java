
public class Piramide extends Solido {
	
	public Piramide (double lado, double altura){
		super(lado, altura);
	}
	
	@Override
	public double area(){
		return (Math.pow(lado,2));
		
	}
	
	@Override
	public double perimetro(){
		return (4*lado);
		
	}
	

	public double volume(){
		return (1/3)*this.area()*altura;
	}
	
	public double diagonal(){
		return lado*Math.sqrt(2);
				
	}


	@Override
	public String nome() {
		return "Piramide";
	}
}