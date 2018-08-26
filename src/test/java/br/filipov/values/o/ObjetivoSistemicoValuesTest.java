package br.filipov.values.o;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class ObjetivoSistemicoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("MTM", EnumHelper.getDescricaoPorCodigo(ObjetivoSistemicoValues.class, 1));
		assertEquals("Abertura", EnumHelper.getDescricaoPorCodigo(ObjetivoSistemicoValues.class, 2));
		assertEquals("Realtime", EnumHelper.getDescricaoPorCodigo(ObjetivoSistemicoValues.class, 3));
		assertEquals("Precificação", EnumHelper.getDescricaoPorCodigo(ObjetivoSistemicoValues.class, 4));
		assertEquals("Simulação", EnumHelper.getDescricaoPorCodigo(ObjetivoSistemicoValues.class, 5));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ObjetivoSistemicoValues.MTM, EnumHelper.getEnumPorCodigo(1, ObjetivoSistemicoValues.class));
		assertEquals(ObjetivoSistemicoValues.ABERTURA, EnumHelper.getEnumPorCodigo(2, ObjetivoSistemicoValues.class));
		assertEquals(ObjetivoSistemicoValues.REALTIME, EnumHelper.getEnumPorCodigo(3, ObjetivoSistemicoValues.class));
		assertEquals(ObjetivoSistemicoValues.PRECIFICACAO, EnumHelper.getEnumPorCodigo(4, ObjetivoSistemicoValues.class));
		assertEquals(ObjetivoSistemicoValues.SIMULACAO, EnumHelper.getEnumPorCodigo(5, ObjetivoSistemicoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("MTM",ObjetivoSistemicoValues.getDescricaoById((short) 1));
		assertEquals("Abertura",ObjetivoSistemicoValues.getDescricaoById((short) 2));
		assertEquals("Realtime",ObjetivoSistemicoValues.getDescricaoById((short) 3));
		assertEquals("Precificação",ObjetivoSistemicoValues.getDescricaoById((short) 4));
		assertEquals("Simulação",ObjetivoSistemicoValues.getDescricaoById((short) 5));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("MTM",ObjetivoSistemicoValues.getDescricaoById(1));
		assertEquals("Abertura",ObjetivoSistemicoValues.getDescricaoById(2));
		assertEquals("Realtime",ObjetivoSistemicoValues.getDescricaoById(3));
		assertEquals("Precificação",ObjetivoSistemicoValues.getDescricaoById(4));
		assertEquals("Simulação",ObjetivoSistemicoValues.getDescricaoById(5));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("MTM",ObjetivoSistemicoValues.getDescricaoById(1L));
		assertEquals("Abertura",ObjetivoSistemicoValues.getDescricaoById(2L));
		assertEquals("Realtime",ObjetivoSistemicoValues.getDescricaoById(3L));
		assertEquals("Precificação",ObjetivoSistemicoValues.getDescricaoById(4L));
		assertEquals("Simulação",ObjetivoSistemicoValues.getDescricaoById(5L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("MTM",ObjetivoSistemicoValues.getDescricaoById((byte) 1));
		assertEquals("Abertura",ObjetivoSistemicoValues.getDescricaoById((byte) 2));
		assertEquals("Realtime",ObjetivoSistemicoValues.getDescricaoById((byte) 3));
		assertEquals("Precificação",ObjetivoSistemicoValues.getDescricaoById((byte) 4));
		assertEquals("Simulação",ObjetivoSistemicoValues.getDescricaoById((byte) 5));
	}

	@Test
	public void testParse() {
		assertEquals(ObjetivoSistemicoValues.MTM,ObjetivoSistemicoValues.parse(1));
		assertEquals(ObjetivoSistemicoValues.ABERTURA,ObjetivoSistemicoValues.parse(2));
		assertEquals(ObjetivoSistemicoValues.REALTIME,ObjetivoSistemicoValues.parse(3));
		assertEquals(ObjetivoSistemicoValues.PRECIFICACAO,ObjetivoSistemicoValues.parse(4));
		assertEquals(ObjetivoSistemicoValues.SIMULACAO,ObjetivoSistemicoValues.parse(5));
	}	
	
}
