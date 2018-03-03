
public class Cubo extends Solido {
	
	public Cubo (double lado, double altura){
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
		return this.area()*altura;
	}
	
	public double diagonal(){
		return lado*Math.sqrt(2);
				
	}


	@Override
	public String nome() {
		return "Cubo";
	}
}
