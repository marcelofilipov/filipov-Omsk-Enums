package br.filipov.values.p;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PeriodicidadeValuesTest {

	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("252", PeriodicidadeValues.getDescricaoById((short) 1));
		assertEquals("360", PeriodicidadeValues.getDescricaoById((short) 2));
		assertEquals("365", PeriodicidadeValues.getDescricaoById((short) 3));
		assertEquals("Over", PeriodicidadeValues.getDescricaoById((short) 6));
		
		assertNotEquals("N/A", PeriodicidadeValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("252", PeriodicidadeValues.getDescricaoById(1));
		assertEquals("360", PeriodicidadeValues.getDescricaoById(2));
		assertEquals("365", PeriodicidadeValues.getDescricaoById(3));
		assertEquals("Over", PeriodicidadeValues.getDescricaoById(6));
		
		assertNotEquals("N/A", PeriodicidadeValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("252", PeriodicidadeValues.getDescricaoById(1L));
		assertEquals("360", PeriodicidadeValues.getDescricaoById(2L));
		assertEquals("365", PeriodicidadeValues.getDescricaoById(3L));
		assertEquals("Over", PeriodicidadeValues.getDescricaoById(6L));
		
		assertNotEquals("N/A", PeriodicidadeValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("252", PeriodicidadeValues.getDescricaoById((byte) 1));
		assertEquals("360", PeriodicidadeValues.getDescricaoById((byte) 2));
		assertEquals("365", PeriodicidadeValues.getDescricaoById((byte) 3));
		assertEquals("Over", PeriodicidadeValues.getDescricaoById((byte) 6));
		
		assertNotEquals("N/A", PeriodicidadeValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testGetPeriodicidadeByIdShort() {
		assertEquals(252D, PeriodicidadeValues.getPeriodicidadeById((short) 1),1D);
		assertEquals(360D, PeriodicidadeValues.getPeriodicidadeById((short) 2),1D);
		assertEquals(365D, PeriodicidadeValues.getPeriodicidadeById((short) 3),1D);
		assertEquals(30D, PeriodicidadeValues.getPeriodicidadeById((short) 6),1D);
	}

	@Test
	public void testGetPeriodicidadeByIdByte() {
		assertEquals(252D, PeriodicidadeValues.getPeriodicidadeById((byte) 1),1D);
		assertEquals(360D, PeriodicidadeValues.getPeriodicidadeById((byte) 2),1D);
		assertEquals(365D, PeriodicidadeValues.getPeriodicidadeById((byte) 3),1D);
		assertEquals(30D, PeriodicidadeValues.getPeriodicidadeById((byte) 6),1D);
	}

	@Test
	public void testGetPeriodicidadeByIdInt() {
		assertEquals(252D, PeriodicidadeValues.getPeriodicidadeById(1),1D);
		assertEquals(360D, PeriodicidadeValues.getPeriodicidadeById(2),1D);
		assertEquals(365D, PeriodicidadeValues.getPeriodicidadeById(3),1D);
		assertEquals(30D, PeriodicidadeValues.getPeriodicidadeById(6),1D);
	}

	@Test
	public void testGetPeriodicidadeByIdLong() {
		assertEquals(252D, PeriodicidadeValues.getPeriodicidadeById(1L),1D);
		assertEquals(360D, PeriodicidadeValues.getPeriodicidadeById(2L),1D);
		assertEquals(365D, PeriodicidadeValues.getPeriodicidadeById(3L),1D);
		assertEquals(30D, PeriodicidadeValues.getPeriodicidadeById(6L),1D);
	}

	@Test
	public void testParse() {
		assertEquals(PeriodicidadeValues.PER_252, PeriodicidadeValues.parse(1));
		assertEquals(PeriodicidadeValues.PER_360, PeriodicidadeValues.parse(2));
		assertEquals(PeriodicidadeValues.PER_365, PeriodicidadeValues.parse(3));
		assertEquals(PeriodicidadeValues.PER_OVER, PeriodicidadeValues.parse(6));
		
		assertNotEquals(PeriodicidadeValues.PER_OVER, PeriodicidadeValues.parse(9));
	}	

	@Test
	public void testGetDuByIdShort() {
		assertEquals(true, PeriodicidadeValues.getDuById((short) 1));
		assertEquals(false, PeriodicidadeValues.getDuById((short) 2));
		assertEquals(false, PeriodicidadeValues.getDuById((short) 3));
		assertEquals(true, PeriodicidadeValues.getDuById((short) 6));

		assertNotEquals(true, PeriodicidadeValues.getDuById((short) 9));

		
		assertTrue(PeriodicidadeValues.getDuById((short) 1));
		assertFalse(PeriodicidadeValues.getDuById((short) 2));
		assertFalse(PeriodicidadeValues.getDuById((short) 3));
		assertTrue(PeriodicidadeValues.getDuById((short) 6));
		
		assertFalse(PeriodicidadeValues.getDuById((short) 9));
	}

	@Test
	public void testGetDuByIdByte() {
		assertEquals(true, PeriodicidadeValues.getDuById((byte) 1));
		assertEquals(false, PeriodicidadeValues.getDuById((byte) 2));
		assertEquals(false, PeriodicidadeValues.getDuById((byte) 3));
		assertEquals(true, PeriodicidadeValues.getDuById((byte) 6));
		
		assertNotEquals(true, PeriodicidadeValues.getDuById((byte) 9));
		
		
		assertTrue(PeriodicidadeValues.getDuById((byte) 1));
		assertFalse(PeriodicidadeValues.getDuById((byte) 2));
		assertFalse(PeriodicidadeValues.getDuById((byte) 3));
		assertTrue(PeriodicidadeValues.getDuById((byte) 6));
		
		assertFalse(PeriodicidadeValues.getDuById((byte) 9));
	}

	@Test
	public void testGetDuByIdInt() {
		assertEquals(true, PeriodicidadeValues.getDuById(1));
		assertEquals(false, PeriodicidadeValues.getDuById(2));
		assertEquals(false, PeriodicidadeValues.getDuById(3));
		assertEquals(true, PeriodicidadeValues.getDuById(6));
		
		assertNotEquals(true, PeriodicidadeValues.getDuById(9));
		
		
		assertTrue(PeriodicidadeValues.getDuById(1));
		assertFalse(PeriodicidadeValues.getDuById(2));
		assertFalse(PeriodicidadeValues.getDuById(3));
		assertTrue(PeriodicidadeValues.getDuById(6));
		
		assertFalse(PeriodicidadeValues.getDuById(9));
	}

	@Test
	public void testGetDuByIdLong() {
		assertEquals(true, PeriodicidadeValues.getDuById(1L));
		assertEquals(false, PeriodicidadeValues.getDuById(2L));
		assertEquals(false, PeriodicidadeValues.getDuById(3L));
		assertEquals(true, PeriodicidadeValues.getDuById(6L));
		
		assertNotEquals(true, PeriodicidadeValues.getDuById(9L));
		
		
		assertTrue(PeriodicidadeValues.getDuById(1L));
		assertFalse(PeriodicidadeValues.getDuById(2L));
		assertFalse(PeriodicidadeValues.getDuById(3L));
		assertTrue(PeriodicidadeValues.getDuById(6L));
		
		assertFalse(PeriodicidadeValues.getDuById(9L));

	}

}
