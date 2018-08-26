package br.filipov.values.s;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum SegmentoValues {

	CORPORATE(1, "Corporate"),
	EMPRESAS(2, "Empresas"),
	INSTITUCIONAL(3, "Institucional"),
	PRIVATE(4, "Private"),
	VAREJO(5, "Varejo");
	
	private Integer codigo;
	private String descricao;

	private SegmentoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (SegmentoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (SegmentoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (SegmentoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (SegmentoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static SegmentoValues parse(int id){
		SegmentoValues retorno = null;
		for (SegmentoValues v: values()){
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