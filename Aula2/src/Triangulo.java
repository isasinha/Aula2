
public class Triangulo extends Poligono {


	
	public Triangulo (double altura, double base){
		super(altura, base);
	
	}
	
	@Override
	public double area(){
		return(altura*base)/2;
		
	}
	
}
