package br.filipov.values.a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class AtivoInativoValuesTest {
	
	@Test
	void testGetDescricaoPorCodigo() {
		assertEquals("Ativo", EnumHelper.getDescricaoPorCodigo(AtivoInativoValues.class, 1));
		assertEquals("Inativo", EnumHelper.getDescricaoPorCodigo(AtivoInativoValues.class, 0));
	}

	@Test
	void testGetEnumPorCodigo() {
		assertEquals(AtivoInativoValues.ATIVO, EnumHelper.getEnumPorCodigo(1, AtivoInativoValues.class));
		assertEquals(AtivoInativoValues.INATIVO, EnumHelper.getEnumPorCodigo(0, AtivoInativoValues.class));
	}	
	
	@Test
	void testGetDescricaoByIdShort() {
		assertEquals("Ativo", AtivoInativoValues.getDescricaoById((short) 1).get());
		assertEquals("Inativo", AtivoInativoValues.getDescricaoById((short) 0).get());
	}

	@Test
	void testGetDescricaoByIdInteger() {
		assertEquals("Ativo", AtivoInativoValues.getDescricaoById(1).get());
		assertEquals("Inativo", AtivoInativoValues.getDescricaoById(0).get());
	}

	@Test
	void testGetDescricaoByIdLong() {
		assertEquals("Ativo", AtivoInativoValues.getDescricaoById(1L).get());
		assertEquals("Inativo", AtivoInativoValues.getDescricaoById(0L).get());
	}	
	
	@Test
	void testGetDescricaoByIdByte() {
		assertEquals("Ativo", AtivoInativoValues.getDescricaoById((byte) 1).get());
		assertEquals("Inativo", AtivoInativoValues.getDescricaoById((byte) 0).get());
	}
	
	@Test
	void testExpectedNoValuePresentGetDescricaoByIdInt() {
	    Throwable exception = assertThrows(NoSuchElementException.class, () -> {
	    	AtivoInativoValues.getDescricaoById(9);
	    });
	    assertEquals("No value present", exception.getMessage());
	}

	@Test
	void testParse() {
		assertEquals(AtivoInativoValues.ATIVO, AtivoInativoValues.parse(1).get());
		assertEquals(AtivoInativoValues.INATIVO, AtivoInativoValues.parse(0).get());
	}
	
	@Test
	void testExpectedNoValuePresentParse() {
	    Throwable exception = assertThrows(NoSuchElementException.class, () -> {
	    	AtivoInativoValues.parse(9);
	    });
	    assertEquals("No value present", exception.getMessage());
	}
	
}
