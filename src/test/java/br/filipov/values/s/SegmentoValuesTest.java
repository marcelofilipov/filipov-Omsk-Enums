package br.filipov.values.s;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class SegmentoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Corporate", EnumHelper.getDescricaoPorCodigo(SegmentoValues.class, 1));
		assertEquals("Empresas", EnumHelper.getDescricaoPorCodigo(SegmentoValues.class, 2));
		assertEquals("Institucional", EnumHelper.getDescricaoPorCodigo(SegmentoValues.class, 3));
		assertEquals("Private", EnumHelper.getDescricaoPorCodigo(SegmentoValues.class, 4));
		assertEquals("Varejo", EnumHelper.getDescricaoPorCodigo(SegmentoValues.class, 5));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(SegmentoValues.CORPORATE, EnumHelper.getEnumPorCodigo(1, SegmentoValues.class));
		assertEquals(SegmentoValues.EMPRESAS, EnumHelper.getEnumPorCodigo(2, SegmentoValues.class));
		assertEquals(SegmentoValues.INSTITUCIONAL, EnumHelper.getEnumPorCodigo(3, SegmentoValues.class));
		assertEquals(SegmentoValues.PRIVATE, EnumHelper.getEnumPorCodigo(4, SegmentoValues.class));
		assertEquals(SegmentoValues.VAREJO, EnumHelper.getEnumPorCodigo(5, SegmentoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Corporate", SegmentoValues.getDescricaoById((short) 1));
		assertEquals("Empresas", SegmentoValues.getDescricaoById((short) 2));
		assertEquals("Institucional", SegmentoValues.getDescricaoById((short) 3));
		assertEquals("Private", SegmentoValues.getDescricaoById((short) 4));
		assertEquals("Varejo", SegmentoValues.getDescricaoById((short) 5));
		
		assertNotEquals("N/A", SegmentoValues.getDescricaoById((short) 9));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Corporate", SegmentoValues.getDescricaoById((byte) 1));
		assertEquals("Empresas", SegmentoValues.getDescricaoById((byte) 2));
		assertEquals("Institucional", SegmentoValues.getDescricaoById((byte) 3));
		assertEquals("Private", SegmentoValues.getDescricaoById((byte) 4));
		assertEquals("Varejo", SegmentoValues.getDescricaoById((byte) 5));
		
		assertNotEquals("N/A", SegmentoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Corporate", SegmentoValues.getDescricaoById(1));
		assertEquals("Empresas", SegmentoValues.getDescricaoById(2));
		assertEquals("Institucional", SegmentoValues.getDescricaoById(3));
		assertEquals("Private", SegmentoValues.getDescricaoById(4));
		assertEquals("Varejo", SegmentoValues.getDescricaoById(5));
		
		assertNotEquals("N/A", SegmentoValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Corporate", SegmentoValues.getDescricaoById(1L));
		assertEquals("Empresas", SegmentoValues.getDescricaoById(2L));
		assertEquals("Institucional", SegmentoValues.getDescricaoById(3L));
		assertEquals("Private", SegmentoValues.getDescricaoById(4L));
		assertEquals("Varejo", SegmentoValues.getDescricaoById(5L));
		
		assertNotEquals("N/A", SegmentoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(SegmentoValues.CORPORATE, SegmentoValues.parse(1));
		assertEquals(SegmentoValues.EMPRESAS, SegmentoValues.parse(2));
		assertEquals(SegmentoValues.INSTITUCIONAL, SegmentoValues.parse(3));
		assertEquals(SegmentoValues.PRIVATE, SegmentoValues.parse(4));
		assertEquals(SegmentoValues.VAREJO, SegmentoValues.parse(5));
		
		assertNotEquals(SegmentoValues.VAREJO, SegmentoValues.parse(9));
	}	
	
}
