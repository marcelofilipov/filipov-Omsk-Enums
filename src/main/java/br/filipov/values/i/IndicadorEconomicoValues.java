package br.filipov.values.i;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum IndicadorEconomicoValues {

	CDI(1, "CDI"),
	EUR_PRONTO(2, "EUR Pronto"),
	EUR_REUTERS(3, "EUR Reuters"),
	PRE(4, "Pré"),
	SELIC(5, "Selic"),
	TR(6, "TR");

	private Integer codigo;
	private String descricao;

	private IndicadorEconomicoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (IndicadorEconomicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (IndicadorEconomicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (IndicadorEconomicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (IndicadorEconomicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static IndicadorEconomicoValues parse(int id){
		IndicadorEconomicoValues retorno = null;
		for (IndicadorEconomicoValues v: values()){
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