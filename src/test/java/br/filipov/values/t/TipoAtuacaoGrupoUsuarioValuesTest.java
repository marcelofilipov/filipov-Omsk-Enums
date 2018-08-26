package br.filipov.values.t;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.filipov.model.EnumHelper;

public class TipoAtuacaoGrupoUsuarioValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Operação", EnumHelper.getDescricaoPorCodigo(TipoAtuacaoGrupoUsuarioValues.class, 1));
		assertEquals("Autorizadores", EnumHelper.getDescricaoPorCodigo(TipoAtuacaoGrupoUsuarioValues.class, 2));
		assertEquals("Distribuição", EnumHelper.getDescricaoPorCodigo(TipoAtuacaoGrupoUsuarioValues.class, 3));
		assertEquals("Notificação", EnumHelper.getDescricaoPorCodigo(TipoAtuacaoGrupoUsuarioValues.class, 4));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoAtuacaoGrupoUsuarioValues.OPERACAO, EnumHelper.getEnumPorCodigo(1, TipoAtuacaoGrupoUsuarioValues.class));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.AUTORIZADORES, EnumHelper.getEnumPorCodigo(2, TipoAtuacaoGrupoUsuarioValues.class));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.DISTRIBUICAO, EnumHelper.getEnumPorCodigo(3, TipoAtuacaoGrupoUsuarioValues.class));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.NOTIFICACAO, EnumHelper.getEnumPorCodigo(4, TipoAtuacaoGrupoUsuarioValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Operação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((short) 1));
		assertEquals("Autorizadores",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((short) 2));
		assertEquals("Distribuição",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((short) 3));
		assertEquals("Notificação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((short) 4));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Operação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((byte) 1));
		assertEquals("Autorizadores",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((byte) 2));
		assertEquals("Distribuição",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((byte) 3));
		assertEquals("Notificação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById((byte) 4));
	}
	
	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Operação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(1));
		assertEquals("Autorizadores",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(2));
		assertEquals("Distribuição",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(3));
		assertEquals("Notificação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(4));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Operação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(1L));
		assertEquals("Autorizadores",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(2L));
		assertEquals("Distribuição",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(3L));
		assertEquals("Notificação",TipoAtuacaoGrupoUsuarioValues.getDescricaoById(4L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoAtuacaoGrupoUsuarioValues.OPERACAO,TipoAtuacaoGrupoUsuarioValues.parse(1));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.AUTORIZADORES,TipoAtuacaoGrupoUsuarioValues.parse(2));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.DISTRIBUICAO,TipoAtuacaoGrupoUsuarioValues.parse(3));
		assertEquals(TipoAtuacaoGrupoUsuarioValues.NOTIFICACAO,TipoAtuacaoGrupoUsuarioValues.parse(4));
	}	
	
}
