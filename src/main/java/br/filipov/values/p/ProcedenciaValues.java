package br.filipov.values.p;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum ProcedenciaValues {

	NACIONAL(1, "Nacional"), INTERNACIONAL(2, "Internacional");

	private Integer codigo;
	private String descricao;

	private ProcedenciaValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (ProcedenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (ProcedenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (ProcedenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (ProcedenciaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static ProcedenciaValues parse(int id) {
		ProcedenciaValues retorno = null;
		for (ProcedenciaValues v : values()) {
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