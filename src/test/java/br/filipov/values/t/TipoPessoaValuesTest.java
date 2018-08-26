package br.filipov.values.t;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.filipov.model.EnumHelper;

public class TipoPessoaValuesTest {

	@Test
	public void testGetDescricaoPorCodigo() {
		assertEquals("Pessoa Física", EnumHelper.getDescricaoPorCodigo(TipoPessoaValues.class, 1));
		assertEquals("Pessoa Jurídica", EnumHelper.getDescricaoPorCodigo(TipoPessoaValues.class, 2));
	}

	@Test
	public void testGetEnumPorCodigo() {
		assertEquals(TipoPessoaValues.FISICA, EnumHelper.getEnumPorCodigo(1, TipoPessoaValues.class));
		assertEquals(TipoPessoaValues.JURIDICA, EnumHelper.getEnumPorCodigo(2, TipoPessoaValues.class));
	}	

	
	
	@Test
	public void testGetDescricaoByIdShort() {
		assertEquals("Pessoa Física",TipoPessoaValues.getDescricaoById((short) 1));
		assertEquals("Pessoa Jurídica",TipoPessoaValues.getDescricaoById((short) 2));
	}
	
	@Test
	public void testGetDescricaoByIdByte() {
		assertEquals("Pessoa Física",TipoPessoaValues.getDescricaoById((byte) 1));
		assertEquals("Pessoa Jurídica",TipoPessoaValues.getDescricaoById((byte) 2));
	}

	@Test
	public void testGetDescricaoByIdInteger() {
		assertEquals("Pessoa Física",TipoPessoaValues.getDescricaoById(1));
		assertEquals("Pessoa Jurídica",TipoPessoaValues.getDescricaoById(2));
	}
	
	@Test
	public void testGetDescricaoByIdLong() {
		assertEquals("Pessoa Física",TipoPessoaValues.getDescricaoById(1L));
		assertEquals("Pessoa Jurídica",TipoPessoaValues.getDescricaoById(2L));
	}	

	@Test
	public void testGetSiglaByIdShort() {
		assertEquals("PF",TipoPessoaValues.getSiglaById((short) 1));
		assertEquals("PJ",TipoPessoaValues.getSiglaById((short) 2));
	}
	
	@Test
	public void testGetSiglaByIdByte() {
		assertEquals("PF",TipoPessoaValues.getSiglaById((byte) 1));
		assertEquals("PJ",TipoPessoaValues.getSiglaById((byte) 2));
	}

	@Test
	public void testGetSiglaByIdInteger() {
		assertEquals("PF",TipoPessoaValues.getSiglaById(1));
		assertEquals("PJ",TipoPessoaValues.getSiglaById(2));
	}
	
	@Test
	public void testGetSiglaByIdLong() {
		assertEquals("PF",TipoPessoaValues.getSiglaById(1L));
		assertEquals("PJ",TipoPessoaValues.getSiglaById(2L));
	}	

	@Test
	public void testParse() {
		assertEquals(TipoPessoaValues.FISICA,TipoPessoaValues.parse(1));
		assertEquals(TipoPessoaValues.JURIDICA,TipoPessoaValues.parse(2));
	}	
	
}
