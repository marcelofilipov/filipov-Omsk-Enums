package br.filipov.values.s;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class SexoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Masculino", EnumHelper.getDescricaoPorCodigo(SexoValues.class, 1));
		assertEquals("Feminino", EnumHelper.getDescricaoPorCodigo(SexoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(SexoValues.MASCULINO, EnumHelper.getEnumPorCodigo(1, SexoValues.class));
		assertEquals(SexoValues.FEMININO, EnumHelper.getEnumPorCodigo(2, SexoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Masculino", SexoValues.getDescricaoById((short) 1));
		assertEquals("Feminino", SexoValues.getDescricaoById((short) 2));
		
		assertNotEquals("N/A", SexoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Masculino", SexoValues.getDescricaoById((byte) 1));
		assertEquals("Feminino", SexoValues.getDescricaoById((byte) 2));
		
		assertNotEquals("N/A", SexoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Masculino", SexoValues.getDescricaoById(1));
		assertEquals("Feminino", SexoValues.getDescricaoById(2));
		
		assertNotEquals("N/A", SexoValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Masculino", SexoValues.getDescricaoById(1L));
		assertEquals("Feminino", SexoValues.getDescricaoById(2L));
		
		assertNotEquals("N/A", SexoValues.getDescricaoById(9L));
	}
	
	@Test
	public void testGetDescricaoBySigla() {
		assertEquals("Masculino", SexoValues.getDescricaoBySigla('M'));
		assertEquals("Feminino", SexoValues.getDescricaoBySigla('F'));
		
		assertNotEquals("N/A", SexoValues.getDescricaoBySigla('N'));
	}		

	@Test
	public void testParse() {
		assertEquals(SexoValues.MASCULINO, SexoValues.parse(1));
		assertEquals(SexoValues.FEMININO, SexoValues.parse(2));
		
		assertNotEquals(SexoValues.FEMININO, SexoValues.parse(9));
	}	
	
}
