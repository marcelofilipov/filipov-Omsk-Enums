package br.filipov.values.o;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum ObjetivoSistemicoValues {
	MTM(1, "MTM"),
	ABERTURA(2, "Abertura"),
	REALTIME(3, "Realtime"),
	PRECIFICACAO(4, "Precificação"),
	SIMULACAO(5, "Simulação");
	
	private Integer codigo;
	private String descricao;
	
	private ObjetivoSistemicoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (ObjetivoSistemicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (ObjetivoSistemicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (ObjetivoSistemicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (ObjetivoSistemicoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static ObjetivoSistemicoValues parse(int id){
		ObjetivoSistemicoValues retorno = null;
		for (ObjetivoSistemicoValues v: values()){
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