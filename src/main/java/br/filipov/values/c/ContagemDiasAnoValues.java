package br.filipov.values.c;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum ContagemDiasAnoValues {

	TODOS(0, "Todos"),
	ACT(1, "Act"), 
	TREZENTOS_SESSENTA(2, "360"), 
	TREZENTOS_SESSENTA_CINCO(3, "365");

	private Integer codigo;
	private String descricao;

	private ContagemDiasAnoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (ContagemDiasAnoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (ContagemDiasAnoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (ContagemDiasAnoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (ContagemDiasAnoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static ContagemDiasAnoValues parse(int id){
		ContagemDiasAnoValues retorno = null;
		for (ContagemDiasAnoValues v: values()){
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
