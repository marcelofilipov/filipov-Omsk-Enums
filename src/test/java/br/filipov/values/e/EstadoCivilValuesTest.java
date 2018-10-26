package br.filipov.values.e;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class EstadoCivilValuesTest {

	@Test
	public void testGetDescricaoById() {
		assertEquals("Solteiro", EnumHelper.getDescricaoPorCodigo(EstadoCivilValues.class, 1));
		assertEquals("Divorciado", EnumHelper.getDescricaoPorCodigo(EstadoCivilValues.class, 7));
	}
	
	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(EstadoCivilValues.SOLTEIRO, EnumHelper.getEnumPorCodigo(1, EstadoCivilValues.class));
		assertEquals(EstadoCivilValues.DIVORCIADO, EnumHelper.getEnumPorCodigo(7, EstadoCivilValues.class));
	}
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Solteiro",EstadoCivilValues.getDescricaoById((short) 1));
		assertEquals("Divorciado",EstadoCivilValues.getDescricaoById((short) 7));
	}
	
	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Solteiro",EstadoCivilValues.getDescricaoById(1));
		assertEquals("Divorciado",EstadoCivilValues.getDescricaoById(7));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Solteiro",EstadoCivilValues.getDescricaoById(1L));
		assertEquals("Divorciado",EstadoCivilValues.getDescricaoById(7L));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Solteiro",EstadoCivilValues.getDescricaoById((byte) 1));
		assertEquals("Divorciado",EstadoCivilValues.getDescricaoById((byte) 7));
	}
	
	@Test
	public void testParse() {
		assertEquals(EstadoCivilValues.SOLTEIRO,EstadoCivilValues.parse(1));
		assertEquals(EstadoCivilValues.DIVORCIADO,EstadoCivilValues.parse(7));
	}
	
}
