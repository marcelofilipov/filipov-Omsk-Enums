package br.filipov.values.u;

import br.filipov.values.r.RegiaoBrasilValues;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2011
 */
public enum UnidadeFederalValues {

	ACRE(12,"AC","Acre","Rio Branco",RegiaoBrasilValues.NORTE),
	ALAGOAS(27,"AL","Alagoas","Maceió",RegiaoBrasilValues.NORDESTE),
	AMAPA(16,"AP","Amapá","Macapá",RegiaoBrasilValues.NORTE),
	AMAZONAS(13,"AM","Amazonas","Manaus",RegiaoBrasilValues.NORTE),
	BAHIA(29,"BA","Bahia","Salvador",RegiaoBrasilValues.NORDESTE),
	CEARA(23,"CE","Ceará","Fortaleza",RegiaoBrasilValues.NORDESTE),
	DISTRITO_FEDERAL(53,"DF","Distrito Federal","Brasília",RegiaoBrasilValues.CENTRO_OESTE),
	ESPIRITO_SANTO(32,"ES","Espírito Santo","Vitória",RegiaoBrasilValues.SUDESTE),
	GOIAS(52,"GO","Goiás","Goiânia",RegiaoBrasilValues.CENTRO_OESTE),
	MARANHAO(21,"MA","Maranhão","São Luís",RegiaoBrasilValues.NORDESTE),
	MATO_GROSSO(51,"MT","Mato Grosso","Cuiabá",RegiaoBrasilValues.CENTRO_OESTE),
	MATO_GROSSO_DO_SUL(50,"MS","Mato Grosso do Sul","Campo Grande",RegiaoBrasilValues.CENTRO_OESTE),
	MINAS_GERAIS(31,"MG","Minas Gerais","Belo Horizonte",RegiaoBrasilValues.SUDESTE),
	PARA(15,"PA","Pará","Belém",RegiaoBrasilValues.NORTE),
	PARAIBA(25,"PB","Paraíba","João Pessoa",RegiaoBrasilValues.NORDESTE),
	PARANA(41,"PR","Paraná","Curitiba",RegiaoBrasilValues.SUL),
	PERNAMBUCO(26,"PE","Pernambuco","Recife",RegiaoBrasilValues.NORDESTE),
	PIAUI(22,"PI","Piauí","Teresina",RegiaoBrasilValues.NORDESTE),
	RIO_DE_JANEIRO(33,"RJ","Rio de Janeiro","Rio de Janeiro",RegiaoBrasilValues.SUDESTE),
	RIO_GRANDE_DO_NORTE(24,"RN","Rio Grande do Norte","Natal",RegiaoBrasilValues.NORDESTE),
	RIO_GRANDE_DO_SUL(43,"RS","Rio Grande do Sul","Porto Alegre",RegiaoBrasilValues.SUL),
	RONDONIA(11,"RO","Rondônia","Porto Velho",RegiaoBrasilValues.NORTE),
	RORAIMA(14,"RR","Roraima","Boa Vista",RegiaoBrasilValues.NORTE),
	SANTA_CATARINA(42,"SC","Santa Catarina","Florianópolis",RegiaoBrasilValues.SUL),
	SAO_PAULO(35,"SP","São Paulo","São Paulo",RegiaoBrasilValues.SUDESTE),
	SERGIPE(28,"SE","Sergipe","Aracajú",RegiaoBrasilValues.NORDESTE),
	TOCANTINS(17,"TO","Tocantins","Palmas",RegiaoBrasilValues.NORTE);
	
	private Integer codigo;
	private String sigla;
	private String uf;
	private String capital;
	private RegiaoBrasilValues regiao;
	
	private UnidadeFederalValues(Integer codigo, String sigla, String uf,
			String capital, RegiaoBrasilValues regiao) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.uf = uf;
		this.capital = capital;
		this.regiao = regiao;
	}

	public static String getSiglaById(int id) {
		String sigla = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}

	public static String getSiglaById(short id) {
		String sigla = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}

	public static String getSiglaById(byte id) {
		String sigla = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}

	public static String getSiglaById(long id) {
		String sigla = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}
	
	public static String getUfById(int id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getUf();
				break;
			}
		}
		return uf;
	}

	public static String getUfById(long id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getUf(); 
				break;
			}
		}
		return uf;
	}

	public static String getUfById(byte id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getUf(); 
				break;
			}
		}
		return uf;
	}

	public static String getUfById(short id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getUf(); 
				break;
			}
		}
		return uf;
	}

	public static String getUfBySigla(String sigla) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getSigla().equals(sigla)) {
				uf = v.getUf(); 
				break;
			}
		}
		return uf;
	}
	
	public static String getCapitalById(int id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getCapital();
				break;
			}
		}
		return uf;
	}

	public static String getCapitalById(long id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getCapital();
				break;
			}
		}
		return uf;
	}

	public static String getCapitalById(byte id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getCapital();
				break;
			}
		}
		return uf;
	}

	public static String getCapitalById(short id) {
		String uf = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getCodigo() == id) {
				uf = v.getCapital();
				break;
			}
		}
		return uf;
	}

	public static String getCapitalBySigla(String sigla) {
		String capital = null;
		for (UnidadeFederalValues v : values()) {
			if(v.getSigla().equals(sigla)) {
				capital = v.getCapital(); 
				break;
			}
		}
		return capital;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public String getUf() {
		return uf;
	}

	public String getCapital() {
		return capital;
	}

	public RegiaoBrasilValues getRegiao() {
		return regiao;
	}
	
}
