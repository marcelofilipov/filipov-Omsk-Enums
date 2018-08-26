package br.filipov.values.b;

/**
 * @author Marcelo A. Filipov
 * @since 2013
 */
public enum BandeiraCartaoValues {

	VISA(1, "Visa"), MASTERCARD(2, "MasterCard"), AMERICAN_EXPRESS(3, "American Express"), AURA(4, "Aura"), 
	ELO(5, "Elo"), HIPERCARD(6, "Hipercard"), SOROCRED(7, "Sorocred"), BNDES(8, "BNDES");

	private Integer codigo;
	private String descricao;

	private BandeiraCartaoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (BandeiraCartaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (BandeiraCartaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (BandeiraCartaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (BandeiraCartaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static BandeiraCartaoValues parse(int id) {
		BandeiraCartaoValues retorno = null;
		for (BandeiraCartaoValues v : values()) {
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
