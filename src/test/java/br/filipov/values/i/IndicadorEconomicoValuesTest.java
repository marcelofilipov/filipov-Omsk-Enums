package br.filipov.values.i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class IndicadorEconomicoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("CDI", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 1));
		assertEquals("EUR Pronto", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 2));
		assertEquals("EUR Reuters", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 3));
		assertEquals("Pré", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 4));
		assertEquals("Selic", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 5));
		assertEquals("TR", EnumHelper.getDescricaoPorCodigo(IndicadorEconomicoValues.class, 6));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorEconomicoValues.CDI, EnumHelper.getEnumPorCodigo(1, IndicadorEconomicoValues.class));
		assertEquals(IndicadorEconomicoValues.EUR_PRONTO, EnumHelper.getEnumPorCodigo(2, IndicadorEconomicoValues.class));
		assertEquals(IndicadorEconomicoValues.EUR_REUTERS, EnumHelper.getEnumPorCodigo(3, IndicadorEconomicoValues.class));
		assertEquals(IndicadorEconomicoValues.PRE, EnumHelper.getEnumPorCodigo(4, IndicadorEconomicoValues.class));
		assertEquals(IndicadorEconomicoValues.SELIC, EnumHelper.getEnumPorCodigo(5, IndicadorEconomicoValues.class));
		assertEquals(IndicadorEconomicoValues.TR, EnumHelper.getEnumPorCodigo(6, IndicadorEconomicoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("CDI",IndicadorEconomicoValues.getDescricaoById((short) 1));
		assertEquals("EUR Pronto",IndicadorEconomicoValues.getDescricaoById((short) 2));
		assertEquals("EUR Reuters",IndicadorEconomicoValues.getDescricaoById((short) 3));
		assertEquals("Pré",IndicadorEconomicoValues.getDescricaoById((short) 4));
		assertEquals("Selic",IndicadorEconomicoValues.getDescricaoById((short) 5));
		assertEquals("TR",IndicadorEconomicoValues.getDescricaoById((short) 6));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("CDI",IndicadorEconomicoValues.getDescricaoById(1));
		assertEquals("EUR Pronto",IndicadorEconomicoValues.getDescricaoById(2));
		assertEquals("EUR Reuters",IndicadorEconomicoValues.getDescricaoById(3));
		assertEquals("Pré",IndicadorEconomicoValues.getDescricaoById(4));
		assertEquals("Selic",IndicadorEconomicoValues.getDescricaoById(5));
		assertEquals("TR",IndicadorEconomicoValues.getDescricaoById(6));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("CDI",IndicadorEconomicoValues.getDescricaoById(1L));
		assertEquals("EUR Pronto",IndicadorEconomicoValues.getDescricaoById(2L));
		assertEquals("EUR Reuters",IndicadorEconomicoValues.getDescricaoById(3L));
		assertEquals("Pré",IndicadorEconomicoValues.getDescricaoById(4L));
		assertEquals("Selic",IndicadorEconomicoValues.getDescricaoById(5L));
		assertEquals("TR",IndicadorEconomicoValues.getDescricaoById(6L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("CDI",IndicadorEconomicoValues.getDescricaoById((byte) 1));
		assertEquals("EUR Pronto",IndicadorEconomicoValues.getDescricaoById((byte) 2));
		assertEquals("EUR Reuters",IndicadorEconomicoValues.getDescricaoById((byte) 3));
		assertEquals("Pré",IndicadorEconomicoValues.getDescricaoById((byte) 4));
		assertEquals("Selic",IndicadorEconomicoValues.getDescricaoById((byte) 5));
		assertEquals("TR",IndicadorEconomicoValues.getDescricaoById((byte) 6));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorEconomicoValues.CDI,IndicadorEconomicoValues.parse(1));
		assertEquals(IndicadorEconomicoValues.EUR_PRONTO,IndicadorEconomicoValues.parse(2));
		assertEquals(IndicadorEconomicoValues.EUR_REUTERS,IndicadorEconomicoValues.parse(3));
		assertEquals(IndicadorEconomicoValues.PRE,IndicadorEconomicoValues.parse(4));
		assertEquals(IndicadorEconomicoValues.SELIC,IndicadorEconomicoValues.parse(5));
		assertEquals(IndicadorEconomicoValues.TR,IndicadorEconomicoValues.parse(6));
	}
	
}
