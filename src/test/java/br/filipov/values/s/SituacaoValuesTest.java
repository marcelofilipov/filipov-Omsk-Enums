package br.filipov.values.s;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class SituacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Cálculo da curva efetuado", EnumHelper.getDescricaoPorCodigo(SituacaoValues.class, 1));
		assertEquals("Cotações carregadas", EnumHelper.getDescricaoPorCodigo(SituacaoValues.class, 2));
		assertEquals("Erro no cálculo da curva", EnumHelper.getDescricaoPorCodigo(SituacaoValues.class, 3));
		assertEquals("Sem carga de indicadores", EnumHelper.getDescricaoPorCodigo(SituacaoValues.class, 4));
	
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(SituacaoValues.CALCULO_EFETUADO, EnumHelper.getEnumPorCodigo(1, SituacaoValues.class));
		assertEquals(SituacaoValues.COTACOES_CARREGADAS, EnumHelper.getEnumPorCodigo(2, SituacaoValues.class));
		assertEquals(SituacaoValues.ERRO_CALCULO, EnumHelper.getEnumPorCodigo(3, SituacaoValues.class));
		assertEquals(SituacaoValues.SEM_CARGA_INDICADORES, EnumHelper.getEnumPorCodigo(4, SituacaoValues.class));
	
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Cálculo da curva efetuado",SituacaoValues.getDescricaoById((short) 1));
		assertEquals("Cotações carregadas",SituacaoValues.getDescricaoById((short) 2));
		assertEquals("Erro no cálculo da curva",SituacaoValues.getDescricaoById((short) 3));
		assertEquals("Sem carga de indicadores",SituacaoValues.getDescricaoById((short) 4));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Cálculo da curva efetuado",SituacaoValues.getDescricaoById((byte) 1));
		assertEquals("Cotações carregadas",SituacaoValues.getDescricaoById((byte) 2));
		assertEquals("Erro no cálculo da curva",SituacaoValues.getDescricaoById((byte) 3));
		assertEquals("Sem carga de indicadores",SituacaoValues.getDescricaoById((byte) 4));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Cálculo da curva efetuado",SituacaoValues.getDescricaoById(1));
		assertEquals("Cotações carregadas",SituacaoValues.getDescricaoById(2));
		assertEquals("Erro no cálculo da curva",SituacaoValues.getDescricaoById(3));
		assertEquals("Sem carga de indicadores",SituacaoValues.getDescricaoById(4));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Cálculo da curva efetuado",SituacaoValues.getDescricaoById(1L));
		assertEquals("Cotações carregadas",SituacaoValues.getDescricaoById(2L));
		assertEquals("Erro no cálculo da curva",SituacaoValues.getDescricaoById(3L));
		assertEquals("Sem carga de indicadores",SituacaoValues.getDescricaoById(4L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(SituacaoValues.CALCULO_EFETUADO,SituacaoValues.parse(1));
		assertEquals(SituacaoValues.COTACOES_CARREGADAS,SituacaoValues.parse(2));
		assertEquals(SituacaoValues.ERRO_CALCULO,SituacaoValues.parse(3));
		assertEquals(SituacaoValues.SEM_CARGA_INDICADORES,SituacaoValues.parse(4));
	}	
	
}
