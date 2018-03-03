import java.util.ArrayList;
import java.util.List;


public class Geometria {

	public static void main(String[] args) {

		List<Figura> formas = new ArrayList<Figura>();
		formas.add(new Circulo(7.0));
		formas.add(new Losango(5.0, 7.0));
		formas.add(new Triangulo(4.0, 7.0));
		formas.add(new Trapezio(9.0, 4.0, 7.0));
		formas.add(new Quadrado(4.0));
		formas.add(new Retangulo(3.0, 7.0));
		formas.add(new Cubo(4.0, 4.0));
		formas.add(new Piramide(4.0, 4.0));
		
		for(Figura fig:formas){
		System.out.println("A area do " + fig.nome() + " eh " + fig.area());
		System.out.println("O perimetro do " + fig.nome() + " eh " + fig.perimetro());
		if(fig instanceof PoligonoReto){
		System.out.println("A diagonal do " + fig.nome() + " eh " + fig.diagonal());
		}else{
		System.out.println("A figura " + fig.nome() + " nao possui diagonal");			
		}if(fig instanceof Solido){
		System.out.println("O volume do " + fig.nome() + " eh " + fig.volume() + "\n");
		}else{
		System.out.println("A figura " + fig.nome() + " nao possui volume\n");			
		}
		}

	}

}
