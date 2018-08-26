package br.filipov.values.d;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class DCDUValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Todos", EnumHelper.getDescricaoPorCodigo(DCDUValues.class, 0));
		assertEquals("DC", EnumHelper.getDescricaoPorCodigo(DCDUValues.class, 1));
		assertEquals("DU", EnumHelper.getDescricaoPorCodigo(DCDUValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(DCDUValues.TODOS, EnumHelper.getEnumPorCodigo(0, DCDUValues.class));
		assertEquals(DCDUValues.DC, EnumHelper.getEnumPorCodigo(1, DCDUValues.class));
		assertEquals(DCDUValues.DU, EnumHelper.getEnumPorCodigo(2, DCDUValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Todos",DCDUValues.getDescricaoById((short) 0));
		assertEquals("DC",DCDUValues.getDescricaoById((short) 1));
		assertEquals("DU",DCDUValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Todos",DCDUValues.getDescricaoById(0));
		assertEquals("DC",DCDUValues.getDescricaoById(1));
		assertEquals("DU",DCDUValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Todos",DCDUValues.getDescricaoById(0L));
		assertEquals("DC",DCDUValues.getDescricaoById(1L));
		assertEquals("DU",DCDUValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Todos",DCDUValues.getDescricaoById((byte) 0));
		assertEquals("DC",DCDUValues.getDescricaoById((byte) 1));
		assertEquals("DU",DCDUValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(DCDUValues.TODOS,DCDUValues.parse(0));
		assertEquals(DCDUValues.DC,DCDUValues.parse(1));
		assertEquals(DCDUValues.DU,DCDUValues.parse(2));
	}	

}
