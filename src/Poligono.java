
public abstract class Poligono extends Figura {
	
	double base;
	double altura;
	double lado;
	double baseMaior;
	double baseMenor;
	
	
	public Poligono (double base, double altura){
		this.base = base;
		this.altura = altura;
		
	}
	
	public Poligono (double lado){
		this.lado = lado;
			
	} 
	
	public Poligono (double baseMaior, double baseMenor, double altura){
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		
	}

}
