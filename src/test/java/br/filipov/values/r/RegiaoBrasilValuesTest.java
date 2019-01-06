package br.filipov.values.r;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class RegiaoBrasilValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Norte", EnumHelper.getDescricaoPorCodigo(RegiaoBrasilValues.class, 1));
		assertEquals("Nordeste", EnumHelper.getDescricaoPorCodigo(RegiaoBrasilValues.class, 2));
		assertEquals("Centro-Oeste", EnumHelper.getDescricaoPorCodigo(RegiaoBrasilValues.class, 3));
		assertEquals("Sudeste", EnumHelper.getDescricaoPorCodigo(RegiaoBrasilValues.class, 4));
		assertEquals("Sul", EnumHelper.getDescricaoPorCodigo(RegiaoBrasilValues.class, 5));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(RegiaoBrasilValues.NORTE, EnumHelper.getEnumPorCodigo(1, RegiaoBrasilValues.class));
		assertEquals(RegiaoBrasilValues.NORDESTE, EnumHelper.getEnumPorCodigo(2, RegiaoBrasilValues.class));
		assertEquals(RegiaoBrasilValues.CENTRO_OESTE, EnumHelper.getEnumPorCodigo(3, RegiaoBrasilValues.class));
		assertEquals(RegiaoBrasilValues.SUDESTE, EnumHelper.getEnumPorCodigo(4, RegiaoBrasilValues.class));
		assertEquals(RegiaoBrasilValues.SUL, EnumHelper.getEnumPorCodigo(5, RegiaoBrasilValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Norte",RegiaoBrasilValues.getDescricaoById((short) 1));
		assertEquals("Nordeste",RegiaoBrasilValues.getDescricaoById((short) 2));
		assertEquals("Centro-Oeste",RegiaoBrasilValues.getDescricaoById((short) 3));
		assertEquals("Sudeste",RegiaoBrasilValues.getDescricaoById((short) 4));
		assertEquals("Sul",RegiaoBrasilValues.getDescricaoById((short) 5));

		assertNotEquals("N/A",RegiaoBrasilValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Norte",RegiaoBrasilValues.getDescricaoById((byte) 1));
		assertEquals("Nordeste",RegiaoBrasilValues.getDescricaoById((byte) 2));
		assertEquals("Centro-Oeste",RegiaoBrasilValues.getDescricaoById((byte) 3));
		assertEquals("Sudeste",RegiaoBrasilValues.getDescricaoById((byte) 4));
		assertEquals("Sul",RegiaoBrasilValues.getDescricaoById((byte) 5));
		
		assertNotEquals("N/A",RegiaoBrasilValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Norte",RegiaoBrasilValues.getDescricaoById(1));
		assertEquals("Nordeste",RegiaoBrasilValues.getDescricaoById(2));
		assertEquals("Centro-Oeste",RegiaoBrasilValues.getDescricaoById(3));
		assertEquals("Sudeste",RegiaoBrasilValues.getDescricaoById(4));
		assertEquals("Sul",RegiaoBrasilValues.getDescricaoById(5));
		
		assertNotEquals("N/A",RegiaoBrasilValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Norte",RegiaoBrasilValues.getDescricaoById(1L));
		assertEquals("Nordeste",RegiaoBrasilValues.getDescricaoById(2L));
		assertEquals("Centro-Oeste",RegiaoBrasilValues.getDescricaoById(3L));
		assertEquals("Sudeste",RegiaoBrasilValues.getDescricaoById(4L));
		assertEquals("Sul",RegiaoBrasilValues.getDescricaoById(5L));
		
		assertNotEquals("N/A",RegiaoBrasilValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(RegiaoBrasilValues.NORTE,RegiaoBrasilValues.parse(1));
		assertEquals(RegiaoBrasilValues.NORDESTE,RegiaoBrasilValues.parse(2));
		assertEquals(RegiaoBrasilValues.CENTRO_OESTE,RegiaoBrasilValues.parse(3));
		assertEquals(RegiaoBrasilValues.SUDESTE,RegiaoBrasilValues.parse(4));
		assertEquals(RegiaoBrasilValues.SUL,RegiaoBrasilValues.parse(5));
		
		assertNotEquals(RegiaoBrasilValues.SUL,RegiaoBrasilValues.parse(9));
	}	

}
