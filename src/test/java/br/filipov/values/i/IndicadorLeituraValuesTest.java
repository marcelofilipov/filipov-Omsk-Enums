package br.filipov.values.i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class IndicadorLeituraValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Lidos", EnumHelper.getDescricaoPorCodigo(IndicadorLeituraValues.class, 1));
		assertEquals("Pendente de Leitura", EnumHelper.getDescricaoPorCodigo(IndicadorLeituraValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorLeituraValues.LIDOS, EnumHelper.getEnumPorCodigo(1, IndicadorLeituraValues.class));
		assertEquals(IndicadorLeituraValues.PENDENTE_LEITURA, EnumHelper.getEnumPorCodigo(2, IndicadorLeituraValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Lidos",IndicadorLeituraValues.getDescricaoById((short) 1));
		assertEquals("Pendente de Leitura",IndicadorLeituraValues.getDescricaoById((short) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Lidos",IndicadorLeituraValues.getDescricaoById(1));
		assertEquals("Pendente de Leitura",IndicadorLeituraValues.getDescricaoById(2));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Lidos",IndicadorLeituraValues.getDescricaoById(1L));
		assertEquals("Pendente de Leitura",IndicadorLeituraValues.getDescricaoById(2L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Lidos",IndicadorLeituraValues.getDescricaoById((byte) 1));
		assertEquals("Pendente de Leitura",IndicadorLeituraValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorLeituraValues.LIDOS,IndicadorLeituraValues.parse(1));
		assertEquals(IndicadorLeituraValues.PENDENTE_LEITURA,IndicadorLeituraValues.parse(2));
	}
		
}
