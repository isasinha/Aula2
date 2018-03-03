
public class Losango extends Poligono {
	
	public Losango (double base, double altura){
		super(base, altura);
	
	}
	
	@Override
	public double area(){
		return(altura*base);
		
	}
	
	@Override
	public double perimetro(){
		return(4*base);
		
	}

	@Override
	public String nome() {
		return "Losango";
	}
	
	@Override
	public double volume(){
		return 0.0;
	}
	
	public double diagonal(){
		return 0.0;
	}

}
