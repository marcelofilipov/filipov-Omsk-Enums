package br.filipov.values.i;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class IndicadorTipoComposicaoCalculoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Fixo", EnumHelper.getDescricaoPorCodigo(IndicadorTipoComposicaoCalculoValues.class, 1));
		assertEquals("Variável", EnumHelper.getDescricaoPorCodigo(IndicadorTipoComposicaoCalculoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorTipoComposicaoCalculoValues.FIXO, EnumHelper.getEnumPorCodigo(1, IndicadorTipoComposicaoCalculoValues.class));
		assertEquals(IndicadorTipoComposicaoCalculoValues.VARIAVEL, EnumHelper.getEnumPorCodigo(2, IndicadorTipoComposicaoCalculoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Fixo",IndicadorTipoComposicaoCalculoValues.getDescricaoById((short) 1));
		assertEquals("Variável",IndicadorTipoComposicaoCalculoValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Fixo",IndicadorTipoComposicaoCalculoValues.getDescricaoById(1));
		assertEquals("Variável",IndicadorTipoComposicaoCalculoValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Fixo",IndicadorTipoComposicaoCalculoValues.getDescricaoById(1L));
		assertEquals("Variável",IndicadorTipoComposicaoCalculoValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Fixo",IndicadorTipoComposicaoCalculoValues.getDescricaoById((byte) 1));
		assertEquals("Variável",IndicadorTipoComposicaoCalculoValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorTipoComposicaoCalculoValues.FIXO,IndicadorTipoComposicaoCalculoValues.parse(1));
		assertEquals(IndicadorTipoComposicaoCalculoValues.VARIAVEL,IndicadorTipoComposicaoCalculoValues.parse(2));
	}
		
}
