package br.filipov.values.i;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class IndicadorTipoCalculoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Linear", EnumHelper.getDescricaoPorCodigo(IndicadorTipoCalculoValues.class, 1));
		assertEquals("Exponencial", EnumHelper.getDescricaoPorCodigo(IndicadorTipoCalculoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorTipoCalculoValues.LINEAR, EnumHelper.getEnumPorCodigo(1, IndicadorTipoCalculoValues.class));
		assertEquals(IndicadorTipoCalculoValues.EXPONENCIAL, EnumHelper.getEnumPorCodigo(2, IndicadorTipoCalculoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Linear",IndicadorTipoCalculoValues.getDescricaoById((short) 1));
		assertEquals("Exponencial",IndicadorTipoCalculoValues.getDescricaoById((short) 2));
	}
	
	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Linear",IndicadorTipoCalculoValues.getDescricaoById(1));
		assertEquals("Exponencial",IndicadorTipoCalculoValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Linear",IndicadorTipoCalculoValues.getDescricaoById(1L));
		assertEquals("Exponencial",IndicadorTipoCalculoValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Linear",IndicadorTipoCalculoValues.getDescricaoById((byte) 1));
		assertEquals("Exponencial",IndicadorTipoCalculoValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorTipoCalculoValues.LINEAR,IndicadorTipoCalculoValues.parse(1));
		assertEquals(IndicadorTipoCalculoValues.EXPONENCIAL,IndicadorTipoCalculoValues.parse(2));
	}
		
}
