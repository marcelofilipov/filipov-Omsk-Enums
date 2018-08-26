package br.filipov.values.p;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class PublicacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Pública", EnumHelper.getDescricaoPorCodigo(PublicacaoValues.class, 1));
		assertEquals("Interna", EnumHelper.getDescricaoPorCodigo(PublicacaoValues.class, 2));
		assertEquals("Restrita", EnumHelper.getDescricaoPorCodigo(PublicacaoValues.class, 3));
		assertEquals("Confidencial", EnumHelper.getDescricaoPorCodigo(PublicacaoValues.class, 4));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(PublicacaoValues.PUBLICA, EnumHelper.getEnumPorCodigo(1, PublicacaoValues.class));
		assertEquals(PublicacaoValues.INTERNA, EnumHelper.getEnumPorCodigo(2, PublicacaoValues.class));
		assertEquals(PublicacaoValues.RESTRITA, EnumHelper.getEnumPorCodigo(3, PublicacaoValues.class));
		assertEquals(PublicacaoValues.CONFIDENCIAL, EnumHelper.getEnumPorCodigo(4, PublicacaoValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Pública",PublicacaoValues.getDescricaoById((short) 1));
		assertEquals("Interna",PublicacaoValues.getDescricaoById((short) 2));
		assertEquals("Restrita",PublicacaoValues.getDescricaoById((short) 3));
		assertEquals("Confidencial",PublicacaoValues.getDescricaoById((short) 4));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Pública",PublicacaoValues.getDescricaoById(1));
		assertEquals("Interna",PublicacaoValues.getDescricaoById(2));
		assertEquals("Restrita",PublicacaoValues.getDescricaoById(3));
		assertEquals("Confidencial",PublicacaoValues.getDescricaoById(4));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Pública",PublicacaoValues.getDescricaoById(1L));
		assertEquals("Interna",PublicacaoValues.getDescricaoById(2L));
		assertEquals("Restrita",PublicacaoValues.getDescricaoById(3L));
		assertEquals("Confidencial",PublicacaoValues.getDescricaoById(4L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Pública",PublicacaoValues.getDescricaoById((byte) 1));
		assertEquals("Interna",PublicacaoValues.getDescricaoById((byte) 2));
		assertEquals("Restrita",PublicacaoValues.getDescricaoById((byte) 3));
		assertEquals("Confidencial",PublicacaoValues.getDescricaoById((byte) 4));
	}

	@Test
	public void testParse() {
		assertEquals(PublicacaoValues.PUBLICA,PublicacaoValues.parse(1));
		assertEquals(PublicacaoValues.INTERNA,PublicacaoValues.parse(2));
		assertEquals(PublicacaoValues.RESTRITA,PublicacaoValues.parse(3));
		assertEquals(PublicacaoValues.CONFIDENCIAL,PublicacaoValues.parse(4));
	}	
	
}
