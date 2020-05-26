package dds20_ej4.QueMePongo3;

public class Prenda {

	private TipoDePrenda TipoDePrenda;
//	private Categoria categoria;
	private String tela;
	private String colorPrincipal;
	private String colorSecundario;

/*	public enum Tipo {
		CAMISA , REMERA, PANTALON , ZAPATOS, AROS
	}

	public enum Categoria {
		SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
	}

	private void validarCategoria()  {
		switch (categoria) {
		case SUPERIOR :
			if (TipoDePrenda != Tipo.CAMISA && TipoDePrenda != Tipo.REMERA)
				throw new CategoriaInvalidaException();
			break;
		case INFERIOR:
			if (TipoDePrenda != Tipo.PANTALON)
				throw new CategoriaInvalidaException();
			break;
		case CALZADO:
			if (TipoDePrenda != Tipo.ZAPATOS)
				throw new CategoriaInvalidaException();
			break;
		case ACCESORIOS:
			if (TipoDePrenda != Tipo.AROS)
				throw new CategoriaInvalidaException();
			break;
		default:
			break;
		}
	}

*/

	public void CargarPrenda( TipoDePrenda tipo, String tela, String colorPrincipal)  {
		this.TipoDePrenda = tipo;
	//	this.categoria = categoria;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
	//	validarCategoria();
	}
	public void CargarPrenda(TipoDePrenda tipo, String tela, String colorPrincipal, String colorSecundario) {
		this.TipoDePrenda = tipo;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	//	validarCategoria();
	}
	public TipoDePrenda getTipoDePrenda() {
		return TipoDePrenda;
	}
	public void setTipoDePrenda(TipoDePrenda tipoDePrenda) {
		TipoDePrenda = tipoDePrenda;
	}




}
