package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoIndicadorValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Moeda", EnumHelper.getDescricaoPorCodigo(TipoIndicadorValues.class, 1));
		assertEquals("Indice", EnumHelper.getDescricaoPorCodigo(TipoIndicadorValues.class, 2));
		assertEquals("Ação", EnumHelper.getDescricaoPorCodigo(TipoIndicadorValues.class, 3));
		assertEquals("Mercadoria", EnumHelper.getDescricaoPorCodigo(TipoIndicadorValues.class, 4));
		assertEquals("Título", EnumHelper.getDescricaoPorCodigo(TipoIndicadorValues.class, 5));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoIndicadorValues.MOEDA, EnumHelper.getEnumPorCodigo(1, TipoIndicadorValues.class));
		assertEquals(TipoIndicadorValues.INDICE, EnumHelper.getEnumPorCodigo(2, TipoIndicadorValues.class));
		assertEquals(TipoIndicadorValues.ACAO, EnumHelper.getEnumPorCodigo(3, TipoIndicadorValues.class));
		assertEquals(TipoIndicadorValues.MERCADORIA, EnumHelper.getEnumPorCodigo(4, TipoIndicadorValues.class));
		assertEquals(TipoIndicadorValues.TITULO, EnumHelper.getEnumPorCodigo(5, TipoIndicadorValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Moeda", TipoIndicadorValues.getDescricaoById((short) 1));
		assertEquals("Indice", TipoIndicadorValues.getDescricaoById((short) 2));
		assertEquals("Ação", TipoIndicadorValues.getDescricaoById((short) 3));
		assertEquals("Mercadoria", TipoIndicadorValues.getDescricaoById((short) 4));
		assertEquals("Título", TipoIndicadorValues.getDescricaoById((short) 5));
		
		assertNotEquals("N/A", TipoIndicadorValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Moeda", TipoIndicadorValues.getDescricaoById((byte) 1));
		assertEquals("Indice", TipoIndicadorValues.getDescricaoById((byte) 2));
		assertEquals("Ação", TipoIndicadorValues.getDescricaoById((byte) 3));
		assertEquals("Mercadoria", TipoIndicadorValues.getDescricaoById((byte) 4));
		assertEquals("Título", TipoIndicadorValues.getDescricaoById((byte) 5));
		
		assertNotEquals("N/A", TipoIndicadorValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Moeda", TipoIndicadorValues.getDescricaoById(1));
		assertEquals("Indice", TipoIndicadorValues.getDescricaoById(2));
		assertEquals("Ação", TipoIndicadorValues.getDescricaoById(3));
		assertEquals("Mercadoria", TipoIndicadorValues.getDescricaoById(4));
		assertEquals("Título", TipoIndicadorValues.getDescricaoById(5));
		
		assertNotEquals("N/A", TipoIndicadorValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Moeda", TipoIndicadorValues.getDescricaoById(1L));
		assertEquals("Indice", TipoIndicadorValues.getDescricaoById(2L));
		assertEquals("Ação", TipoIndicadorValues.getDescricaoById(3L));
		assertEquals("Mercadoria", TipoIndicadorValues.getDescricaoById(4L));
		assertEquals("Título", TipoIndicadorValues.getDescricaoById(5L));
		
		assertNotEquals("N/A", TipoIndicadorValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoIndicadorValues.MOEDA, TipoIndicadorValues.parse(1));
		assertEquals(TipoIndicadorValues.INDICE, TipoIndicadorValues.parse(2));
		assertEquals(TipoIndicadorValues.ACAO, TipoIndicadorValues.parse(3));
		assertEquals(TipoIndicadorValues.MERCADORIA, TipoIndicadorValues.parse(4));
		assertEquals(TipoIndicadorValues.TITULO, TipoIndicadorValues.parse(5));
		
		assertNotEquals(TipoIndicadorValues.TITULO, TipoIndicadorValues.parse(9));
	}	
	
}
