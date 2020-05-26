package dds20_ej4.QueMePongo3;


import org.junit.Test;




public class PrendaTest {

	private Prenda prenda1 = new Prenda( );
	private Prenda prenda2 = new Prenda( );
	private Prenda prenda3 = new Prenda( );

	@Test
	public void cargarPrendaCorrecta() {
		prenda1.CargarPrenda(TipoDePrenda.CAMISA, "algodon", "azul");
		prenda2.CargarPrenda(TipoDePrenda.REMERA, "algodon", "azul");
//		Assert.assertThat(prenda1, instanceOf(Prenda.class));
	}

/*
	@Test (expected=CategoriaInvalidaException.class)
	public void cargarPrendaIncorrecta() throws CategoriaInvalidaException {
		prenda3.CargarPrenda(Tipo.PANTALON, Categoria.SUPERIOR, "jean", "azul","negro" );
//		Assert.assertThat(prenda3, instanceOf(Prenda.class));
	}
*/

}
