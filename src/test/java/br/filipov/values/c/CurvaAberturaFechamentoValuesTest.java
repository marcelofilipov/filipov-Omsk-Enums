package br.filipov.values.c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class CurvaAberturaFechamentoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Abertura", EnumHelper.getDescricaoPorCodigo(CurvaAberturaFechamentoValues.class, 1));
		assertEquals("Fechamento", EnumHelper.getDescricaoPorCodigo(CurvaAberturaFechamentoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(CurvaAberturaFechamentoValues.ABERTA, EnumHelper.getEnumPorCodigo(1, CurvaAberturaFechamentoValues.class));
		assertEquals(CurvaAberturaFechamentoValues.FECHADA, EnumHelper.getEnumPorCodigo(2, CurvaAberturaFechamentoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Abertura",CurvaAberturaFechamentoValues.getDescricaoById((short) 1));
		assertEquals("Fechamento",CurvaAberturaFechamentoValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Abertura",CurvaAberturaFechamentoValues.getDescricaoById(1));
		assertEquals("Fechamento",CurvaAberturaFechamentoValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Abertura",CurvaAberturaFechamentoValues.getDescricaoById(1L));
		assertEquals("Fechamento",CurvaAberturaFechamentoValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Abertura",CurvaAberturaFechamentoValues.getDescricaoById((byte) 1));
		assertEquals("Fechamento",CurvaAberturaFechamentoValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(CurvaAberturaFechamentoValues.ABERTA,CurvaAberturaFechamentoValues.parse(1));
		assertEquals(CurvaAberturaFechamentoValues.FECHADA,CurvaAberturaFechamentoValues.parse(2));
	}	
	
}
