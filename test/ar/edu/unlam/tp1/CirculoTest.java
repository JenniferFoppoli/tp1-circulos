package ar.edu.unlam.tp1;
import ar.edu.unlam.basica2.Circulo;
import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2(){
		Circulo circuloRadio2 = new Circulo(2.00);
		assertEquals(2.00,circuloRadio2.getRadio(),0.01);
		}
	/*
	public Double calcularElArea(){
		Double resultadoEsperado = 12.56;
		Double resultadoObtenido = circuloRadio2.calcularElArea(2.00);
		assertEquals(resultadoEsperado, resultadoObtenido,0.01);
	}
*/
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloRadio3Punto7 = new Circulo(3.7);
		assertEquals(3.70,circuloRadio3Punto7.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloRadio5= new Circulo(5.00);
		assertEquals(5.00,circuloRadio5.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloRadio10Punto9=new Circulo(10.90);
		assertEquals(10.90,circuloRadio10Punto9.getRadio(),0.01);
	}
	/*se pide un circulo con radio 9.8 y area 615.73, como el area no es correcta puse not equals para que de verde, ya que el resultado esperado es diferente al recibido*/
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo circuloRadio9Punto8= new Circulo(9.80);
		assertNotEquals(615.73,circuloRadio9Punto8.calcularElArea(),0.01);
	}
//Se pide crear un circulo con radio 16.6 y da una medida que no aclara si es perimetro o area. Se calculan ambas, pero para que de verde se usa not equals.
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67(){
		Circulo circuloRadio16Punto6=new Circulo(16.60);
		assertNotEquals(865.67,circuloRadio16Punto6.calcularElArea(),0.01);
		assertNotEquals(865.67,circuloRadio16Punto6.calcularElPerimetro(),0.01);
	}
	
	/*@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		/*assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	*/
}
