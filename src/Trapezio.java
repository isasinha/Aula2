public class Trapezio extends Poligono {
	
	double angM = 45.0, angN = 135.0, angP = 135.0, angR = 45.0;
	
	public Trapezio (double baseMaior, double baseMenor, double altura){
		super(baseMaior, baseMenor, altura);
	
	}
	
	@Override
	public double area(){
		return ((baseMaior+baseMenor)*altura)/2;
		
	}
	
	@Override
	public double perimetro(){
		return angM*angN + angN*angP + angP*angR + angR*angM;
		
	}

	@Override
	public String nome() {
		return "Trapezio";
	}
	
	@Override
	public double volume(){
		return 0.0;
	}
	
	public double diagonal(){
		return 0.0;
	}

}
