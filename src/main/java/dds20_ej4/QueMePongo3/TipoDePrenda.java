package dds20_ej4.QueMePongo3;

public class TipoDePrenda {

	Categoria categoria ;

	static public TipoDePrenda REMERA = new TipoDePrenda(Categoria.SUPERIOR);
	static public TipoDePrenda CAMISA = new TipoDePrenda(Categoria.SUPERIOR);
	static public TipoDePrenda PANTALON = new TipoDePrenda(Categoria.INFERIOR);
	static public TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
	static public TipoDePrenda AROS = new TipoDePrenda(Categoria.ACCESORIOS);

	TipoDePrenda(Categoria categoria) {
		this.categoria = categoria;
	}

	public  Categoria categoria() {
		return this.categoria;
	}


}
