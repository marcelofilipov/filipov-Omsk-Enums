package br.filipov.values.t;

/**
 * @author Marcelo A. Filipov
 * @since 2013
 */
public enum TipoResidenciaValues {

	PROPRIA(1, "Própria"),
	ALUGADA(2, "Alugada"),
	FUNCIONAL(3, "Funcional"),
	FINANCIADA(4, "Financiada");
	
	private Integer codigo;
	private String descricao;
	
	private TipoResidenciaValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (TipoResidenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (TipoResidenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (TipoResidenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (TipoResidenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static TipoResidenciaValues parse(int id){
		TipoResidenciaValues retorno = null;
		for (TipoResidenciaValues v: values()){
			if (v.getCodigo() == id) {
				retorno = v;
				break;
			}
		}
		return retorno;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
