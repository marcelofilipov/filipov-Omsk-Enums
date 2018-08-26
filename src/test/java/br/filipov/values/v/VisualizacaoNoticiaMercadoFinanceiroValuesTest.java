package br.filipov.values.v;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class VisualizacaoNoticiaMercadoFinanceiroValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Painel", EnumHelper.getDescricaoPorCodigo(VisualizacaoNoticiaMercadoFinanceiroValues.class, 1));
		assertEquals("Alerta", EnumHelper.getDescricaoPorCodigo(VisualizacaoNoticiaMercadoFinanceiroValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(VisualizacaoNoticiaMercadoFinanceiroValues.PAINEL, EnumHelper.getEnumPorCodigo(1, VisualizacaoNoticiaMercadoFinanceiroValues.class));
		assertEquals(VisualizacaoNoticiaMercadoFinanceiroValues.ALERTA, EnumHelper.getEnumPorCodigo(2, VisualizacaoNoticiaMercadoFinanceiroValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Painel",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById((short) 1));
		assertEquals("Alerta",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Painel",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById(1));
		assertEquals("Alerta",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Painel",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById(1L));
		assertEquals("Alerta",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Painel",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById((byte) 1));
		assertEquals("Alerta",VisualizacaoNoticiaMercadoFinanceiroValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(VisualizacaoNoticiaMercadoFinanceiroValues.PAINEL,VisualizacaoNoticiaMercadoFinanceiroValues.parse(1));
		assertEquals(VisualizacaoNoticiaMercadoFinanceiroValues.ALERTA,VisualizacaoNoticiaMercadoFinanceiroValues.parse(2));
	}	
	
}
