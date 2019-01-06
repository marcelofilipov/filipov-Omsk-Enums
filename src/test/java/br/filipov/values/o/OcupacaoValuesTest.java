package br.filipov.values.o;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class OcupacaoValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("ANALISTA DE SISTEMA", EnumHelper.getDescricaoPorCodigo(OcupacaoValues.class, 22));
		assertEquals("ECONOMISTA", EnumHelper.getDescricaoPorCodigo(OcupacaoValues.class, 17));
		assertEquals("SALVA-VIDAS OU BOMBEIRO PARTICULAR/AUTONOMO", EnumHelper.getDescricaoPorCodigo(OcupacaoValues.class, 286));
	}
	
	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(OcupacaoValues.ANALISTA_DE_SISTEMA, EnumHelper.getEnumPorCodigo(22, OcupacaoValues.class));
		assertEquals(OcupacaoValues.ECONOMISTA, EnumHelper.getEnumPorCodigo(17, OcupacaoValues.class));
		assertEquals(OcupacaoValues.SALVA_VIDAS_OU_BOMBEIRO_PARTICULAR_AUTONOMO, EnumHelper.getEnumPorCodigo(286, OcupacaoValues.class));
	}
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("ANALISTA DE SISTEMA", OcupacaoValues.getDescricaoById((short) 22));
		assertEquals("ECONOMISTA", OcupacaoValues.getDescricaoById((short) 17));
		assertEquals("SALVA-VIDAS OU BOMBEIRO PARTICULAR/AUTONOMO", OcupacaoValues.getDescricaoById((short) 286));
		
		assertNotEquals("N/A", OcupacaoValues.getDescricaoById((short) 9999));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("ANALISTA DE SISTEMA", OcupacaoValues.getDescricaoById(22));
		assertEquals("ECONOMISTA", OcupacaoValues.getDescricaoById(17));
		assertEquals("SALVA-VIDAS OU BOMBEIRO PARTICULAR/AUTONOMO", OcupacaoValues.getDescricaoById(286));
		
		assertNotEquals("N/A", OcupacaoValues.getDescricaoById(9999));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("ANALISTA DE SISTEMA", OcupacaoValues.getDescricaoById(22L));
		assertEquals("ECONOMISTA", OcupacaoValues.getDescricaoById(17L));
		assertEquals("SALVA-VIDAS OU BOMBEIRO PARTICULAR/AUTONOMO", OcupacaoValues.getDescricaoById(286L));
		
		assertNotEquals("N/A", OcupacaoValues.getDescricaoById(9999L));
	}	
	
	@Test
	public void testParse() {
		assertEquals(OcupacaoValues.ANALISTA_DE_SISTEMA, OcupacaoValues.parse(22));
		assertEquals(OcupacaoValues.ECONOMISTA, OcupacaoValues.parse(17));
		assertEquals(OcupacaoValues.SALVA_VIDAS_OU_BOMBEIRO_PARTICULAR_AUTONOMO, OcupacaoValues.parse(286));
		
		assertNotEquals(OcupacaoValues.ADVOGADO, OcupacaoValues.parse(9999));
	}	

}
