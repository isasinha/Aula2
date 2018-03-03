

public class Retangulo extends PoligonoReto implements Diagonal{
	
	public Retangulo (double base, double altura){
		super(base, altura);
	
	}
	
	@Override
	public double area(){
		return(base*altura);
		
	}
	
	@Override
	public double perimetro(){
		return (2*base + 2*altura);
		
	}
	
	public double diagonal(){
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
				
	}

	@Override
	public String nome() {
		return "Retangulo";
	}
	
	@Override
	public double volume(){
		return 0.0;
	}

}
