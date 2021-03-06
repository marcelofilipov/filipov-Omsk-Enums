package br.filipov.values.c;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

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
		assertEquals("Abertura", CurvaAberturaFechamentoValues.getDescricaoById((short) 1));
		assertEquals("Fechamento", CurvaAberturaFechamentoValues.getDescricaoById((short) 2));
		
		assertNotEquals("N/A", CurvaAberturaFechamentoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Abertura", CurvaAberturaFechamentoValues.getDescricaoById(1));
		assertEquals("Fechamento", CurvaAberturaFechamentoValues.getDescricaoById(2));
		
		assertNotEquals("N/A", CurvaAberturaFechamentoValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Abertura", CurvaAberturaFechamentoValues.getDescricaoById(1L));
		assertEquals("Fechamento", CurvaAberturaFechamentoValues.getDescricaoById(2L));
		
		assertNotEquals("N/A", CurvaAberturaFechamentoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Abertura", CurvaAberturaFechamentoValues.getDescricaoById((byte) 1));
		assertEquals("Fechamento", CurvaAberturaFechamentoValues.getDescricaoById((byte) 2));
		
		assertNotEquals("N/A", CurvaAberturaFechamentoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testParse() {
		assertEquals(CurvaAberturaFechamentoValues.ABERTA, CurvaAberturaFechamentoValues.parse(1));
		assertEquals(CurvaAberturaFechamentoValues.FECHADA, CurvaAberturaFechamentoValues.parse(2));
		
		assertNotEquals(CurvaAberturaFechamentoValues.FECHADA, CurvaAberturaFechamentoValues.parse(9));
	}	
	
}
