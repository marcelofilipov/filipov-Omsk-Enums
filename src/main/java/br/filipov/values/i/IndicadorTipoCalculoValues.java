package br.filipov.values.i;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum IndicadorTipoCalculoValues {

	EXPONENCIAL(2, "Exponencial"), LINEAR(1, "Linear");

	private Integer codigo;
	private String descricao;

	private IndicadorTipoCalculoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (IndicadorTipoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (IndicadorTipoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (IndicadorTipoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (IndicadorTipoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static IndicadorTipoCalculoValues parse(int id){
		IndicadorTipoCalculoValues retorno = null;
		for (IndicadorTipoCalculoValues v: values()){
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