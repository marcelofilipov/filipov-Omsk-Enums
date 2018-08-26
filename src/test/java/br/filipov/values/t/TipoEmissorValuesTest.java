package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoEmissorValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("SMS", EnumHelper.getDescricaoPorCodigo(TipoEmissorValues.class, 1));
		assertEquals("E-mail", EnumHelper.getDescricaoPorCodigo(TipoEmissorValues.class, 2));
		assertEquals("JMS", EnumHelper.getDescricaoPorCodigo(TipoEmissorValues.class, 3));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoEmissorValues.SMS, EnumHelper.getEnumPorCodigo(1, TipoEmissorValues.class));
		assertEquals(TipoEmissorValues.EMAIL, EnumHelper.getEnumPorCodigo(2, TipoEmissorValues.class));
		assertEquals(TipoEmissorValues.JMS, EnumHelper.getEnumPorCodigo(3, TipoEmissorValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("SMS",TipoEmissorValues.getDescricaoById((short) 1));
		assertEquals("E-mail",TipoEmissorValues.getDescricaoById((short) 2));
		assertEquals("JMS",TipoEmissorValues.getDescricaoById((short) 3));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("SMS",TipoEmissorValues.getDescricaoById((byte) 1));
		assertEquals("E-mail",TipoEmissorValues.getDescricaoById((byte) 2));
		assertEquals("JMS",TipoEmissorValues.getDescricaoById((byte) 3));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("SMS",TipoEmissorValues.getDescricaoById(1));
		assertEquals("E-mail",TipoEmissorValues.getDescricaoById(2));
		assertEquals("JMS",TipoEmissorValues.getDescricaoById(3));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("SMS",TipoEmissorValues.getDescricaoById(1L));
		assertEquals("E-mail",TipoEmissorValues.getDescricaoById(2L));
		assertEquals("JMS",TipoEmissorValues.getDescricaoById(3L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(TipoEmissorValues.SMS,TipoEmissorValues.parse(1));
		assertEquals(TipoEmissorValues.EMAIL,TipoEmissorValues.parse(2));
		assertEquals(TipoEmissorValues.JMS,TipoEmissorValues.parse(3));
	}	
	
}
