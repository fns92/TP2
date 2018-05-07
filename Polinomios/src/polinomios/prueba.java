package polinomios;

public class prueba {

	public static void main(String[] args) {
		
		double [] vector = {1,3,2};
		
		Polinomios polinomio = new Polinomios(2,vector);
		
		System.out.println(polinomio.evaluarHorner(0));

	}

}
