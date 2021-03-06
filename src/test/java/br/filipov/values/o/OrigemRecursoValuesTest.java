package br.filipov.values.o;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class OrigemRecursoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Recurso Livre", EnumHelper.getDescricaoPorCodigo(OrigemRecursoValues.class, 1));
		assertEquals("Recurso Obrigatório", EnumHelper.getDescricaoPorCodigo(OrigemRecursoValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(OrigemRecursoValues.LIVRE, EnumHelper.getEnumPorCodigo(1, OrigemRecursoValues.class));
		assertEquals(OrigemRecursoValues.OBRIGATORIO, EnumHelper.getEnumPorCodigo(2, OrigemRecursoValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Recurso Livre", OrigemRecursoValues.getDescricaoById((short) 1));
		assertEquals("Recurso Obrigatório", OrigemRecursoValues.getDescricaoById((short) 2));
		
		assertNotEquals("N/A", OrigemRecursoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Recurso Livre", OrigemRecursoValues.getDescricaoById(1));
		assertEquals("Recurso Obrigatório", OrigemRecursoValues.getDescricaoById(2));
		
		assertNotEquals("N/A", OrigemRecursoValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Recurso Livre", OrigemRecursoValues.getDescricaoById(1L));
		assertEquals("Recurso Obrigatório", OrigemRecursoValues.getDescricaoById(2L));
		
		assertNotEquals("N/A", OrigemRecursoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Recurso Livre", OrigemRecursoValues.getDescricaoById((byte) 1));
		assertEquals("Recurso Obrigatório", OrigemRecursoValues.getDescricaoById((byte) 2));
		
		assertNotEquals("N/A", OrigemRecursoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testParse() {
		assertEquals(OrigemRecursoValues.LIVRE, OrigemRecursoValues.parse(1));
		assertEquals(OrigemRecursoValues.OBRIGATORIO, OrigemRecursoValues.parse(2));
		
		assertNotEquals(OrigemRecursoValues.OBRIGATORIO, OrigemRecursoValues.parse(9));
	}	
	
}
