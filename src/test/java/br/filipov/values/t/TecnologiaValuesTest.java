package br.filipov.values.t;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class TecnologiaValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("TDMA", EnumHelper.getDescricaoPorCodigo(TecnologiaValues.class, 1));
		assertEquals("GSM", EnumHelper.getDescricaoPorCodigo(TecnologiaValues.class, 2));
		assertEquals("3G", EnumHelper.getDescricaoPorCodigo(TecnologiaValues.class, 3));
		assertEquals("4G", EnumHelper.getDescricaoPorCodigo(TecnologiaValues.class, 4));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TecnologiaValues.TDMA, EnumHelper.getEnumPorCodigo(1, TecnologiaValues.class));
		assertEquals(TecnologiaValues.GSM, EnumHelper.getEnumPorCodigo(2, TecnologiaValues.class));
		assertEquals(TecnologiaValues.T3G, EnumHelper.getEnumPorCodigo(3, TecnologiaValues.class));
		assertEquals(TecnologiaValues.T4G, EnumHelper.getEnumPorCodigo(4, TecnologiaValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("TDMA",TecnologiaValues.getDescricaoById((short) 1));
		assertEquals("GSM",TecnologiaValues.getDescricaoById((short) 2));
		assertEquals("3G",TecnologiaValues.getDescricaoById((short) 3));
		assertEquals("4G",TecnologiaValues.getDescricaoById((short) 4));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("TDMA",TecnologiaValues.getDescricaoById((byte) 1));
		assertEquals("GSM",TecnologiaValues.getDescricaoById((byte) 2));
		assertEquals("3G",TecnologiaValues.getDescricaoById((byte) 3));
		assertEquals("4G",TecnologiaValues.getDescricaoById((byte) 4));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("TDMA",TecnologiaValues.getDescricaoById(1));
		assertEquals("GSM",TecnologiaValues.getDescricaoById(2));
		assertEquals("3G",TecnologiaValues.getDescricaoById(3));
		assertEquals("4G",TecnologiaValues.getDescricaoById(4));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("TDMA",TecnologiaValues.getDescricaoById(1L));
		assertEquals("GSM",TecnologiaValues.getDescricaoById(2L));
		assertEquals("3G",TecnologiaValues.getDescricaoById(3L));
		assertEquals("4G",TecnologiaValues.getDescricaoById(4L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TecnologiaValues.TDMA,TecnologiaValues.parse(1));
		assertEquals(TecnologiaValues.GSM,TecnologiaValues.parse(2));
		assertEquals(TecnologiaValues.T3G,TecnologiaValues.parse(3));
		assertEquals(TecnologiaValues.T4G,TecnologiaValues.parse(4));
	}	
	
}
