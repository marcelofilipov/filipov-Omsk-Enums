package br.filipov.values.b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class BancosValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Bradesco", EnumHelper.getDescricaoPorCodigo(BancosValues.class, 237));
		assertEquals("Caixa Econômica Federal", EnumHelper.getDescricaoPorCodigo(BancosValues.class, 151));
		assertEquals("Itaú Unibanco", EnumHelper.getDescricaoPorCodigo(BancosValues.class, 341));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(BancosValues.BRADESCO, EnumHelper.getEnumPorCodigo(237, BancosValues.class));
		assertEquals(BancosValues.CEF, EnumHelper.getEnumPorCodigo(151, BancosValues.class));
		assertEquals(BancosValues.ITAU_UNIBANCO, EnumHelper.getEnumPorCodigo(341, BancosValues.class));
	}


	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Bradesco",BancosValues.getDescricaoById((short) 237));
		assertEquals("Caixa Econômica Federal",BancosValues.getDescricaoById((short) 151));
		assertEquals("Itaú Unibanco",BancosValues.getDescricaoById((short) 341));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Bradesco",BancosValues.getDescricaoById(237));
		assertEquals("Caixa Econômica Federal",BancosValues.getDescricaoById(151));
		assertEquals("Itaú Unibanco",BancosValues.getDescricaoById(341));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Bradesco",BancosValues.getDescricaoById(237L));
		assertEquals("Caixa Econômica Federal",BancosValues.getDescricaoById(151L));
		assertEquals("Itaú Unibanco",BancosValues.getDescricaoById(341L));
	}	

	@Test
	public void testParse() {
		assertEquals(BancosValues.BRADESCO,BancosValues.parse(237));
		assertEquals(BancosValues.CEF,BancosValues.parse(151));
		assertEquals(BancosValues.ITAU_UNIBANCO,BancosValues.parse(341));
	}	
		
}
