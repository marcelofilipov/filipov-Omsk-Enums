package br.filipov.values.i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class IntervaloComparacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Fora", EnumHelper.getDescricaoPorCodigo(IntervaloComparacaoValues.class, 0));
		assertEquals("Dentro", EnumHelper.getDescricaoPorCodigo(IntervaloComparacaoValues.class, 1));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IntervaloComparacaoValues.FORA, EnumHelper.getEnumPorCodigo(0, IntervaloComparacaoValues.class));
		assertEquals(IntervaloComparacaoValues.DENTRO, EnumHelper.getEnumPorCodigo(1, IntervaloComparacaoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Fora",IntervaloComparacaoValues.getDescricaoById((short) 0));
		assertEquals("Dentro",IntervaloComparacaoValues.getDescricaoById((short) 1));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Fora",IntervaloComparacaoValues.getDescricaoById(0));
		assertEquals("Dentro",IntervaloComparacaoValues.getDescricaoById(1));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Fora",IntervaloComparacaoValues.getDescricaoById(0L));
		assertEquals("Dentro",IntervaloComparacaoValues.getDescricaoById(1L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Fora",IntervaloComparacaoValues.getDescricaoById((byte) 0));
		assertEquals("Dentro",IntervaloComparacaoValues.getDescricaoById((byte) 1));
	}

	@Test
	public void testParse() {
		assertEquals(IntervaloComparacaoValues.DENTRO,IntervaloComparacaoValues.parse(1));
		assertEquals(IntervaloComparacaoValues.FORA,IntervaloComparacaoValues.parse(0));
	}
		
}
