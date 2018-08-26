package br.filipov.values.p;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class ProcedureReturnValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("OK", EnumHelper.getDescricaoPorCodigo(ProcedureReturnValues.class, 1));
		assertEquals("ERRO", EnumHelper.getDescricaoPorCodigo(ProcedureReturnValues.class, 0));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ProcedureReturnValues.OK, EnumHelper.getEnumPorCodigo(1, ProcedureReturnValues.class));
		assertEquals(ProcedureReturnValues.ERRO, EnumHelper.getEnumPorCodigo(0, ProcedureReturnValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("OK",ProcedureReturnValues.getDescricaoById((short) 1));
		assertEquals("ERRO",ProcedureReturnValues.getDescricaoById((short) 0));
	}
	
	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("OK",ProcedureReturnValues.getDescricaoById(1));
		assertEquals("ERRO",ProcedureReturnValues.getDescricaoById(0));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("OK",ProcedureReturnValues.getDescricaoById(1L));
		assertEquals("ERRO",ProcedureReturnValues.getDescricaoById(0L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("OK",ProcedureReturnValues.getDescricaoById((byte) 1));
		assertEquals("ERRO",ProcedureReturnValues.getDescricaoById((byte) 0));
	}

	@Test
	public void testParse() {
		assertEquals(ProcedureReturnValues.OK,ProcedureReturnValues.parse(1));
		assertEquals(ProcedureReturnValues.ERRO,ProcedureReturnValues.parse(0));
	}	
	
}
