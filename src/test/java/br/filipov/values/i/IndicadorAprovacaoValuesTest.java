package br.filipov.values.i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class IndicadorAprovacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Aguardando Aprovação", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 1));
		assertEquals("Pendente", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 2));
		assertEquals("Aprovado", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 3));
		assertEquals("Reprovado", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 4));
		assertEquals("Rejeitado", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 5));
		assertEquals("Cancelado", EnumHelper.getDescricaoPorCodigo(IndicadorAprovacaoValues.class, 6));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(IndicadorAprovacaoValues.AGUARDANDO_APROVACAO, EnumHelper.getEnumPorCodigo(1, IndicadorAprovacaoValues.class));
		assertEquals(IndicadorAprovacaoValues.PENDENTE, EnumHelper.getEnumPorCodigo(2, IndicadorAprovacaoValues.class));
		assertEquals(IndicadorAprovacaoValues.APROVADO, EnumHelper.getEnumPorCodigo(3, IndicadorAprovacaoValues.class));
		assertEquals(IndicadorAprovacaoValues.REPROVADO, EnumHelper.getEnumPorCodigo(4, IndicadorAprovacaoValues.class));
		assertEquals(IndicadorAprovacaoValues.REJEITADO, EnumHelper.getEnumPorCodigo(5, IndicadorAprovacaoValues.class));
		assertEquals(IndicadorAprovacaoValues.CANCELADO, EnumHelper.getEnumPorCodigo(6, IndicadorAprovacaoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Aguardando Aprovação",IndicadorAprovacaoValues.getDescricaoById((short) 1));
		assertEquals("Pendente",IndicadorAprovacaoValues.getDescricaoById((short) 2));
		assertEquals("Aprovado",IndicadorAprovacaoValues.getDescricaoById((short) 3));
		assertEquals("Reprovado",IndicadorAprovacaoValues.getDescricaoById((short) 4));
		assertEquals("Rejeitado",IndicadorAprovacaoValues.getDescricaoById((short) 5));
		assertEquals("Cancelado",IndicadorAprovacaoValues.getDescricaoById((short) 6));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Aguardando Aprovação",IndicadorAprovacaoValues.getDescricaoById(1));
		assertEquals("Pendente",IndicadorAprovacaoValues.getDescricaoById(2));
		assertEquals("Aprovado",IndicadorAprovacaoValues.getDescricaoById(3));
		assertEquals("Reprovado",IndicadorAprovacaoValues.getDescricaoById(4));
		assertEquals("Rejeitado",IndicadorAprovacaoValues.getDescricaoById(5));
		assertEquals("Cancelado",IndicadorAprovacaoValues.getDescricaoById(6));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Aguardando Aprovação",IndicadorAprovacaoValues.getDescricaoById(1L));
		assertEquals("Pendente",IndicadorAprovacaoValues.getDescricaoById(2L));
		assertEquals("Aprovado",IndicadorAprovacaoValues.getDescricaoById(3L));
		assertEquals("Reprovado",IndicadorAprovacaoValues.getDescricaoById(4L));
		assertEquals("Rejeitado",IndicadorAprovacaoValues.getDescricaoById(5L));
		assertEquals("Cancelado",IndicadorAprovacaoValues.getDescricaoById(6L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Aguardando Aprovação",IndicadorAprovacaoValues.getDescricaoById((byte) 1));
		assertEquals("Pendente",IndicadorAprovacaoValues.getDescricaoById((byte) 2));
		assertEquals("Aprovado",IndicadorAprovacaoValues.getDescricaoById((byte) 3));
		assertEquals("Reprovado",IndicadorAprovacaoValues.getDescricaoById((byte) 4));
		assertEquals("Rejeitado",IndicadorAprovacaoValues.getDescricaoById((byte) 5));
		assertEquals("Cancelado",IndicadorAprovacaoValues.getDescricaoById((byte) 6));
	}

	@Test
	public void testParse() {
		assertEquals(IndicadorAprovacaoValues.AGUARDANDO_APROVACAO,IndicadorAprovacaoValues.parse(1));
		assertEquals(IndicadorAprovacaoValues.PENDENTE,IndicadorAprovacaoValues.parse(2));
		assertEquals(IndicadorAprovacaoValues.APROVADO,IndicadorAprovacaoValues.parse(3));
		assertEquals(IndicadorAprovacaoValues.REPROVADO,IndicadorAprovacaoValues.parse(4));
		assertEquals(IndicadorAprovacaoValues.REJEITADO,IndicadorAprovacaoValues.parse(5));
		assertEquals(IndicadorAprovacaoValues.CANCELADO,IndicadorAprovacaoValues.parse(6));
	}
	
	
}
