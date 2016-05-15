package ar.edu.unlam.basica2;
import static org.junit.Assert.*;

import org.junit.Test;
public class testCirculo{
	


	//como la palabra circulo se refiere al area, para crear el circulo necesito crear el area
	@Test
	public void testQueCreaelCirculo() {
		circulos circuloRadio2 = new circulos();
		Double resultadoEsperado = 12.56;
		Double resultadoObtenido = circuloRadio2.areaCirculo(2.0);
		assertEquals(resultadoEsperado, resultadoObtenido,0.01);
	}
	//calculo el perimetro para asegurarme que el circulo fue creado correctamente
	@Test
	public void testcalcularPerimetro() {
		circulos circuloRadio2=new circulos();
		Double resultadoEsperado=12.56;
		Double resultadoObtenido=circuloRadio2.perimetroCirculo(2.00);
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}
	@Test
	public void testQueCreaelCirculo2() {
		circulos circuloRadio3punto7 = new circulos();
		Double resultadoEsperado = 42.98;
		Double resultadoObtenido = circuloRadio3punto7.areaCirculo(3.70);
		assertEquals(resultadoEsperado, resultadoObtenido,0.01);
	}
		@Test
		public void testcalcularPerimetro2() {
			circulos circuloRadio3Punto7=new circulos();
			Double resultadoEsperado=23.236;
			Double resultadoObtenido=circuloRadio3Punto7.perimetroCirculo(3.7);
			assertEquals(resultadoEsperado, resultadoObtenido,0.01);
		}
		@Test
		public void testQueCreaelCirculo3() {
			circulos circuloRadio5 = new circulos();
			Double resultadoEsperado = 78.50;
			Double resultadoObtenido = circuloRadio5.areaCirculo(5.0);
			assertEquals(resultadoEsperado, resultadoObtenido,0.01);
		}
		
		@Test
		public void testcalcularPerimetro3() {
				circulos circuloRadio5=new circulos();
				Double resultadoEsperado=31.40;
				Double resultadoObtenido=circuloRadio5.perimetroCirculo(5.00);
				assertEquals(resultadoEsperado, resultadoObtenido,0.01);
				
	}
		@Test
		public void testQueCreaelCirculo4() {
			circulos circuloRadio10punto9 = new circulos();
			Double resultadoEsperado = 373.06;
			Double resultadoObtenido = circuloRadio10punto9.areaCirculo(10.9);
			assertEquals(resultadoEsperado, resultadoObtenido,0.01);
		}
		@Test
		public void testcalcularPerimetro4() {
				circulos circuloRadio10punto9=new circulos();
				Double resultadoEsperado=68.45;
				Double resultadoObtenido=circuloRadio10punto9.perimetroCirculo(10.90);
				assertEquals(resultadoEsperado, resultadoObtenido,0.01);
				
	}
		@Test
		public void testQueCreaelCirculo5() {
			circulos circuloRadio9punto8 = new circulos();
			Double resultadoEsperado = 301.56;
			Double resultadoObtenido = circuloRadio9punto8.areaCirculo(9.8);
			assertEquals(resultadoEsperado, resultadoObtenido,0.01);
		}
		@Test //como el valor de referencia es incorrecto el test da fail
		public void testcalcularPerimetro5() {
				circulos circuloRadio9punto8=new circulos();
				Double resultadoEsperado=615.73;
				Double resultadoObtenido=circuloRadio9punto8.perimetroCirculo(9.80);
				assertEquals(resultadoEsperado, resultadoObtenido,0.01);
				
	}
		@Test
		public void testQueCreaelCirculo6() {
			circulos circuloRadio16Punto6 = new circulos();
			Double resultadoEsperado = 865.25;
			Double resultadoObtenido = circuloRadio16Punto6.areaCirculo(16.6);
			assertEquals(resultadoEsperado, resultadoObtenido,0.01);
		}
		@Test
		public void testcalcularPerimetro6() {
				circulos circuloRadio16punto6=new circulos();
				Double resultadoEsperado=865.67;
				Double resultadoObtenido=circuloRadio16punto6.perimetroCirculo(16.60);
				assertEquals(resultadoEsperado, resultadoObtenido,0.01);
				
	}
}



