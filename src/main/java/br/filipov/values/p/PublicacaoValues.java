package br.filipov.values.p;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum PublicacaoValues {
	
	PUBLICA(1,"Pública"),
	INTERNA(2,"Interna"),
	RESTRITA(3, "Restrita"),
	CONFIDENCIAL(4, "Confidencial");
	
	private Integer codigo;
	private String descricao;
	
	private PublicacaoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (PublicacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (PublicacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (PublicacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (PublicacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static PublicacaoValues parse(int id){
		PublicacaoValues retorno = null;
		for (PublicacaoValues v: values()){
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
