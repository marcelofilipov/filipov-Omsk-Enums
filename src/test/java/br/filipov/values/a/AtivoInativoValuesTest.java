package br.filipov.values.a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class AtivoInativoValuesTest {
	
	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Ativo", EnumHelper.getDescricaoPorCodigo(AtivoInativoValues.class, 1));
		assertEquals("Inativo", EnumHelper.getDescricaoPorCodigo(AtivoInativoValues.class, 0));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(AtivoInativoValues.ATIVO, EnumHelper.getEnumPorCodigo(1, AtivoInativoValues.class));
		assertEquals(AtivoInativoValues.INATIVO, EnumHelper.getEnumPorCodigo(0, AtivoInativoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Ativo",AtivoInativoValues.getDescricaoById((short) 1));
		assertEquals("Inativo",AtivoInativoValues.getDescricaoById((short) 0));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Ativo",AtivoInativoValues.getDescricaoById(1));
		assertEquals("Inativo",AtivoInativoValues.getDescricaoById(0));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Ativo",AtivoInativoValues.getDescricaoById(1L));
		assertEquals("Inativo",AtivoInativoValues.getDescricaoById(0L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Ativo",AtivoInativoValues.getDescricaoById((byte) 1));
		assertEquals("Inativo",AtivoInativoValues.getDescricaoById((byte) 0));
	}

	@Test
	public void testParse() {
		assertEquals(AtivoInativoValues.ATIVO,AtivoInativoValues.parse(1));
		assertEquals(AtivoInativoValues.INATIVO,AtivoInativoValues.parse(0));
	}	
	
}
