package br.filipov.values.b;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum BancosValues {

	BRADESCO(237, "Bradesco"), CEF(151, "Caixa Econômica Federal"), ITAU_UNIBANCO(341, "Itaú Unibanco");

	private Integer codigo;
	private String descricao;

	private BancosValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (BancosValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (BancosValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (BancosValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static BancosValues parse(int id) {
		BancosValues retorno = null;
		for (BancosValues v : values()) {
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