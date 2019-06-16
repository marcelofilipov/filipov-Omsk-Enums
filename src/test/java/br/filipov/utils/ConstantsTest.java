package br.filipov.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConstantsTest {

	@Test
	public void testConstants() {
		assertEquals(Constants.ENSINO, "Ensino");
		assertEquals(Constants.SUPERIOR, "Superior");
	}
}
