package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoOscilacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Percentual", EnumHelper.getDescricaoPorCodigo(TipoOscilacaoValues.class, 1));
		assertEquals("Pontos", EnumHelper.getDescricaoPorCodigo(TipoOscilacaoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoOscilacaoValues.PERCENTUAL, EnumHelper.getEnumPorCodigo(1, TipoOscilacaoValues.class));
		assertEquals(TipoOscilacaoValues.PONTOS, EnumHelper.getEnumPorCodigo(2, TipoOscilacaoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Percentual", TipoOscilacaoValues.getDescricaoById((short) 1));
		assertEquals("Pontos", TipoOscilacaoValues.getDescricaoById((short) 2));
		
		assertNotEquals("N/A", TipoOscilacaoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Percentual", TipoOscilacaoValues.getDescricaoById((byte) 1));
		assertEquals("Pontos", TipoOscilacaoValues.getDescricaoById((byte) 2));
		
		assertNotEquals("N/A", TipoOscilacaoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Percentual", TipoOscilacaoValues.getDescricaoById(1));
		assertEquals("Pontos", TipoOscilacaoValues.getDescricaoById(2));
		
		assertNotEquals("N/A", TipoOscilacaoValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Percentual", TipoOscilacaoValues.getDescricaoById(1L));
		assertEquals("Pontos", TipoOscilacaoValues.getDescricaoById(2L));
		
		assertNotEquals("N/A", TipoOscilacaoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoOscilacaoValues.PERCENTUAL, TipoOscilacaoValues.parse(1));
		assertEquals(TipoOscilacaoValues.PONTOS, TipoOscilacaoValues.parse(2));
		
		assertNotEquals(TipoOscilacaoValues.PONTOS, TipoOscilacaoValues.parse(9));
	}	
	
}
