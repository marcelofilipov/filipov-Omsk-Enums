package br.filipov.values.u;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnidadeFederalValuesTest {

	@Test
	public void testGetSiglaByIdShort() {
		assertEquals("AC",UnidadeFederalValues.getSiglaById((short) 12));
		assertEquals("AL",UnidadeFederalValues.getSiglaById((short) 27));
		assertEquals("AP",UnidadeFederalValues.getSiglaById((short) 16));
		assertEquals("AM",UnidadeFederalValues.getSiglaById((short) 13));
		assertEquals("BA",UnidadeFederalValues.getSiglaById((short) 29));
		assertEquals("CE",UnidadeFederalValues.getSiglaById((short) 23));
		assertEquals("DF",UnidadeFederalValues.getSiglaById((short) 53));
		assertEquals("ES",UnidadeFederalValues.getSiglaById((short) 32));
		assertEquals("GO",UnidadeFederalValues.getSiglaById((short) 52));
		assertEquals("MA",UnidadeFederalValues.getSiglaById((short) 21));
		assertEquals("MT",UnidadeFederalValues.getSiglaById((short) 51));
		assertEquals("MS",UnidadeFederalValues.getSiglaById((short) 50));
		assertEquals("MG",UnidadeFederalValues.getSiglaById((short) 31));
		assertEquals("PA",UnidadeFederalValues.getSiglaById((short) 15));
		assertEquals("PB",UnidadeFederalValues.getSiglaById((short) 25));
		assertEquals("PR",UnidadeFederalValues.getSiglaById((short) 41));
		assertEquals("PE",UnidadeFederalValues.getSiglaById((short) 26));
		assertEquals("PI",UnidadeFederalValues.getSiglaById((short) 22));
		assertEquals("RJ",UnidadeFederalValues.getSiglaById((short) 33));
		assertEquals("RN",UnidadeFederalValues.getSiglaById((short) 24));
		assertEquals("RS",UnidadeFederalValues.getSiglaById((short) 43));
		assertEquals("RO",UnidadeFederalValues.getSiglaById((short) 11));
		assertEquals("RR",UnidadeFederalValues.getSiglaById((short) 14));
		assertEquals("SC",UnidadeFederalValues.getSiglaById((short) 42));
		assertEquals("SP",UnidadeFederalValues.getSiglaById((short) 35));
		assertEquals("SE",UnidadeFederalValues.getSiglaById((short) 28));
		assertEquals("TO",UnidadeFederalValues.getSiglaById((short) 17));
	}

	@Test
	public void testGetSiglaByIdLong() {
		assertEquals("AC",UnidadeFederalValues.getSiglaById(12L));
		assertEquals("AL",UnidadeFederalValues.getSiglaById(27L));
		assertEquals("AP",UnidadeFederalValues.getSiglaById(16L));
		assertEquals("AM",UnidadeFederalValues.getSiglaById(13L));
		assertEquals("BA",UnidadeFederalValues.getSiglaById(29L));
		assertEquals("CE",UnidadeFederalValues.getSiglaById(23L));
		assertEquals("DF",UnidadeFederalValues.getSiglaById(53L));
		assertEquals("GO",UnidadeFederalValues.getSiglaById(52L));
		assertEquals("ES",UnidadeFederalValues.getSiglaById(32L));
		assertEquals("MA",UnidadeFederalValues.getSiglaById(21L));
		assertEquals("MT",UnidadeFederalValues.getSiglaById(51L));
		assertEquals("MS",UnidadeFederalValues.getSiglaById(50L));
		assertEquals("MG",UnidadeFederalValues.getSiglaById(31L));
		assertEquals("PA",UnidadeFederalValues.getSiglaById(15L));
		assertEquals("PB",UnidadeFederalValues.getSiglaById(25L));
		assertEquals("PR",UnidadeFederalValues.getSiglaById(41L));
		assertEquals("PE",UnidadeFederalValues.getSiglaById(26L));
		assertEquals("PI",UnidadeFederalValues.getSiglaById(22L));
		assertEquals("RJ",UnidadeFederalValues.getSiglaById(33L));
		assertEquals("RN",UnidadeFederalValues.getSiglaById(24L));
		assertEquals("RS",UnidadeFederalValues.getSiglaById(43L));
		assertEquals("RO",UnidadeFederalValues.getSiglaById(11L));
		assertEquals("RR",UnidadeFederalValues.getSiglaById(14L));
		assertEquals("SC",UnidadeFederalValues.getSiglaById(42L));
		assertEquals("SP",UnidadeFederalValues.getSiglaById(35L));
		assertEquals("SE",UnidadeFederalValues.getSiglaById(28L));
		assertEquals("TO",UnidadeFederalValues.getSiglaById(17L));
	}

	@Test
	public void testGetSiglaByIdByte() {
		assertEquals("AC",UnidadeFederalValues.getSiglaById((byte) 12));
		assertEquals("AL",UnidadeFederalValues.getSiglaById((byte) 27));
		assertEquals("AP",UnidadeFederalValues.getSiglaById((byte) 16));
		assertEquals("AM",UnidadeFederalValues.getSiglaById((byte) 13));
		assertEquals("BA",UnidadeFederalValues.getSiglaById((byte) 29));
		assertEquals("CE",UnidadeFederalValues.getSiglaById((byte) 23));
		assertEquals("DF",UnidadeFederalValues.getSiglaById((byte) 53));
		assertEquals("ES",UnidadeFederalValues.getSiglaById((byte) 32));
		assertEquals("GO",UnidadeFederalValues.getSiglaById((byte) 52));
		assertEquals("MA",UnidadeFederalValues.getSiglaById((byte) 21));
		assertEquals("MT",UnidadeFederalValues.getSiglaById((byte) 51));
		assertEquals("MS",UnidadeFederalValues.getSiglaById((byte) 50));
		assertEquals("MG",UnidadeFederalValues.getSiglaById((byte) 31));
		assertEquals("PA",UnidadeFederalValues.getSiglaById((byte) 15));
		assertEquals("PB",UnidadeFederalValues.getSiglaById((byte) 25));
		assertEquals("PR",UnidadeFederalValues.getSiglaById((byte) 41));
		assertEquals("PE",UnidadeFederalValues.getSiglaById((byte) 26));
		assertEquals("PI",UnidadeFederalValues.getSiglaById((byte) 22));
		assertEquals("RJ",UnidadeFederalValues.getSiglaById((byte) 33));
		assertEquals("RN",UnidadeFederalValues.getSiglaById((byte) 24));
		assertEquals("RS",UnidadeFederalValues.getSiglaById((byte) 43));
		assertEquals("RO",UnidadeFederalValues.getSiglaById((byte) 11));
		assertEquals("RR",UnidadeFederalValues.getSiglaById((byte) 14));
		assertEquals("SC",UnidadeFederalValues.getSiglaById((byte) 42));
		assertEquals("SP",UnidadeFederalValues.getSiglaById((byte) 35));
		assertEquals("SE",UnidadeFederalValues.getSiglaById((byte) 28));
		assertEquals("TO",UnidadeFederalValues.getSiglaById((byte) 17));
	}

	@Test
	public void testGetSiglaByIdInt() {
		assertEquals("AC",UnidadeFederalValues.getSiglaById(12));
		assertEquals("AL",UnidadeFederalValues.getSiglaById(27));
		assertEquals("AP",UnidadeFederalValues.getSiglaById(16));
		assertEquals("AM",UnidadeFederalValues.getSiglaById(13));
		assertEquals("BA",UnidadeFederalValues.getSiglaById(29));
		assertEquals("CE",UnidadeFederalValues.getSiglaById(23));
		assertEquals("DF",UnidadeFederalValues.getSiglaById(53));
		assertEquals("ES",UnidadeFederalValues.getSiglaById(32));
		assertEquals("GO",UnidadeFederalValues.getSiglaById(52));
		assertEquals("MT",UnidadeFederalValues.getSiglaById(51));
		assertEquals("MA",UnidadeFederalValues.getSiglaById(21));
		assertEquals("MS",UnidadeFederalValues.getSiglaById(50));
		assertEquals("MG",UnidadeFederalValues.getSiglaById(31));
		assertEquals("PA",UnidadeFederalValues.getSiglaById(15));
		assertEquals("PB",UnidadeFederalValues.getSiglaById(25));
		assertEquals("PR",UnidadeFederalValues.getSiglaById(41));
		assertEquals("PE",UnidadeFederalValues.getSiglaById(26));
		assertEquals("PI",UnidadeFederalValues.getSiglaById(22));
		assertEquals("RJ",UnidadeFederalValues.getSiglaById(33));
		assertEquals("RN",UnidadeFederalValues.getSiglaById(24));
		assertEquals("RS",UnidadeFederalValues.getSiglaById(43));
		assertEquals("RO",UnidadeFederalValues.getSiglaById(11));
		assertEquals("RR",UnidadeFederalValues.getSiglaById(14));
		assertEquals("SC",UnidadeFederalValues.getSiglaById(42));
		assertEquals("SP",UnidadeFederalValues.getSiglaById(35));
		assertEquals("SE",UnidadeFederalValues.getSiglaById(28));
		assertEquals("TO",UnidadeFederalValues.getSiglaById(17));		
	}
	
	@Test
	public void testGetUfByIdInt() {
		assertEquals("Acre",UnidadeFederalValues.getUfById(12));
		assertEquals("Alagoas",UnidadeFederalValues.getUfById(27));
		assertEquals("Amapá",UnidadeFederalValues.getUfById(16));
		assertEquals("Amazonas",UnidadeFederalValues.getUfById(13));
		assertEquals("Bahia",UnidadeFederalValues.getUfById(29));
		assertEquals("Ceará",UnidadeFederalValues.getUfById(23));
		assertEquals("Distrito Federal",UnidadeFederalValues.getUfById(53));
		assertEquals("Espírito Santo",UnidadeFederalValues.getUfById(32));
		assertEquals("Goiás",UnidadeFederalValues.getUfById(52));
		assertEquals("Mato Grosso",UnidadeFederalValues.getUfById(51));
		assertEquals("Maranhão",UnidadeFederalValues.getUfById(21));
		assertEquals("Mato Grosso do Sul",UnidadeFederalValues.getUfById(50));
		assertEquals("Minas Gerais",UnidadeFederalValues.getUfById(31));
		assertEquals("Pará",UnidadeFederalValues.getUfById(15));
		assertEquals("Paraíba",UnidadeFederalValues.getUfById(25));
		assertEquals("Paraná",UnidadeFederalValues.getUfById(41));
		assertEquals("Pernambuco",UnidadeFederalValues.getUfById(26));
		assertEquals("Piauí",UnidadeFederalValues.getUfById(22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getUfById(33));
		assertEquals("Rio Grande do Norte",UnidadeFederalValues.getUfById(24));
		assertEquals("Rio Grande do Sul",UnidadeFederalValues.getUfById(43));
		assertEquals("Rondônia",UnidadeFederalValues.getUfById(11));
		assertEquals("Roraima",UnidadeFederalValues.getUfById(14));
		assertEquals("Santa Catarina",UnidadeFederalValues.getUfById(42));
		assertEquals("São Paulo",UnidadeFederalValues.getUfById(35));
		assertEquals("Sergipe",UnidadeFederalValues.getUfById(28));
		assertEquals("Tocantins",UnidadeFederalValues.getUfById(17));		
	}
	
	@Test
	public void testGetUfByIdLong() {
		assertEquals("Acre",UnidadeFederalValues.getUfById(12L));
		assertEquals("Alagoas",UnidadeFederalValues.getUfById(27L));
		assertEquals("Amapá",UnidadeFederalValues.getUfById(16L));
		assertEquals("Amazonas",UnidadeFederalValues.getUfById(13L));
		assertEquals("Bahia",UnidadeFederalValues.getUfById(29L));
		assertEquals("Ceará",UnidadeFederalValues.getUfById(23L));
		assertEquals("Distrito Federal",UnidadeFederalValues.getUfById(53L));
		assertEquals("Espírito Santo",UnidadeFederalValues.getUfById(32L));
		assertEquals("Goiás",UnidadeFederalValues.getUfById(52L));
		assertEquals("Mato Grosso",UnidadeFederalValues.getUfById(51L));
		assertEquals("Maranhão",UnidadeFederalValues.getUfById(21L));
		assertEquals("Mato Grosso do Sul",UnidadeFederalValues.getUfById(50L));
		assertEquals("Minas Gerais",UnidadeFederalValues.getUfById(31L));
		assertEquals("Pará",UnidadeFederalValues.getUfById(15L));
		assertEquals("Paraíba",UnidadeFederalValues.getUfById(25L));
		assertEquals("Paraná",UnidadeFederalValues.getUfById(41L));
		assertEquals("Pernambuco",UnidadeFederalValues.getUfById(26L));
		assertEquals("Piauí",UnidadeFederalValues.getUfById(22L));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getUfById(33L));
		assertEquals("Rio Grande do Norte",UnidadeFederalValues.getUfById(24L));
		assertEquals("Rio Grande do Sul",UnidadeFederalValues.getUfById(43L));
		assertEquals("Rondônia",UnidadeFederalValues.getUfById(11L));
		assertEquals("Roraima",UnidadeFederalValues.getUfById(14L));
		assertEquals("Santa Catarina",UnidadeFederalValues.getUfById(42L));
		assertEquals("São Paulo",UnidadeFederalValues.getUfById(35L));
		assertEquals("Sergipe",UnidadeFederalValues.getUfById(28L));
		assertEquals("Tocantins",UnidadeFederalValues.getUfById(17L));		
	}
	
	@Test
	public void testGetUfByIdByte() {
		assertEquals("Acre",UnidadeFederalValues.getUfById((byte) 12));
		assertEquals("Alagoas",UnidadeFederalValues.getUfById((byte) 27));
		assertEquals("Amapá",UnidadeFederalValues.getUfById((byte) 16));
		assertEquals("Amazonas",UnidadeFederalValues.getUfById((byte) 13));
		assertEquals("Bahia",UnidadeFederalValues.getUfById((byte) 29));
		assertEquals("Ceará",UnidadeFederalValues.getUfById((byte) 23));
		assertEquals("Distrito Federal",UnidadeFederalValues.getUfById((byte) 53));
		assertEquals("Espírito Santo",UnidadeFederalValues.getUfById((byte) 32));
		assertEquals("Goiás",UnidadeFederalValues.getUfById((byte) 52));
		assertEquals("Mato Grosso",UnidadeFederalValues.getUfById((byte) 51));
		assertEquals("Maranhão",UnidadeFederalValues.getUfById((byte) 21));
		assertEquals("Mato Grosso do Sul",UnidadeFederalValues.getUfById((byte) 50));
		assertEquals("Minas Gerais",UnidadeFederalValues.getUfById((byte) 31));
		assertEquals("Pará",UnidadeFederalValues.getUfById((byte) 15));
		assertEquals("Paraíba",UnidadeFederalValues.getUfById((byte) 25));
		assertEquals("Paraná",UnidadeFederalValues.getUfById((byte) 41));
		assertEquals("Pernambuco",UnidadeFederalValues.getUfById((byte) 26));
		assertEquals("Piauí",UnidadeFederalValues.getUfById((byte) 22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getUfById((byte) 33));
		assertEquals("Rio Grande do Norte",UnidadeFederalValues.getUfById((byte) 24));
		assertEquals("Rio Grande do Sul",UnidadeFederalValues.getUfById((byte) 43));
		assertEquals("Rondônia",UnidadeFederalValues.getUfById((byte) 11));
		assertEquals("Roraima",UnidadeFederalValues.getUfById((byte) 14));
		assertEquals("Santa Catarina",UnidadeFederalValues.getUfById((byte) 42));
		assertEquals("São Paulo",UnidadeFederalValues.getUfById((byte) 35));
		assertEquals("Sergipe",UnidadeFederalValues.getUfById((byte) 28));
		assertEquals("Tocantins",UnidadeFederalValues.getUfById((byte) 17));		
	}
	
	@Test
	public void testGetUfByIdShort() {
		assertEquals("Acre",UnidadeFederalValues.getUfById((short) 12));
		assertEquals("Alagoas",UnidadeFederalValues.getUfById((short) 27));
		assertEquals("Amapá",UnidadeFederalValues.getUfById((short) 16));
		assertEquals("Amazonas",UnidadeFederalValues.getUfById((short) 13));
		assertEquals("Bahia",UnidadeFederalValues.getUfById((short) 29));
		assertEquals("Ceará",UnidadeFederalValues.getUfById((short) 23));
		assertEquals("Distrito Federal",UnidadeFederalValues.getUfById((short) 53));
		assertEquals("Espírito Santo",UnidadeFederalValues.getUfById((short) 32));
		assertEquals("Goiás",UnidadeFederalValues.getUfById((short) 52));
		assertEquals("Mato Grosso",UnidadeFederalValues.getUfById((short) 51));
		assertEquals("Maranhão",UnidadeFederalValues.getUfById((short) 21));
		assertEquals("Mato Grosso do Sul",UnidadeFederalValues.getUfById((short) 50));
		assertEquals("Minas Gerais",UnidadeFederalValues.getUfById((short) 31));
		assertEquals("Pará",UnidadeFederalValues.getUfById((short) 15));
		assertEquals("Paraíba",UnidadeFederalValues.getUfById((short) 25));
		assertEquals("Paraná",UnidadeFederalValues.getUfById((short) 41));
		assertEquals("Pernambuco",UnidadeFederalValues.getUfById((short) 26));
		assertEquals("Piauí",UnidadeFederalValues.getUfById((short) 22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getUfById((short) 33));
		assertEquals("Rio Grande do Norte",UnidadeFederalValues.getUfById((short) 24));
		assertEquals("Rio Grande do Sul",UnidadeFederalValues.getUfById((short) 43));
		assertEquals("Rondônia",UnidadeFederalValues.getUfById((short) 11));
		assertEquals("Roraima",UnidadeFederalValues.getUfById((short) 14));
		assertEquals("Santa Catarina",UnidadeFederalValues.getUfById((short) 42));
		assertEquals("São Paulo",UnidadeFederalValues.getUfById((short) 35));
		assertEquals("Sergipe",UnidadeFederalValues.getUfById((short) 28));
		assertEquals("Tocantins",UnidadeFederalValues.getUfById((short) 17));		
	}
	
	@Test
	public void testGetUfBySigla() {
		assertEquals("Acre",UnidadeFederalValues.getUfBySigla("AC"));
		assertEquals("Alagoas",UnidadeFederalValues.getUfBySigla("AL"));
		assertEquals("Amapá",UnidadeFederalValues.getUfBySigla("AP"));
		assertEquals("Amazonas",UnidadeFederalValues.getUfBySigla("AM"));
		assertEquals("Bahia",UnidadeFederalValues.getUfBySigla("BA"));
		assertEquals("Ceará",UnidadeFederalValues.getUfBySigla("CE"));
		assertEquals("Distrito Federal",UnidadeFederalValues.getUfBySigla("DF"));
		assertEquals("Espírito Santo",UnidadeFederalValues.getUfBySigla("ES"));
		assertEquals("Goiás",UnidadeFederalValues.getUfBySigla("GO"));
		assertEquals("Mato Grosso",UnidadeFederalValues.getUfBySigla("MT"));
		assertEquals("Maranhão",UnidadeFederalValues.getUfBySigla("MA"));
		assertEquals("Mato Grosso do Sul",UnidadeFederalValues.getUfBySigla("MS"));
		assertEquals("Minas Gerais",UnidadeFederalValues.getUfBySigla("MG"));
		assertEquals("Pará",UnidadeFederalValues.getUfBySigla("PA"));
		assertEquals("Paraíba",UnidadeFederalValues.getUfBySigla("PB"));
		assertEquals("Paraná",UnidadeFederalValues.getUfBySigla("PR"));
		assertEquals("Pernambuco",UnidadeFederalValues.getUfBySigla("PE"));
		assertEquals("Piauí",UnidadeFederalValues.getUfBySigla("PI"));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getUfBySigla("RJ"));
		assertEquals("Rio Grande do Norte",UnidadeFederalValues.getUfBySigla("RN"));
		assertEquals("Rio Grande do Sul",UnidadeFederalValues.getUfBySigla("RS"));
		assertEquals("Rondônia",UnidadeFederalValues.getUfBySigla("RO"));
		assertEquals("Roraima",UnidadeFederalValues.getUfBySigla("RR"));
		assertEquals("Santa Catarina",UnidadeFederalValues.getUfBySigla("SC"));
		assertEquals("São Paulo",UnidadeFederalValues.getUfBySigla("SP"));
		assertEquals("Sergipe",UnidadeFederalValues.getUfBySigla("SE"));
		assertEquals("Tocantins",UnidadeFederalValues.getUfBySigla("TO"));		
	}
	
	@Test
	public void testGetCapitalByIdInt() {
		assertEquals("Rio Branco",UnidadeFederalValues.getCapitalById(12));
		assertEquals("Maceió",UnidadeFederalValues.getCapitalById(27));
		assertEquals("Macapá",UnidadeFederalValues.getCapitalById(16));
		assertEquals("Manaus",UnidadeFederalValues.getCapitalById(13));
		assertEquals("Salvador",UnidadeFederalValues.getCapitalById(29));
		assertEquals("Fortaleza",UnidadeFederalValues.getCapitalById(23));
		assertEquals("Brasília",UnidadeFederalValues.getCapitalById(53));
		assertEquals("Vitória",UnidadeFederalValues.getCapitalById(32));
		assertEquals("Goiânia",UnidadeFederalValues.getCapitalById(52));
		assertEquals("Cuiabá",UnidadeFederalValues.getCapitalById(51));
		assertEquals("São Luís",UnidadeFederalValues.getCapitalById(21));
		assertEquals("Campo Grande",UnidadeFederalValues.getCapitalById(50));
		assertEquals("Belo Horizonte",UnidadeFederalValues.getCapitalById(31));
		assertEquals("Belém",UnidadeFederalValues.getCapitalById(15));
		assertEquals("João Pessoa",UnidadeFederalValues.getCapitalById(25));
		assertEquals("Curitiba",UnidadeFederalValues.getCapitalById(41));
		assertEquals("Recife",UnidadeFederalValues.getCapitalById(26));
		assertEquals("Teresina",UnidadeFederalValues.getCapitalById(22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getCapitalById(33));
		assertEquals("Natal",UnidadeFederalValues.getCapitalById(24));
		assertEquals("Porto Alegre",UnidadeFederalValues.getCapitalById(43));
		assertEquals("Porto Velho",UnidadeFederalValues.getCapitalById(11));
		assertEquals("Boa Vista",UnidadeFederalValues.getCapitalById(14));
		assertEquals("Florianópolis",UnidadeFederalValues.getCapitalById(42));
		assertEquals("São Paulo",UnidadeFederalValues.getCapitalById(35));
		assertEquals("Aracajú",UnidadeFederalValues.getCapitalById(28));
		assertEquals("Palmas",UnidadeFederalValues.getCapitalById(17));		
	}

	@Test
	public void testGetCapitalByIdLong() {
		assertEquals("Rio Branco",UnidadeFederalValues.getCapitalById(12L));
		assertEquals("Maceió",UnidadeFederalValues.getCapitalById(27L));
		assertEquals("Macapá",UnidadeFederalValues.getCapitalById(16L));
		assertEquals("Manaus",UnidadeFederalValues.getCapitalById(13L));
		assertEquals("Salvador",UnidadeFederalValues.getCapitalById(29L));
		assertEquals("Fortaleza",UnidadeFederalValues.getCapitalById(23L));
		assertEquals("Brasília",UnidadeFederalValues.getCapitalById(53L));
		assertEquals("Vitória",UnidadeFederalValues.getCapitalById(32L));
		assertEquals("Goiânia",UnidadeFederalValues.getCapitalById(52L));
		assertEquals("Cuiabá",UnidadeFederalValues.getCapitalById(51L));
		assertEquals("São Luís",UnidadeFederalValues.getCapitalById(21L));
		assertEquals("Campo Grande",UnidadeFederalValues.getCapitalById(50L));
		assertEquals("Belo Horizonte",UnidadeFederalValues.getCapitalById(31L));
		assertEquals("Belém",UnidadeFederalValues.getCapitalById(15L));
		assertEquals("João Pessoa",UnidadeFederalValues.getCapitalById(25L));
		assertEquals("Curitiba",UnidadeFederalValues.getCapitalById(41L));
		assertEquals("Recife",UnidadeFederalValues.getCapitalById(26L));
		assertEquals("Teresina",UnidadeFederalValues.getCapitalById(22L));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getCapitalById(33L));
		assertEquals("Natal",UnidadeFederalValues.getCapitalById(24L));
		assertEquals("Porto Alegre",UnidadeFederalValues.getCapitalById(43L));
		assertEquals("Porto Velho",UnidadeFederalValues.getCapitalById(11L));
		assertEquals("Boa Vista",UnidadeFederalValues.getCapitalById(14L));
		assertEquals("Florianópolis",UnidadeFederalValues.getCapitalById(42L));
		assertEquals("São Paulo",UnidadeFederalValues.getCapitalById(35L));
		assertEquals("Aracajú",UnidadeFederalValues.getCapitalById(28L));
		assertEquals("Palmas",UnidadeFederalValues.getCapitalById(17L));		
	}
	
	@Test
	public void testGetCapitalByIdByte() {
		assertEquals("Rio Branco",UnidadeFederalValues.getCapitalById((byte) 12));
		assertEquals("Maceió",UnidadeFederalValues.getCapitalById((byte) 27));
		assertEquals("Macapá",UnidadeFederalValues.getCapitalById((byte) 16));
		assertEquals("Manaus",UnidadeFederalValues.getCapitalById((byte) 13));
		assertEquals("Salvador",UnidadeFederalValues.getCapitalById((byte) 29));
		assertEquals("Fortaleza",UnidadeFederalValues.getCapitalById((byte) 23));
		assertEquals("Brasília",UnidadeFederalValues.getCapitalById((byte) 53));
		assertEquals("Vitória",UnidadeFederalValues.getCapitalById((byte) 32));
		assertEquals("Goiânia",UnidadeFederalValues.getCapitalById((byte) 52));
		assertEquals("Cuiabá",UnidadeFederalValues.getCapitalById((byte) 51));
		assertEquals("São Luís",UnidadeFederalValues.getCapitalById((byte) 21));
		assertEquals("Campo Grande",UnidadeFederalValues.getCapitalById((byte) 50));
		assertEquals("Belo Horizonte",UnidadeFederalValues.getCapitalById((byte) 31));
		assertEquals("Belém",UnidadeFederalValues.getCapitalById((byte) 15));
		assertEquals("João Pessoa",UnidadeFederalValues.getCapitalById((byte) 25));
		assertEquals("Curitiba",UnidadeFederalValues.getCapitalById((byte) 41));
		assertEquals("Recife",UnidadeFederalValues.getCapitalById((byte) 26));
		assertEquals("Teresina",UnidadeFederalValues.getCapitalById((byte) 22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getCapitalById((byte) 33));
		assertEquals("Natal",UnidadeFederalValues.getCapitalById((byte) 24));
		assertEquals("Porto Alegre",UnidadeFederalValues.getCapitalById((byte) 43));
		assertEquals("Porto Velho",UnidadeFederalValues.getCapitalById((byte) 11));
		assertEquals("Boa Vista",UnidadeFederalValues.getCapitalById((byte) 14));
		assertEquals("Florianópolis",UnidadeFederalValues.getCapitalById((byte) 42));
		assertEquals("São Paulo",UnidadeFederalValues.getCapitalById((byte) 35));
		assertEquals("Aracajú",UnidadeFederalValues.getCapitalById((byte) 28));
		assertEquals("Palmas",UnidadeFederalValues.getCapitalById((byte) 17));		
	}
	
	@Test
	public void testGetCapitalByIdShort() {
		assertEquals("Rio Branco",UnidadeFederalValues.getCapitalById((short) 12));
		assertEquals("Maceió",UnidadeFederalValues.getCapitalById((short) 27));
		assertEquals("Macapá",UnidadeFederalValues.getCapitalById((short) 16));
		assertEquals("Manaus",UnidadeFederalValues.getCapitalById((short) 13));
		assertEquals("Salvador",UnidadeFederalValues.getCapitalById((short) 29));
		assertEquals("Fortaleza",UnidadeFederalValues.getCapitalById((short) 23));
		assertEquals("Brasília",UnidadeFederalValues.getCapitalById((short) 53));
		assertEquals("Vitória",UnidadeFederalValues.getCapitalById((short) 32));
		assertEquals("Goiânia",UnidadeFederalValues.getCapitalById((short) 52));
		assertEquals("Cuiabá",UnidadeFederalValues.getCapitalById((short) 51));
		assertEquals("São Luís",UnidadeFederalValues.getCapitalById((short) 21));
		assertEquals("Campo Grande",UnidadeFederalValues.getCapitalById((short) 50));
		assertEquals("Belo Horizonte",UnidadeFederalValues.getCapitalById((short) 31));
		assertEquals("Belém",UnidadeFederalValues.getCapitalById((short) 15));
		assertEquals("João Pessoa",UnidadeFederalValues.getCapitalById((short) 25));
		assertEquals("Curitiba",UnidadeFederalValues.getCapitalById((short) 41));
		assertEquals("Recife",UnidadeFederalValues.getCapitalById((short) 26));
		assertEquals("Teresina",UnidadeFederalValues.getCapitalById((short) 22));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getCapitalById((short) 33));
		assertEquals("Natal",UnidadeFederalValues.getCapitalById((short) 24));
		assertEquals("Porto Alegre",UnidadeFederalValues.getCapitalById((short) 43));
		assertEquals("Porto Velho",UnidadeFederalValues.getCapitalById((short) 11));
		assertEquals("Boa Vista",UnidadeFederalValues.getCapitalById((short) 14));
		assertEquals("Florianópolis",UnidadeFederalValues.getCapitalById((short) 42));
		assertEquals("São Paulo",UnidadeFederalValues.getCapitalById((short) 35));
		assertEquals("Aracajú",UnidadeFederalValues.getCapitalById((short) 28));
		assertEquals("Palmas",UnidadeFederalValues.getCapitalById((short) 17));		
	}
	
	@Test
	public void testGetCapitalBySigla() {
		assertEquals("Rio Branco",UnidadeFederalValues.getCapitalBySigla("AC"));
		assertEquals("Maceió",UnidadeFederalValues.getCapitalBySigla("AL"));
		assertEquals("Macapá",UnidadeFederalValues.getCapitalBySigla("AP"));
		assertEquals("Manaus",UnidadeFederalValues.getCapitalBySigla("AM"));
		assertEquals("Salvador",UnidadeFederalValues.getCapitalBySigla("BA"));
		assertEquals("Fortaleza",UnidadeFederalValues.getCapitalBySigla("CE"));
		assertEquals("Brasília",UnidadeFederalValues.getCapitalBySigla("DF"));
		assertEquals("Vitória",UnidadeFederalValues.getCapitalBySigla("ES"));
		assertEquals("Goiânia",UnidadeFederalValues.getCapitalBySigla("GO"));
		assertEquals("Cuiabá",UnidadeFederalValues.getCapitalBySigla("MT"));
		assertEquals("São Luís",UnidadeFederalValues.getCapitalBySigla("MA"));
		assertEquals("Campo Grande",UnidadeFederalValues.getCapitalBySigla("MS"));
		assertEquals("Belo Horizonte",UnidadeFederalValues.getCapitalBySigla("MG"));
		assertEquals("Belém",UnidadeFederalValues.getCapitalBySigla("PA"));
		assertEquals("João Pessoa",UnidadeFederalValues.getCapitalBySigla("PB"));
		assertEquals("Curitiba",UnidadeFederalValues.getCapitalBySigla("PR"));
		assertEquals("Recife",UnidadeFederalValues.getCapitalBySigla("PE"));
		assertEquals("Teresina",UnidadeFederalValues.getCapitalBySigla("PI"));
		assertEquals("Rio de Janeiro",UnidadeFederalValues.getCapitalBySigla("RJ"));
		assertEquals("Natal",UnidadeFederalValues.getCapitalBySigla("RN"));
		assertEquals("Porto Alegre",UnidadeFederalValues.getCapitalBySigla("RS"));
		assertEquals("Porto Velho",UnidadeFederalValues.getCapitalBySigla("RO"));
		assertEquals("Boa Vista",UnidadeFederalValues.getCapitalBySigla("RR"));
		assertEquals("Florianópolis",UnidadeFederalValues.getCapitalBySigla("SC"));
		assertEquals("São Paulo",UnidadeFederalValues.getCapitalBySigla("SP"));
		assertEquals("Aracajú",UnidadeFederalValues.getCapitalBySigla("SE"));
		assertEquals("Palmas",UnidadeFederalValues.getCapitalBySigla("TO"));		
	}

//TODO - Não está concluído
	
//	@Test
//	public void testGetDescricaoByIdInteger() {
//		assertEquals("Visa",BandeiraCartaoValues.getDescricaoById(1));
//		assertEquals("MasterCard",BandeiraCartaoValues.getDescricaoById(2));
//		assertEquals("American Express",BandeiraCartaoValues.getDescricaoById(3));
//		assertEquals("Aura",BandeiraCartaoValues.getDescricaoById(4));
//		assertEquals("Elo",BandeiraCartaoValues.getDescricaoById(5));
//		assertEquals("Hipercard",BandeiraCartaoValues.getDescricaoById(6));
//		assertEquals("Sorocred",BandeiraCartaoValues.getDescricaoById(7));
//		assertEquals("BNDES",BandeiraCartaoValues.getDescricaoById(8));
//	}
//
//	@Test
//	public void testGetDescricaoByIdLong() {
//		assertEquals("Visa",BandeiraCartaoValues.getDescricaoById(1L));
//		assertEquals("MasterCard",BandeiraCartaoValues.getDescricaoById(2L));
//		assertEquals("American Express",BandeiraCartaoValues.getDescricaoById(3L));
//		assertEquals("Aura",BandeiraCartaoValues.getDescricaoById(4L));
//		assertEquals("Elo",BandeiraCartaoValues.getDescricaoById(5L));
//		assertEquals("Hipercard",BandeiraCartaoValues.getDescricaoById(6L));
//		assertEquals("Sorocred",BandeiraCartaoValues.getDescricaoById(7L));
//		assertEquals("BNDES",BandeiraCartaoValues.getDescricaoById(8L));
//	}	
//	
//	@Test
//	public void testGetDescricaoByIdByte() {
//		assertEquals("Visa",BandeiraCartaoValues.getDescricaoById((byte) 1));
//		assertEquals("MasterCard",BandeiraCartaoValues.getDescricaoById((byte) 2));
//		assertEquals("American Express",BandeiraCartaoValues.getDescricaoById((byte) 3));
//		assertEquals("Aura",BandeiraCartaoValues.getDescricaoById((byte) 4));
//		assertEquals("Elo",BandeiraCartaoValues.getDescricaoById((byte) 5));
//		assertEquals("Hipercard",BandeiraCartaoValues.getDescricaoById((byte) 6));
//		assertEquals("Sorocred",BandeiraCartaoValues.getDescricaoById((byte) 7));
//		assertEquals("BNDES",BandeiraCartaoValues.getDescricaoById((byte) 8));
//	}
//
//	@Test
//	public void testParse() {
//		assertEquals(BandeiraCartaoValues.VISA,BandeiraCartaoValues.parse(1));
//		assertEquals(BandeiraCartaoValues.MASTERCARD,BandeiraCartaoValues.parse(2));
//		assertEquals(BandeiraCartaoValues.AMERICAN_EXPRESS,BandeiraCartaoValues.parse(3));
//		assertEquals(BandeiraCartaoValues.AURA,BandeiraCartaoValues.parse(4));
//		assertEquals(BandeiraCartaoValues.ELO,BandeiraCartaoValues.parse(5));
//		assertEquals(BandeiraCartaoValues.HIPERCARD,BandeiraCartaoValues.parse(6));
//		assertEquals(BandeiraCartaoValues.SOROCRED,BandeiraCartaoValues.parse(7));
//		assertEquals(BandeiraCartaoValues.BNDES,BandeiraCartaoValues.parse(8));
//	}	
	
}
