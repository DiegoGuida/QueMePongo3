package dds20_ej4.QueMePongo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guardarropa {

	private List<Prenda> superior = new ArrayList<Prenda>();
	private List<Prenda> inferior = new ArrayList<Prenda>();
	private List<Prenda> calzado = new ArrayList<Prenda>();
	private List<Prenda> accesorios = new ArrayList<Prenda>();

	public List<Prenda> generarAtuendos()  {
		Random random1 = new Random();
		List<Prenda> atuendo = new ArrayList<Prenda>();
		if (superior == null ||  superior.isEmpty() ||
				inferior == null ||  inferior.isEmpty() ||
						calzado == null ||  calzado.isEmpty() ) {
			throw new PrendasInsuficientesException();
		}
		atuendo.add(superior.get(random1.nextInt(superior.size())));
		atuendo.add(inferior.get(random1.nextInt(inferior.size())));
		atuendo.add(calzado.get(random1.nextInt(calzado.size())));
		if ( accesorios != null &&  !accesorios.isEmpty()) {
			atuendo.add(accesorios.get(random1.nextInt(accesorios.size())));
		}
		return atuendo;
	}

	public void agregarPrendaAlGuardarropas(Prenda prenda) {
		switch (prenda.getTipoDePrenda().categoria() ) {
		case SUPERIOR :	superior.add(prenda) ;
			break;
		case CALZADO: inferior.add(prenda) ;
			break;
		case INFERIOR: calzado.add(prenda) ;
			break;
		case ACCESORIOS: accesorios.add(prenda);
			break;
		}
	}



}
