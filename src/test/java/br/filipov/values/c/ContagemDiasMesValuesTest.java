package br.filipov.values.c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class ContagemDiasMesValuesTest {
	
	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Act", EnumHelper.getDescricaoPorCodigo(ContagemDiasMesValues.class, 0));
		assertEquals("30", EnumHelper.getDescricaoPorCodigo(ContagemDiasMesValues.class, 1));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ContagemDiasMesValues.ACT, EnumHelper.getEnumPorCodigo(0, ContagemDiasMesValues.class));
		assertEquals(ContagemDiasMesValues.TRINTA, EnumHelper.getEnumPorCodigo(1, ContagemDiasMesValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Act",ContagemDiasMesValues.getDescricaoById((short) 0));
		assertEquals("30",ContagemDiasMesValues.getDescricaoById((short) 1));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Act",ContagemDiasMesValues.getDescricaoById(0));
		assertEquals("30",ContagemDiasMesValues.getDescricaoById(1));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Act",ContagemDiasMesValues.getDescricaoById(0L));
		assertEquals("30",ContagemDiasMesValues.getDescricaoById(1L));

	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Act",ContagemDiasMesValues.getDescricaoById((byte) 0));
		assertEquals("30",ContagemDiasMesValues.getDescricaoById((byte) 1));
	}

	@Test
	public void testParse() {
		assertEquals(ContagemDiasMesValues.ACT,ContagemDiasMesValues.parse(0));
		assertEquals(ContagemDiasMesValues.TRINTA,ContagemDiasMesValues.parse(1));

	}	
	
}
