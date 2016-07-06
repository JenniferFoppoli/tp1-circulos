package ar.edu.unlam.basica2;


public class Circulo{
	private Double radio;
	
	
	public Circulo (Double radio){
		this.radio= radio;
	}

	public Double getRadio(){
		return radio;
	}


	
	public Double calcularElArea(){
		return Math.PI*this.radio*this.radio;
	}


	public Double calcularElPerimetro(){
		
		return Math.PI*2*radio;
	}

}

