package br.filipov.values.p;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class ProcedimentosValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Todos", EnumHelper.getDescricaoPorCodigo(ProcedimentosValues.class, 1));
		assertEquals("Americano", EnumHelper.getDescricaoPorCodigo(ProcedimentosValues.class, 2));
		assertEquals("Europeu", EnumHelper.getDescricaoPorCodigo(ProcedimentosValues.class, 3));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(ProcedimentosValues.TODOS, EnumHelper.getEnumPorCodigo(1, ProcedimentosValues.class));
		assertEquals(ProcedimentosValues.AMERICANO, EnumHelper.getEnumPorCodigo(2, ProcedimentosValues.class));
		assertEquals(ProcedimentosValues.EUROPEU, EnumHelper.getEnumPorCodigo(3, ProcedimentosValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Todos",ProcedimentosValues.getDescricaoById((short) 1));
		assertEquals("Americano",ProcedimentosValues.getDescricaoById((short) 2));
		assertEquals("Europeu",ProcedimentosValues.getDescricaoById((short) 3));
		
		assertNotEquals("N/A",ProcedimentosValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Todos",ProcedimentosValues.getDescricaoById((byte) 1));
		assertEquals("Americano",ProcedimentosValues.getDescricaoById((byte) 2));
		assertEquals("Europeu",ProcedimentosValues.getDescricaoById((byte) 3));
		
		assertNotEquals("N/A",ProcedimentosValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Todos",ProcedimentosValues.getDescricaoById(1));
		assertEquals("Americano",ProcedimentosValues.getDescricaoById(2));
		assertEquals("Europeu",ProcedimentosValues.getDescricaoById(3));
		
		assertNotEquals("N/A",ProcedimentosValues.getDescricaoById(9));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Todos",ProcedimentosValues.getDescricaoById(1L));
		assertEquals("Americano",ProcedimentosValues.getDescricaoById(2L));
		assertEquals("Europeu",ProcedimentosValues.getDescricaoById(3L));
		
		assertNotEquals("N/A",ProcedimentosValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(ProcedimentosValues.TODOS,ProcedimentosValues.parse(1));
		assertEquals(ProcedimentosValues.AMERICANO,ProcedimentosValues.parse(2));
		assertEquals(ProcedimentosValues.EUROPEU,ProcedimentosValues.parse(3));
		
		assertNotEquals(ProcedimentosValues.EUROPEU,ProcedimentosValues.parse(9));
	}	
	
}
