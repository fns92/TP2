package polinomios;

public class Polinomios {
	
	private int grado;
	private double [] coeficientes;
	
	
	public Polinomios(int grado, double [] vector){
		
		this.grado = grado;
		this.coeficientes = new double [this.grado+1];
		for(int i = 0; i <= this.grado ; i++){
			this.coeficientes[i] = vector[i];
		}
		
	}
	
	
	
	public double evaluarMSucesivas(double x){
		
		int potencia,resultado=0;
		for(int i = 0 ; i <= this.grado ; i++){
			potencia = 1;
			for(int j = i ; j < this.grado ; j++){
				potencia *= x;
			}
			resultado += (potencia*this.coeficientes[i]);
			
		}
		
		return resultado;
		
	}
	
	
	
	public double evaluarRecursiva(double x){
		
		double resultado = 0;
		for( int i = 0 ; i <= this.grado ; i++){
			
			resultado += potencia(x,this.grado-i) * this.coeficientes[i];
		}
		
		return resultado;
	}
	
	
	public double potencia(double x, int n){
		
		if(n == 0)
			return 1;
		return x*potencia(x,n-1);
		
	}
	
	
	public double evaluarRecursivaPar(double x){
		
		double resultado = 0;
		for(int i = 0 ; i <= this.grado ; i++){
			
			resultado += potenciaPar(x,this.grado-i) * this.coeficientes[i];
			
		}
		
		return resultado;
		
	}
	
	
	public double potenciaPar(double x, int n){
		
		if(n == 0)
			return 1;
		
		if(n % 2 == 0)
			return potencia(x*x,n/2);
		
		return x*potencia(x,n-1);
		
	}
	
	
	public double evaluarProgDinamica(double x){
		
		double resultado = 0;
		double[] potencias = new double[this.grado+1];
		potencias[this.grado] = 1;
		resultado += coeficientes[this.grado];
		for (int i = this.grado - 1 ; i >= 0 ; i--) {
			potencias[i] = x * potencias[i + 1];
			resultado += coeficientes[i] * potencias[i];
		}
		return resultado;
		
	}
	
	
	public double evaluarMejorada(double x){
		
		double resultado = 0;
		double potenciaAnterior = 1;
		resultado += coeficientes[this.grado];
		for (int i = this.grado - 1 ; i >= 0 ; i--) {
			potenciaAnterior *= x;
			resultado += coeficientes[i] * potenciaAnterior;
		}
		return resultado;
		
	}
	
	
	public double evaluarPow(double x){
		
		double resultado = 0;
		for(int i = 0 ; i <= this.grado ; i++){
			
			resultado += this.coeficientes[i] * Math.pow(x, this.grado - i);
			
		}
		return resultado;
	}
	
	
	public double evaluarHorner(double x){
		
		double resultado = 0;
		
	for(int i = 0 ; i <= this.grado ; i++){
		
		resultado = (resultado * x) + this.coeficientes[i];
		
	}
	
	return resultado;
		
	}


}
