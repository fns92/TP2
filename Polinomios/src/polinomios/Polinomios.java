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
		
		int potencia=1,resultado=0;
		
		for(int j = 0 ; j <= this.grado ; j++){
			potencia *= x;
		}
		
		for(int i = 0 ; i <= this.grado ; i++){
			resultado += ((potencia /= x)*this.coeficientes[i]);
		}
		
		return resultado;
		
	}


}
