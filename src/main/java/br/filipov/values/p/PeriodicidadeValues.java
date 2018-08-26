package br.filipov.values.p;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum PeriodicidadeValues {

	PER_252(1, "252", 252D, true),
	PER_360(2, "360", 360D, false),
	PER_365(3, "365", 365D, false),
	PER_OVER(6, "Over", 30D, true)/*,
	PER_30360_EURO(4L, "30/360(Europeu)", 360D, false),
	PER_30360_AMER(5L, "30/360(Americano)", 360D, false),
	PER_SEMI(7L, "Semi-anual", 360D, false)*/;
	
	private Integer codigo;
	private String descricao;
	private double periodicidade;
	private boolean du;

	private PeriodicidadeValues(Integer codigo, String descricao, double periodicidade, boolean du) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.periodicidade = periodicidade;
		this.du = du;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static PeriodicidadeValues parse(int id){
		PeriodicidadeValues retorno = null;
		for (PeriodicidadeValues v: values()){
			if (v.getCodigo() == id) {
				retorno = v;
				break;
			}
		}
		return retorno;
	}
	
	public static double getPeriodicidadeById(int id) {
		double periodicidade = 0D;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				periodicidade = v.getPeriodicidade();
				break;
			}
		}
		return periodicidade;
	}

	public static double getPeriodicidadeById(short id) {
		double periodicidade = 0D;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				periodicidade = v.getPeriodicidade();
				break;
			}
		}
		return periodicidade;
	}

	public static double getPeriodicidadeById(long id) {
		double periodicidade = 0D;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				periodicidade = v.getPeriodicidade();
				break;
			}
		}
		return periodicidade;
	}

	public static double getPeriodicidadeById(byte id) {
		double periodicidade = 0D;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				periodicidade = v.getPeriodicidade();
				break;
			}
		}
		return periodicidade;
	}

	public static boolean getDuById(int id) {
		boolean du = false;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				du = v.isDu();
				break;
			}
		}
		return du;
	}

	public static boolean getDuById(short id) {
		boolean du = false;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				du = v.isDu();
				break;
			}
		}
		return du;
	}

	public static boolean getDuById(long id) {
		boolean du = false;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				du = v.isDu();
				break;
			}
		}
		return du;
	}

	public static boolean getDuById(byte id) {
		boolean du = false;
		for (PeriodicidadeValues v : values()) {
			if (v.getCodigo() == id) {
				du = v.isDu();
				break;
			}
		}
		return du;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPeriodicidade() {
		return periodicidade;
	}

	public boolean isDu() {
		return du;
	}

}
