package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoOperadorValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Distribuição", EnumHelper.getDescricaoPorCodigo(TipoOperadorValues.class, 1));
		assertEquals("Mesa", EnumHelper.getDescricaoPorCodigo(TipoOperadorValues.class, 2));
		assertEquals("Operação", EnumHelper.getDescricaoPorCodigo(TipoOperadorValues.class, 3));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoOperadorValues.DISTRIBUICAO, EnumHelper.getEnumPorCodigo(1, TipoOperadorValues.class));
		assertEquals(TipoOperadorValues.MESA, EnumHelper.getEnumPorCodigo(2, TipoOperadorValues.class));
		assertEquals(TipoOperadorValues.OPERACAO, EnumHelper.getEnumPorCodigo(3, TipoOperadorValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Distribuição",TipoOperadorValues.getDescricaoById((short) 1));
		assertEquals("Mesa",TipoOperadorValues.getDescricaoById((short) 2));
		assertEquals("Operação",TipoOperadorValues.getDescricaoById((short) 3));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Distribuição",TipoOperadorValues.getDescricaoById((byte) 1));
		assertEquals("Mesa",TipoOperadorValues.getDescricaoById((byte) 2));
		assertEquals("Operação",TipoOperadorValues.getDescricaoById((byte) 3));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Distribuição",TipoOperadorValues.getDescricaoById(1));
		assertEquals("Mesa",TipoOperadorValues.getDescricaoById(2));
		assertEquals("Operação",TipoOperadorValues.getDescricaoById(3));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Distribuição",TipoOperadorValues.getDescricaoById(1L));
		assertEquals("Mesa",TipoOperadorValues.getDescricaoById(2L));
		assertEquals("Operação",TipoOperadorValues.getDescricaoById(3L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoOperadorValues.DISTRIBUICAO,TipoOperadorValues.parse(1));
		assertEquals(TipoOperadorValues.MESA,TipoOperadorValues.parse(2));
		assertEquals(TipoOperadorValues.OPERACAO,TipoOperadorValues.parse(3));
	}	
	
}
