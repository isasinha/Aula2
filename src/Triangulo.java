
public class Triangulo extends Poligono {

	double angM = 120.0, angN = 30.0, angP = 30.0;
	
	public Triangulo (double base, double altura){
		super(base, altura);
	
	}
	
	@Override
	public double area(){
		return(altura*base)/2;
		
	}
	
	@Override
	public double perimetro(){
		return angM*angN + angN*angP + angP*angM;
		
	}

	@Override
	public String nome() {
		return "Triangulo";
	}
	
	@Override
	public double volume(){
		return 0.0;
	}
	
	public double diagonal(){
		return 0.0;
	}
	
}
