package br.filipov.values.e;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;
import br.filipov.utils.Constants;

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
		assertEquals("Solteiro", EstadoCivilValues.getDescricaoById((short) 1));
		assertEquals(Constants.CASADO + " - Comunhão Parcial", EstadoCivilValues.getDescricaoById((short) 3));
		assertEquals("Divorciado", EstadoCivilValues.getDescricaoById((short) 7));
		
		assertNotEquals("N/A", EstadoCivilValues.getDescricaoById((short) 99));
	}
	
	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Solteiro", EstadoCivilValues.getDescricaoById(1));
		assertEquals(Constants.CASADO + " - Comunhão Parcial", EstadoCivilValues.getDescricaoById(3));
		assertEquals("Divorciado", EstadoCivilValues.getDescricaoById(7));
		
		assertNotEquals("N/A", EstadoCivilValues.getDescricaoById(99));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Solteiro", EstadoCivilValues.getDescricaoById(1L));
		assertEquals(Constants.CASADO + " - Comunhão Parcial", EstadoCivilValues.getDescricaoById(3L));
		assertEquals("Divorciado", EstadoCivilValues.getDescricaoById(7L));
		
		assertNotEquals("N/A", EstadoCivilValues.getDescricaoById(99L));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Solteiro", EstadoCivilValues.getDescricaoById((byte) 1));
		assertEquals(Constants.CASADO + " - Comunhão Parcial", EstadoCivilValues.getDescricaoById((byte) 3));
		assertEquals("Divorciado", EstadoCivilValues.getDescricaoById((byte) 7));
		
		assertNotEquals("N/A", EstadoCivilValues.getDescricaoById((byte) 99));
	}
	
	@Test
	public void testParse() {
		assertEquals(EstadoCivilValues.SOLTEIRO, EstadoCivilValues.parse(1));
		assertEquals(EstadoCivilValues.CASADO_COMUNHAO_PARCIAL, EstadoCivilValues.parse(3));
		assertEquals(EstadoCivilValues.DIVORCIADO, EstadoCivilValues.parse(7));
		
		assertNotEquals(EstadoCivilValues.DIVORCIADO, EstadoCivilValues.parse(99));
	}
	
}
