package polinomios;

class BinomioDeNewton {
	private double lineal;
	private double indepte;
	private int grado;
	private int []coeficientes;
	
	public BinomioDeNewton(double lineal, double indepte, int grado) {
		
		this.lineal = lineal;
		this.indepte = indepte;
		this.grado = grado;	
		}
	
	public double obtenerCoeficiente(int k) {
		if (grado == 0)
			return 0;
		double valorX = 1;
		return calcularCoeficientes(k - 1, valorX);
	}

	private double calcularCoeficientes(int k, double coeficiente) { /* C(N,K) *lin^K *indpte^k-n*/
		
		double combinatoria = this.factorial(grado)/this.factorial(k)*this.factorial(this.grado-k);
		if(k % 2 != 0)
			combinatoria *= -1;
		double multiplicacionDeExp = Math.pow(this.lineal, this.grado) * Math.pow(this.indepte, (this.grado-k));
		return combinatoria * multiplicacionDeExp;
	}
	
	private int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
	
	

}
