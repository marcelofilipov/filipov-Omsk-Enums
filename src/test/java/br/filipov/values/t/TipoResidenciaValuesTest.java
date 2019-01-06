package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoResidenciaValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Própria", EnumHelper.getDescricaoPorCodigo(TipoResidenciaValues.class, 1));
		assertEquals("Alugada", EnumHelper.getDescricaoPorCodigo(TipoResidenciaValues.class, 2));
		assertEquals("Funcional", EnumHelper.getDescricaoPorCodigo(TipoResidenciaValues.class, 3));
		assertEquals("Financiada", EnumHelper.getDescricaoPorCodigo(TipoResidenciaValues.class, 4));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoResidenciaValues.PROPRIA, EnumHelper.getEnumPorCodigo(1, TipoResidenciaValues.class));
		assertEquals(TipoResidenciaValues.ALUGADA, EnumHelper.getEnumPorCodigo(2, TipoResidenciaValues.class));
		assertEquals(TipoResidenciaValues.FUNCIONAL, EnumHelper.getEnumPorCodigo(3, TipoResidenciaValues.class));
		assertEquals(TipoResidenciaValues.FINANCIADA, EnumHelper.getEnumPorCodigo(4, TipoResidenciaValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Própria", TipoResidenciaValues.getDescricaoById((short) 1));
		assertEquals("Alugada", TipoResidenciaValues.getDescricaoById((short) 2));
		assertEquals("Funcional", TipoResidenciaValues.getDescricaoById((short) 3));
		assertEquals("Financiada", TipoResidenciaValues.getDescricaoById((short) 4));
		
		assertNotEquals("N/A", TipoResidenciaValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Própria", TipoResidenciaValues.getDescricaoById((byte) 1));
		assertEquals("Alugada", TipoResidenciaValues.getDescricaoById((byte) 2));
		assertEquals("Funcional", TipoResidenciaValues.getDescricaoById((byte) 3));
		assertEquals("Financiada", TipoResidenciaValues.getDescricaoById((byte) 4));
		
		assertNotEquals("N/A", TipoResidenciaValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Própria", TipoResidenciaValues.getDescricaoById(1));
		assertEquals("Alugada", TipoResidenciaValues.getDescricaoById(2));
		assertEquals("Funcional", TipoResidenciaValues.getDescricaoById(3));
		assertEquals("Financiada", TipoResidenciaValues.getDescricaoById(4));
		
		assertNotEquals("N/A", TipoResidenciaValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Própria", TipoResidenciaValues.getDescricaoById(1L));
		assertEquals("Alugada", TipoResidenciaValues.getDescricaoById(2L));
		assertEquals("Funcional", TipoResidenciaValues.getDescricaoById(3L));
		assertEquals("Financiada", TipoResidenciaValues.getDescricaoById(4L));
		
		assertNotEquals("N/A", TipoResidenciaValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoResidenciaValues.PROPRIA, TipoResidenciaValues.parse(1));
		assertEquals(TipoResidenciaValues.ALUGADA, TipoResidenciaValues.parse(2));
		assertEquals(TipoResidenciaValues.FUNCIONAL, TipoResidenciaValues.parse(3));
		assertEquals(TipoResidenciaValues.FINANCIADA, TipoResidenciaValues.parse(4));
		
		assertNotEquals(TipoResidenciaValues.FINANCIADA, TipoResidenciaValues.parse(9));
	}	
	
}
