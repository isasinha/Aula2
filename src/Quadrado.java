
public class Quadrado extends PoligonoReto implements Diagonal{
	
	public Quadrado (double lado){
		super(lado);
	}
	
	@Override
	public double area(){
		return (Math.pow(lado,2));
		
	}
	
	@Override
	public double perimetro(){
		return (4*lado);
		
	}
	
	@Override
	public double volume(){
		return 0.0;
	}
	
	public double diagonal(){
		return lado*Math.sqrt(2);
	}


	@Override
	public String nome() {
		return "Quadrado";
	}
}
