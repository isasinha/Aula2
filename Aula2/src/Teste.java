
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura circir = new Circulo (7.0);
		
		Poligono tri = new Triangulo (4.0, 7.0);
		
		Poligono losa = new Losango (5.0, 7.0);
		
		Poligono ret = new Retangulo (3, 7);
		
		Poligono quad = new Quadrado (2);
		
		
		
		System.out.println("A area do circulo eh " + circir.area() +
						 "\nA area do triangulo eh " + tri.area() + 
						 "\nA area do losango eh " + losa.area() + 
						 "\nA area do retangulo eh " + ret.area() +
						 "\nA area do quadrado eh " + quad.area());

	}

}
