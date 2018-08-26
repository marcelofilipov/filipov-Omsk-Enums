package br.filipov.values.i;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum IndicadorTipoComposicaoCalculoValues {
	
	FIXO(1, "Fixo"), VARIAVEL(2, "Variável");

	private Integer codigo;
	private String descricao;

	private IndicadorTipoComposicaoCalculoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (IndicadorTipoComposicaoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (IndicadorTipoComposicaoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (IndicadorTipoComposicaoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (IndicadorTipoComposicaoCalculoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static IndicadorTipoComposicaoCalculoValues parse(int id){
		IndicadorTipoComposicaoCalculoValues retorno = null;
		for (IndicadorTipoComposicaoCalculoValues v: values()){
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
