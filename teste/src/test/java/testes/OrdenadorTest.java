package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import atividades.Ordenador;

public class OrdenadorTest {
	
	static Ordenador ordenador;
	
	@BeforeClass
	public static void instanciarOrdenador() {
		ordenador = new Ordenador();
	}		
	
	@Test
	public void inserirColecaoTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("2");
		colecao.add("5");
		colecao.add("3");
		colecao.add("1");
		colecao.add("4");
		
		ordenador.inserirColecao(colecao);
		assertTrue(colecao.size() > 0);
	}
	
	@Test
	public void getMaiorValorTest() {

		ArrayList<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("5");
		colecao.add("3");
		colecao.add("1");
		colecao.add("4");
		
		ordenador.inserirColecao(colecao);
		
		Double maiorVl = ordenador.getMaiorValor();
		assertEquals(Double.valueOf(5), maiorVl);
	}
	
	@Test
	public void getMenorValorTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("2");
		colecao.add("5");
		colecao.add("3");
		colecao.add("1");
		colecao.add("4");

		ordenador.inserirColecao(colecao);
		
		Double menorVl = ordenador.getMenorValor();
		assertEquals(Double.valueOf(1), menorVl);
	}

	@Test
	public void setValorTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("2");
		colecao.add("5");
		colecao.add("3");
		colecao.add("1");
		colecao.add("4");

		ordenador.inserirColecao(colecao);		
		ordenador.informarValor("10");
		
		Double maiorVl = ordenador.getMaiorValor();
		assertEquals(Double.valueOf(10), maiorVl);
	}
	
	@Test
	public void getValorMedioTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("20");
		colecao.add("5");
		colecao.add("73");
		colecao.add("11");
		colecao.add("19");
		ordenador.inserirColecao(colecao);
		
		Double media = ordenador.getValorMedio();
		assertEquals(Double.valueOf(25.6), media);
	}
	
	@Test
	public void getValorMedianaImparTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("20");
		colecao.add("5");
		colecao.add("73");
		colecao.add("11");
		colecao.add("19");
		ordenador.inserirColecao(colecao);

		Double medianaImpar = ordenador.getValorMediana();
		assertEquals(Double.valueOf(19), medianaImpar);
	}
	
	@Test
	public void getValorMedianaParTest() {
		ArrayList<String> colecao = new ArrayList<String>();		
		colecao.add("20");
		colecao.add("5");
		colecao.add("73");
		colecao.add("11");
		colecao.add("19");
		colecao.add("40");
		ordenador.inserirColecao(colecao);

		Double medianaPar = ordenador.getValorMediana();
		assertEquals(Double.valueOf(19.5), medianaPar);
	}
}