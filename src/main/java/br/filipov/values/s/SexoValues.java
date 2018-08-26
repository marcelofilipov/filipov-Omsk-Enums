package br.filipov.values.s;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2014
 */
public enum SexoValues {

	MASCULINO(1,'M',"Masculino"),
	FEMININO(2,'F',"Feminino");
	
	private Integer codigo;
	private char sigla;
	private String descricao;

	private SexoValues(Integer codigo, char sigla, String descricao) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(int id) {
		String descricao = null;
		for (SexoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (SexoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (SexoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (SexoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoBySigla(char sigla) {
		String descricao = null;
		for (SexoValues v : values()) {
			if(v.getSigla() == sigla) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static SexoValues parse(int id){
		SexoValues retorno = null;
		for (SexoValues v : values()) {
			if(v.getCodigo() == id) {
				retorno = v;
				break;
			}
		}
		return retorno;		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public char getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

}
