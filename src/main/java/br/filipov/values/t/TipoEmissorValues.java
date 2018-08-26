/**
 * 
 */
package br.filipov.values.t;

/**
 * @author Marcelo A. Filipov
 * @since 2013
 */
public enum TipoEmissorValues {

	SMS(1, "SMS"), EMAIL(2, "E-mail"), JMS(3, "JMS");

	private Integer codigo;
	private String descricao;

	private TipoEmissorValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (TipoEmissorValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (TipoEmissorValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (TipoEmissorValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (TipoEmissorValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static TipoEmissorValues parse(int id){
		TipoEmissorValues retorno = null;
		for (TipoEmissorValues v: values()){
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
