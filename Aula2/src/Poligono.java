
public abstract class Poligono extends Figura {
	
	double altura;
	double base;
	int lado1;
	int lado2;
	
	public Poligono (double altura, double base){
		this.altura = altura;
		this.base = base;
		
	}
	
	public Poligono (int lado1){
		this.lado1 = lado1;
			
	} 
	
	public Poligono (int lado1, int lado2){
		this.lado1 = lado1;
		this.lado2 = lado2;
			
	} 

}
