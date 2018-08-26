package br.filipov.values.i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class IndicadorEventoLogValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Inclusão", EnumHelper.getDescricaoPorCodigo(IndicadorEventoLogValues.class, 1));
		assertEquals("Alteração", EnumHelper.getDescricaoPorCodigo(IndicadorEventoLogValues.class, 2));
		assertEquals("Exclusão", EnumHelper.getDescricaoPorCodigo(IndicadorEventoLogValues.class, 3));
		assertEquals("Consulta", EnumHelper.getDescricaoPorCodigo(IndicadorEventoLogValues.class, 4));
		assertEquals("Lista", EnumHelper.getDescricaoPorCodigo(IndicadorEventoLogValues.class, 5));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorEventoLogValues.INCLUSAO, EnumHelper.getEnumPorCodigo(1, IndicadorEventoLogValues.class));
		assertEquals(IndicadorEventoLogValues.ALTERACAO, EnumHelper.getEnumPorCodigo(2, IndicadorEventoLogValues.class));
		assertEquals(IndicadorEventoLogValues.EXCLUSAO, EnumHelper.getEnumPorCodigo(3, IndicadorEventoLogValues.class));
		assertEquals(IndicadorEventoLogValues.CONSULTA, EnumHelper.getEnumPorCodigo(4, IndicadorEventoLogValues.class));
		assertEquals(IndicadorEventoLogValues.LISTA, EnumHelper.getEnumPorCodigo(5, IndicadorEventoLogValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Inclusão",IndicadorEventoLogValues.getDescricaoById((short) 1));
		assertEquals("Alteração",IndicadorEventoLogValues.getDescricaoById((short) 2));
		assertEquals("Exclusão",IndicadorEventoLogValues.getDescricaoById((short) 3));
		assertEquals("Consulta",IndicadorEventoLogValues.getDescricaoById((short) 4));
		assertEquals("Lista",IndicadorEventoLogValues.getDescricaoById((short) 5));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Inclusão",IndicadorEventoLogValues.getDescricaoById(1));
		assertEquals("Alteração",IndicadorEventoLogValues.getDescricaoById(2));
		assertEquals("Exclusão",IndicadorEventoLogValues.getDescricaoById(3));
		assertEquals("Consulta",IndicadorEventoLogValues.getDescricaoById(4));
		assertEquals("Lista",IndicadorEventoLogValues.getDescricaoById(5));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Inclusão",IndicadorEventoLogValues.getDescricaoById(1L));
		assertEquals("Alteração",IndicadorEventoLogValues.getDescricaoById(2L));
		assertEquals("Exclusão",IndicadorEventoLogValues.getDescricaoById(3L));
		assertEquals("Consulta",IndicadorEventoLogValues.getDescricaoById(4L));
		assertEquals("Lista",IndicadorEventoLogValues.getDescricaoById(5L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Inclusão",IndicadorEventoLogValues.getDescricaoById((byte) 1));
		assertEquals("Alteração",IndicadorEventoLogValues.getDescricaoById((byte) 2));
		assertEquals("Exclusão",IndicadorEventoLogValues.getDescricaoById((byte) 3));
		assertEquals("Consulta",IndicadorEventoLogValues.getDescricaoById((byte) 4));
		assertEquals("Lista",IndicadorEventoLogValues.getDescricaoById((byte) 5));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorEventoLogValues.INCLUSAO,IndicadorEventoLogValues.parse(1));
		assertEquals(IndicadorEventoLogValues.ALTERACAO,IndicadorEventoLogValues.parse(2));
		assertEquals(IndicadorEventoLogValues.EXCLUSAO,IndicadorEventoLogValues.parse(3));
		assertEquals(IndicadorEventoLogValues.CONSULTA,IndicadorEventoLogValues.parse(4));
		assertEquals(IndicadorEventoLogValues.LISTA,IndicadorEventoLogValues.parse(5));
	}
	
	
}
