package br.filipov.values.c;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum ContagemDiasMesValues {

	ACT(0, "Act"), TRINTA(1, "30"); 
	
	private Integer codigo;
	private String descricao;

	private ContagemDiasMesValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (ContagemDiasMesValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (ContagemDiasMesValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (ContagemDiasMesValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (ContagemDiasMesValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static ContagemDiasMesValues parse(int id) {
		ContagemDiasMesValues retorno = null;
		for (ContagemDiasMesValues v: values()) {
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
