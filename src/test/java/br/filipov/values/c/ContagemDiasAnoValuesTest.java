package br.filipov.values.c;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class ContagemDiasAnoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Todos", EnumHelper.getDescricaoPorCodigo(ContagemDiasAnoValues.class, 0));
		assertEquals("Act", EnumHelper.getDescricaoPorCodigo(ContagemDiasAnoValues.class, 1));
		assertEquals("360", EnumHelper.getDescricaoPorCodigo(ContagemDiasAnoValues.class, 2));
		assertEquals("365", EnumHelper.getDescricaoPorCodigo(ContagemDiasAnoValues.class, 3));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ContagemDiasAnoValues.TODOS, EnumHelper.getEnumPorCodigo(0, ContagemDiasAnoValues.class));
		assertEquals(ContagemDiasAnoValues.ACT, EnumHelper.getEnumPorCodigo(1, ContagemDiasAnoValues.class));
		assertEquals(ContagemDiasAnoValues.TREZENTOS_SESSENTA, EnumHelper.getEnumPorCodigo(2, ContagemDiasAnoValues.class));
		assertEquals(ContagemDiasAnoValues.TREZENTOS_SESSENTA_CINCO, EnumHelper.getEnumPorCodigo(3, ContagemDiasAnoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Todos", ContagemDiasAnoValues.getDescricaoById((short) 0));
		assertEquals("Act", ContagemDiasAnoValues.getDescricaoById((short) 1));
		assertEquals("360", ContagemDiasAnoValues.getDescricaoById((short) 2));
		assertEquals("365", ContagemDiasAnoValues.getDescricaoById((short) 3));
		
		assertNotEquals("N/A", ContagemDiasAnoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Todos", ContagemDiasAnoValues.getDescricaoById(0));
		assertEquals("Act", ContagemDiasAnoValues.getDescricaoById(1));
		assertEquals("360", ContagemDiasAnoValues.getDescricaoById(2));
		assertEquals("365", ContagemDiasAnoValues.getDescricaoById(3));
		
		assertNotEquals("N/A", ContagemDiasAnoValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Todos", ContagemDiasAnoValues.getDescricaoById(0L));
		assertEquals("Act", ContagemDiasAnoValues.getDescricaoById(1L));
		assertEquals("360", ContagemDiasAnoValues.getDescricaoById(2L));
		assertEquals("365", ContagemDiasAnoValues.getDescricaoById(3L));
		
		assertNotEquals("N/A", ContagemDiasAnoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Todos", ContagemDiasAnoValues.getDescricaoById((byte) 0));
		assertEquals("Act", ContagemDiasAnoValues.getDescricaoById((byte) 1));
		assertEquals("360", ContagemDiasAnoValues.getDescricaoById((byte) 2));
		assertEquals("365", ContagemDiasAnoValues.getDescricaoById((byte) 3));
		
		assertNotEquals("N/A", ContagemDiasAnoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testParse() {
		assertEquals(ContagemDiasAnoValues.TODOS, ContagemDiasAnoValues.parse(0));
		assertEquals(ContagemDiasAnoValues.ACT, ContagemDiasAnoValues.parse(1));
		assertEquals(ContagemDiasAnoValues.TREZENTOS_SESSENTA, ContagemDiasAnoValues.parse(2));
		assertEquals(ContagemDiasAnoValues.TREZENTOS_SESSENTA_CINCO, ContagemDiasAnoValues.parse(3));
		
		assertNotEquals(ContagemDiasAnoValues.TREZENTOS_SESSENTA_CINCO, ContagemDiasAnoValues.parse(9));

	}
	
}
