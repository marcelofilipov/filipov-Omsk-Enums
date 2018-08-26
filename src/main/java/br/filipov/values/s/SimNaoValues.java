package br.filipov.values.s;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2011
 */
public enum SimNaoValues {

	SIM(1, "Sim"), NAO(0, "Não");
	
	private Integer codigo;
	private String descricao;

	private SimNaoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(int id) {
		String descricao = null;
		for (SimNaoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (SimNaoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (SimNaoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (SimNaoValues v : values()) {
			if(v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static SimNaoValues parse(int id){
		SimNaoValues retorno = null;
		for (SimNaoValues v : values()) {
			if(v.getCodigo() == id) {
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
