
public class Retangulo extends Poligono{
	
	public Retangulo (int lado1, int lado2){
		super(lado1, lado2);
	
	}
	
	@Override
	public double area(){
		return(lado1*lado2);
		
	}

}
