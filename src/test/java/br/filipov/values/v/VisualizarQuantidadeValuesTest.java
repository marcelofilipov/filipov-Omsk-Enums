package br.filipov.values.v;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class VisualizarQuantidadeValuesTest {
	
	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("5", EnumHelper.getDescricaoPorCodigo(VisualizarQuantidadeValues.class, 5));
		assertEquals("10", EnumHelper.getDescricaoPorCodigo(VisualizarQuantidadeValues.class, 10));
		assertEquals("15", EnumHelper.getDescricaoPorCodigo(VisualizarQuantidadeValues.class, 15));
		assertEquals("20", EnumHelper.getDescricaoPorCodigo(VisualizarQuantidadeValues.class, 20));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(VisualizarQuantidadeValues.CINCO, EnumHelper.getEnumPorCodigo(5, VisualizarQuantidadeValues.class));
		assertEquals(VisualizarQuantidadeValues.DEZ, EnumHelper.getEnumPorCodigo(10, VisualizarQuantidadeValues.class));
		assertEquals(VisualizarQuantidadeValues.QUINZE, EnumHelper.getEnumPorCodigo(15, VisualizarQuantidadeValues.class));
		assertEquals(VisualizarQuantidadeValues.VINTE, EnumHelper.getEnumPorCodigo(20, VisualizarQuantidadeValues.class));
	}	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("5", VisualizarQuantidadeValues.getDescricaoById((short) 5));
		assertEquals("10", VisualizarQuantidadeValues.getDescricaoById((short) 10));
		assertEquals("15", VisualizarQuantidadeValues.getDescricaoById((short) 15));
		
		assertNotEquals("N/A", VisualizarQuantidadeValues.getDescricaoById((short) 99));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("5", VisualizarQuantidadeValues.getDescricaoById(5));
		assertEquals("10", VisualizarQuantidadeValues.getDescricaoById(10));
		assertEquals("15", VisualizarQuantidadeValues.getDescricaoById(15));
		
		assertNotEquals("N/A", VisualizarQuantidadeValues.getDescricaoById(99));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("5", VisualizarQuantidadeValues.getDescricaoById(5L));
		assertEquals("10", VisualizarQuantidadeValues.getDescricaoById(10L));
		assertEquals("15", VisualizarQuantidadeValues.getDescricaoById(15L));
		
		assertNotEquals("N/A", VisualizarQuantidadeValues.getDescricaoById(99L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("5", VisualizarQuantidadeValues.getDescricaoById((byte) 5));
		assertEquals("10", VisualizarQuantidadeValues.getDescricaoById((byte) 10));
		assertEquals("15", VisualizarQuantidadeValues.getDescricaoById((byte) 15));
		
		assertNotEquals("N/A", VisualizarQuantidadeValues.getDescricaoById((byte) 99));
	}

	@Test
	public void testParse() {
		assertEquals(VisualizarQuantidadeValues.CINCO, VisualizarQuantidadeValues.parse(5));
		assertEquals(VisualizarQuantidadeValues.DEZ, VisualizarQuantidadeValues.parse(10));
		assertEquals(VisualizarQuantidadeValues.QUINZE, VisualizarQuantidadeValues.parse(15));
		
		assertNotEquals(VisualizarQuantidadeValues.QUINZE, VisualizarQuantidadeValues.parse(99));
	}	

}
