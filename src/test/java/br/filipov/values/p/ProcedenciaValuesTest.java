package br.filipov.values.p;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class ProcedenciaValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Nacional", EnumHelper.getDescricaoPorCodigo(ProcedenciaValues.class, 1));
		assertEquals("Internacional", EnumHelper.getDescricaoPorCodigo(ProcedenciaValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ProcedenciaValues.NACIONAL, EnumHelper.getEnumPorCodigo(1, ProcedenciaValues.class));
		assertEquals(ProcedenciaValues.INTERNACIONAL, EnumHelper.getEnumPorCodigo(2, ProcedenciaValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Nacional",ProcedenciaValues.getDescricaoById((short) 1));
		assertEquals("Internacional",ProcedenciaValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Nacional",ProcedenciaValues.getDescricaoById(1));
		assertEquals("Internacional",ProcedenciaValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Nacional",ProcedenciaValues.getDescricaoById(1L));
		assertEquals("Internacional",ProcedenciaValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Nacional",ProcedenciaValues.getDescricaoById((byte) 1));
		assertEquals("Internacional",ProcedenciaValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(ProcedenciaValues.NACIONAL,ProcedenciaValues.parse(1));
		assertEquals(ProcedenciaValues.INTERNACIONAL,ProcedenciaValues.parse(2));
	}	
	
}
