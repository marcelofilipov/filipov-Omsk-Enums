package br.filipov.values.r;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2011
 */
public enum RegiaoBrasilValues {
	
	NORTE (1,"Norte"),
	NORDESTE (2,"Nordeste"),
	CENTRO_OESTE (3,"Centro-Oeste"),
	SUDESTE (4,"Sudeste"),
	SUL (5,"Sul");
	
	private Integer codigo;
	private String descricao;

	private RegiaoBrasilValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (RegiaoBrasilValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (RegiaoBrasilValues v : values()) {
			if(v.getCodigo() == id ) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (RegiaoBrasilValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (RegiaoBrasilValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static RegiaoBrasilValues parse(Integer id){
		RegiaoBrasilValues retorno = null;
		for (RegiaoBrasilValues v : values()) {
			if(v.getCodigo() != null && v.getCodigo().equals(id)) {
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
