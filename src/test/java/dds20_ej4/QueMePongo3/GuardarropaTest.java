package dds20_ej4.QueMePongo3;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuardarropaTest {
	private Prenda camisa = new Prenda( );
	private Prenda remera = new Prenda( );
	private Prenda pantalon = new Prenda( );
	private Prenda zapatos = new Prenda( );
	private Prenda aros = new Prenda( );
	private Guardarropa vestir = new Guardarropa();
	private Guardarropa deportivo = new Guardarropa();

	@Before
	public void init() throws CategoriaInvalidaException {
		camisa.CargarPrenda(TipoDePrenda.CAMISA, "algodon", "azul");
		remera.CargarPrenda(TipoDePrenda.REMERA, "algodon", "azul");
		pantalon.CargarPrenda(TipoDePrenda.PANTALON, "jean", "azul","negro" );
		zapatos.CargarPrenda(TipoDePrenda.ZAPATO, "cuero", "negro" );
		aros.CargarPrenda(TipoDePrenda.AROS, "oro", "oro" );

		vestir.agregarPrendaAlGuardarropas(camisa);
		vestir.agregarPrendaAlGuardarropas(remera);
		vestir.agregarPrendaAlGuardarropas(pantalon);
		vestir.agregarPrendaAlGuardarropas(zapatos);
		vestir.agregarPrendaAlGuardarropas(aros);
	}

	@Test
	public void generarAtuendoTest() {
		List<Prenda> atuendo = vestir.generarAtuendos();
		Assert.assertTrue(atuendo.size()>=3);
	}
	@Test (expected=PrendasInsuficientesException.class)
	public void prendasInsuficientesTest() {
		deportivo.agregarPrendaAlGuardarropas(remera);
		List<Prenda> atuendo = deportivo.generarAtuendos();
		Assert.assertTrue(atuendo.size()>=3);
	}

}
