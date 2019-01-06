package br.filipov.values.b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class BandeiraCartaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Visa", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 1));
		assertEquals("MasterCard", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 2));
		assertEquals("American Express", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 3));
		assertEquals("Aura", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 4));
		assertEquals("Elo", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 5));
		assertEquals("Hipercard", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 6));
		assertEquals("Sorocred", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 7));
		assertEquals("BNDES", EnumHelper.getDescricaoPorCodigo(BandeiraCartaoValues.class, 8));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(BandeiraCartaoValues.VISA, EnumHelper.getEnumPorCodigo(1, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.MASTERCARD, EnumHelper.getEnumPorCodigo(2, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.AMERICAN_EXPRESS, EnumHelper.getEnumPorCodigo(3, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.AURA, EnumHelper.getEnumPorCodigo(4, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.ELO, EnumHelper.getEnumPorCodigo(5, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.HIPERCARD, EnumHelper.getEnumPorCodigo(6, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.SOROCRED, EnumHelper.getEnumPorCodigo(7, BandeiraCartaoValues.class));
		assertEquals(BandeiraCartaoValues.BNDES, EnumHelper.getEnumPorCodigo(8, BandeiraCartaoValues.class));
	}	

	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Visa", BandeiraCartaoValues.getDescricaoById((short) 1));
		assertEquals("MasterCard", BandeiraCartaoValues.getDescricaoById((short) 2));
		assertEquals("American Express", BandeiraCartaoValues.getDescricaoById((short) 3));
		assertEquals("Aura", BandeiraCartaoValues.getDescricaoById((short) 4));
		assertEquals("Elo", BandeiraCartaoValues.getDescricaoById((short) 5));
		assertEquals("Hipercard", BandeiraCartaoValues.getDescricaoById((short) 6));
		assertEquals("Sorocred", BandeiraCartaoValues.getDescricaoById((short) 7));
		assertEquals("BNDES", BandeiraCartaoValues.getDescricaoById((short) 8));
		
		assertNotEquals("N/A", BandeiraCartaoValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Visa", BandeiraCartaoValues.getDescricaoById(1));
		assertEquals("MasterCard", BandeiraCartaoValues.getDescricaoById(2));
		assertEquals("American Express", BandeiraCartaoValues.getDescricaoById(3));
		assertEquals("Aura", BandeiraCartaoValues.getDescricaoById(4));
		assertEquals("Elo", BandeiraCartaoValues.getDescricaoById(5));
		assertEquals("Hipercard", BandeiraCartaoValues.getDescricaoById(6));
		assertEquals("Sorocred", BandeiraCartaoValues.getDescricaoById(7));
		assertEquals("BNDES", BandeiraCartaoValues.getDescricaoById(8));
		
		assertNotEquals("N/A", BandeiraCartaoValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Visa", BandeiraCartaoValues.getDescricaoById(1L));
		assertEquals("MasterCard", BandeiraCartaoValues.getDescricaoById(2L));
		assertEquals("American Express", BandeiraCartaoValues.getDescricaoById(3L));
		assertEquals("Aura", BandeiraCartaoValues.getDescricaoById(4L));
		assertEquals("Elo", BandeiraCartaoValues.getDescricaoById(5L));
		assertEquals("Hipercard", BandeiraCartaoValues.getDescricaoById(6L));
		assertEquals("Sorocred", BandeiraCartaoValues.getDescricaoById(7L));
		assertEquals("BNDES", BandeiraCartaoValues.getDescricaoById(8L));
		
		assertNotEquals("N/A", BandeiraCartaoValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Visa", BandeiraCartaoValues.getDescricaoById((byte) 1));
		assertEquals("MasterCard", BandeiraCartaoValues.getDescricaoById((byte) 2));
		assertEquals("American Express", BandeiraCartaoValues.getDescricaoById((byte) 3));
		assertEquals("Aura", BandeiraCartaoValues.getDescricaoById((byte) 4));
		assertEquals("Elo", BandeiraCartaoValues.getDescricaoById((byte) 5));
		assertEquals("Hipercard", BandeiraCartaoValues.getDescricaoById((byte) 6));
		assertEquals("Sorocred", BandeiraCartaoValues.getDescricaoById((byte) 7));
		assertEquals("BNDES", BandeiraCartaoValues.getDescricaoById((byte) 8));
		
		assertNotEquals("N/A", BandeiraCartaoValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testParse() {
		assertEquals(BandeiraCartaoValues.VISA, BandeiraCartaoValues.parse(1));
		assertEquals(BandeiraCartaoValues.MASTERCARD, BandeiraCartaoValues.parse(2));
		assertEquals(BandeiraCartaoValues.AMERICAN_EXPRESS, BandeiraCartaoValues.parse(3));
		assertEquals(BandeiraCartaoValues.AURA, BandeiraCartaoValues.parse(4));
		assertEquals(BandeiraCartaoValues.ELO, BandeiraCartaoValues.parse(5));
		assertEquals(BandeiraCartaoValues.HIPERCARD, BandeiraCartaoValues.parse(6));
		assertEquals(BandeiraCartaoValues.SOROCRED, BandeiraCartaoValues.parse(7));
		assertEquals(BandeiraCartaoValues.BNDES, BandeiraCartaoValues.parse(8));
		
		assertNotEquals(BandeiraCartaoValues.BNDES, BandeiraCartaoValues.parse(9));
	}	
	
}
