package polinomios;

public class prueba {

	public static void main(String[] args) {
		
		double [] vector = {1,3,2};
		
		Polinomios polinomio = new Polinomios(2,vector);
		
		System.out.println(polinomio.evaluarHorner(0));
		
		BinomioDeNewton bn1 = new BinomioDeNewton(1, 2, 3);
		double res = bn1.obtenerCoeficiente(2);
		System.out.println(res);
		System.out.println(bn1.resolverBinomio(1));
		bn1.toString();

	}

}
