package br.filipov.values.e;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class EscolaridadeValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Analfabeto", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 1));
		assertEquals("Ensino Fundamental", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 2));
		assertEquals("Ensino Médio", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 3));
		assertEquals("Superior Incompleto", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 4));
		assertEquals("Superior", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 5));
		assertEquals("Pós Graduado", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 6));
		assertEquals("Mestrado", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 7));
		assertEquals("Doutorado", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 8));
		assertEquals("Superior em Andamento", EnumHelper.getDescricaoPorCodigo(EscolaridadeValues.class, 9));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(EscolaridadeValues.ANALFABETO, EnumHelper.getEnumPorCodigo(1, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.ENSINO_FUNDAMENTAL, EnumHelper.getEnumPorCodigo(2, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.ENSINO_MEDIO, EnumHelper.getEnumPorCodigo(3, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.SUPERIOR_INCOMPLETO, EnumHelper.getEnumPorCodigo(4, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.SUPERIOR, EnumHelper.getEnumPorCodigo(5, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.POS_GRADUADO, EnumHelper.getEnumPorCodigo(6, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.MESTRADO, EnumHelper.getEnumPorCodigo(7, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.DOUTORADO, EnumHelper.getEnumPorCodigo(8, EscolaridadeValues.class));
		assertEquals(EscolaridadeValues.SUPERIOR_EM_ANDAMENTO, EnumHelper.getEnumPorCodigo(9, EscolaridadeValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Analfabeto", EscolaridadeValues.getDescricaoById((short) 1));
		assertEquals("Ensino Fundamental", EscolaridadeValues.getDescricaoById((short) 2));
		assertEquals("Ensino Médio", EscolaridadeValues.getDescricaoById((short) 3));
		assertEquals("Superior Incompleto", EscolaridadeValues.getDescricaoById((short) 4));
		assertEquals("Superior", EscolaridadeValues.getDescricaoById((short) 5));
		assertEquals("Pós Graduado", EscolaridadeValues.getDescricaoById((short) 6));
		assertEquals("Mestrado", EscolaridadeValues.getDescricaoById((short) 7));
		assertEquals("Doutorado", EscolaridadeValues.getDescricaoById((short) 8));
		assertEquals("Superior em Andamento", EscolaridadeValues.getDescricaoById((short) 9));
		
		assertNotEquals("N/A", EscolaridadeValues.getDescricaoById((short) 99));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Analfabeto", EscolaridadeValues.getDescricaoById(1));
		assertEquals("Ensino Fundamental", EscolaridadeValues.getDescricaoById(2));
		assertEquals("Ensino Médio", EscolaridadeValues.getDescricaoById(3));
		assertEquals("Superior Incompleto", EscolaridadeValues.getDescricaoById(4));
		assertEquals("Superior", EscolaridadeValues.getDescricaoById(5));
		assertEquals("Pós Graduado", EscolaridadeValues.getDescricaoById(6));
		assertEquals("Mestrado", EscolaridadeValues.getDescricaoById(7));
		assertEquals("Doutorado", EscolaridadeValues.getDescricaoById(8));
		assertEquals("Superior em Andamento", EscolaridadeValues.getDescricaoById(9));
		
		assertNotEquals("N/A", EscolaridadeValues.getDescricaoById(99));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Analfabeto", EscolaridadeValues.getDescricaoById(1L));
		assertEquals("Ensino Fundamental", EscolaridadeValues.getDescricaoById(2L));
		assertEquals("Ensino Médio", EscolaridadeValues.getDescricaoById(3L));
		assertEquals("Superior Incompleto", EscolaridadeValues.getDescricaoById(4L));
		assertEquals("Superior", EscolaridadeValues.getDescricaoById(5L));
		assertEquals("Pós Graduado", EscolaridadeValues.getDescricaoById(6L));
		assertEquals("Mestrado", EscolaridadeValues.getDescricaoById(7L));
		assertEquals("Doutorado", EscolaridadeValues.getDescricaoById(8L));
		assertEquals("Superior em Andamento", EscolaridadeValues.getDescricaoById(9L));
		
		assertNotEquals("N/A", EscolaridadeValues.getDescricaoById(99L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Analfabeto", EscolaridadeValues.getDescricaoById((byte) 1));
		assertEquals("Ensino Fundamental", EscolaridadeValues.getDescricaoById((byte) 2));
		assertEquals("Ensino Médio", EscolaridadeValues.getDescricaoById((byte) 3));
		assertEquals("Superior Incompleto", EscolaridadeValues.getDescricaoById((byte) 4));
		assertEquals("Superior", EscolaridadeValues.getDescricaoById((byte) 5));
		assertEquals("Pós Graduado", EscolaridadeValues.getDescricaoById((byte) 6));
		assertEquals("Mestrado", EscolaridadeValues.getDescricaoById((byte) 7));
		assertEquals("Doutorado", EscolaridadeValues.getDescricaoById((byte) 8));
		assertEquals("Superior em Andamento", EscolaridadeValues.getDescricaoById((byte) 9));
		
		assertNotEquals("N/A", EscolaridadeValues.getDescricaoById((byte) 99));
	}

	@Test
	public void testParse() {
		assertEquals(EscolaridadeValues.ANALFABETO, EscolaridadeValues.parse(1));
		assertEquals(EscolaridadeValues.ENSINO_FUNDAMENTAL, EscolaridadeValues.parse(2));
		assertEquals(EscolaridadeValues.ENSINO_MEDIO, EscolaridadeValues.parse(3));
		assertEquals(EscolaridadeValues.SUPERIOR_INCOMPLETO, EscolaridadeValues.parse(4));
		assertEquals(EscolaridadeValues.SUPERIOR, EscolaridadeValues.parse(5));
		assertEquals(EscolaridadeValues.POS_GRADUADO, EscolaridadeValues.parse(6));
		assertEquals(EscolaridadeValues.MESTRADO, EscolaridadeValues.parse(7));
		assertEquals(EscolaridadeValues.DOUTORADO, EscolaridadeValues.parse(8));
		assertEquals(EscolaridadeValues.SUPERIOR_EM_ANDAMENTO, EscolaridadeValues.parse(9));
		
		assertNotEquals(EscolaridadeValues.SUPERIOR_EM_ANDAMENTO, EscolaridadeValues.parse(99));
	}	
	
}
