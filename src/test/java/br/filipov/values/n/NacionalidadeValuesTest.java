package br.filipov.values.n;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class NacionalidadeValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Brasileiro", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 1));
		assertEquals("Estrangeiro com Visto Permanente", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 2));
		assertEquals("Estrangeiro com Visto Temporário", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 3));
		assertEquals("Naturalizado", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 4));
		assertEquals("Português com Residência Permanente", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 5));
		assertEquals("Estrangeiro com Domicílio no Exterior", EnumHelper.getDescricaoPorCodigo(NacionalidadeValues.class, 6));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(NacionalidadeValues.BRASILEIRO, EnumHelper.getEnumPorCodigo(1, NacionalidadeValues.class));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_COM_VISTO_PERMANENTE, EnumHelper.getEnumPorCodigo(2, NacionalidadeValues.class));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_COM_VISTO_TEMPORARIO, EnumHelper.getEnumPorCodigo(3, NacionalidadeValues.class));
		assertEquals(NacionalidadeValues.NATURALIZADO, EnumHelper.getEnumPorCodigo(4, NacionalidadeValues.class));
		assertEquals(NacionalidadeValues.PORTUGUES_COM_RESIDENCIA_PERMANENTE, EnumHelper.getEnumPorCodigo(5, NacionalidadeValues.class));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_DOMICILIO_EXTERIOR, EnumHelper.getEnumPorCodigo(6, NacionalidadeValues.class));
	}	


	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Brasileiro", NacionalidadeValues.getDescricaoById((short) 1));
		assertEquals("Estrangeiro com Visto Permanente", NacionalidadeValues.getDescricaoById((short) 2));
		assertEquals("Estrangeiro com Visto Temporário", NacionalidadeValues.getDescricaoById((short) 3));
		assertEquals("Naturalizado", NacionalidadeValues.getDescricaoById((short) 4));
		assertEquals("Português com Residência Permanente", NacionalidadeValues.getDescricaoById((short) 5));
		assertEquals("Estrangeiro com Domicílio no Exterior", NacionalidadeValues.getDescricaoById((short) 6));
		
		assertNotEquals("N/A", NacionalidadeValues.getDescricaoById((short) 9));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Brasileiro", NacionalidadeValues.getDescricaoById(1));
		assertEquals("Estrangeiro com Visto Permanente", NacionalidadeValues.getDescricaoById(2));
		assertEquals("Estrangeiro com Visto Temporário", NacionalidadeValues.getDescricaoById(3));
		assertEquals("Naturalizado", NacionalidadeValues.getDescricaoById(4));
		assertEquals("Português com Residência Permanente", NacionalidadeValues.getDescricaoById(5));
		assertEquals("Estrangeiro com Domicílio no Exterior", NacionalidadeValues.getDescricaoById(6));
		
		assertNotEquals("N/A", NacionalidadeValues.getDescricaoById(9));
	}

	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Brasileiro", NacionalidadeValues.getDescricaoById(1L));
		assertEquals("Estrangeiro com Visto Permanente", NacionalidadeValues.getDescricaoById(2L));
		assertEquals("Estrangeiro com Visto Temporário", NacionalidadeValues.getDescricaoById(3L));
		assertEquals("Naturalizado", NacionalidadeValues.getDescricaoById(4L));
		assertEquals("Português com Residência Permanente", NacionalidadeValues.getDescricaoById(5L));
		assertEquals("Estrangeiro com Domicílio no Exterior", NacionalidadeValues.getDescricaoById(6L));
		
		assertNotEquals("N/A", NacionalidadeValues.getDescricaoById(9L));
	}	
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Brasileiro", NacionalidadeValues.getDescricaoById((byte) 1));
		assertEquals("Estrangeiro com Visto Permanente", NacionalidadeValues.getDescricaoById((byte) 2));
		assertEquals("Estrangeiro com Visto Temporário", NacionalidadeValues.getDescricaoById((byte) 3));
		assertEquals("Naturalizado", NacionalidadeValues.getDescricaoById((byte) 4));
		assertEquals("Português com Residência Permanente", NacionalidadeValues.getDescricaoById((byte) 5));
		assertEquals("Estrangeiro com Domicílio no Exterior", NacionalidadeValues.getDescricaoById((byte) 6));
		
		assertNotEquals("N/A", NacionalidadeValues.getDescricaoById((byte) 9));
	}

	@Test
	public void testParse() {
		assertEquals(NacionalidadeValues.BRASILEIRO,NacionalidadeValues.parse(1));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_COM_VISTO_PERMANENTE,NacionalidadeValues.parse(2));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_COM_VISTO_TEMPORARIO,NacionalidadeValues.parse(3));
		assertEquals(NacionalidadeValues.NATURALIZADO,NacionalidadeValues.parse(4));
		assertEquals(NacionalidadeValues.PORTUGUES_COM_RESIDENCIA_PERMANENTE,NacionalidadeValues.parse(5));
		assertEquals(NacionalidadeValues.ESTRANGEIRO_DOMICILIO_EXTERIOR,NacionalidadeValues.parse(6));
		
		assertNotEquals(NacionalidadeValues.ESTRANGEIRO_DOMICILIO_EXTERIOR,NacionalidadeValues.parse(9));
	}	
	
}
