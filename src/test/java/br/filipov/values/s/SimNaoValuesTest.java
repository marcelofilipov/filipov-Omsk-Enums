package br.filipov.values.s;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class SimNaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Sim", EnumHelper.getDescricaoPorCodigo(SimNaoValues.class, 1));
		assertEquals("Não", EnumHelper.getDescricaoPorCodigo(SimNaoValues.class, 0));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(SimNaoValues.SIM, EnumHelper.getEnumPorCodigo(1, SimNaoValues.class));
		assertEquals(SimNaoValues.NAO, EnumHelper.getEnumPorCodigo(0, SimNaoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Não",SimNaoValues.getDescricaoById((short) 0));
		assertEquals("Sim",SimNaoValues.getDescricaoById((short) 1));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Não",SimNaoValues.getDescricaoById((byte) 0));
		assertEquals("Sim",SimNaoValues.getDescricaoById((byte) 1));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Não",SimNaoValues.getDescricaoById(0));
		assertEquals("Sim",SimNaoValues.getDescricaoById(1));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Não",SimNaoValues.getDescricaoById(0L));
		assertEquals("Sim",SimNaoValues.getDescricaoById(1L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(SimNaoValues.NAO,SimNaoValues.parse(0));
		assertEquals(SimNaoValues.SIM,SimNaoValues.parse(1));
	}	
	
}
