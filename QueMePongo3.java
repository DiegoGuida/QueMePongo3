QueMePongo 3

public class Usuario implements GeneradorDeSugerencias{
	
	private listaDePrendas = new List<Prenda> (); 
	private ClimaAdapter apiDelClima; // se  puede agregar cualquier API que implemente la interfaz ClimaAdapter.Tambien se podria tener una lista de apis.
	private String ciudad ;

	public List<Sugerencia> generarSugerenciaSegunTemperatura () {
		List<Prenda> prendasAptas = listaDePrendas.stream().filter(prenda->prenda.temperaturaAdecuada<
											apiDelClima.calcularTemperatura(ciudad)).collect(Collectors.toList());
		return generarSugerenciaDesde (prendasAptas);
	}
}

public interface GeneradorDeSugerencias {
	public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas);
}

public interface ClimaAdapter{ 
	float calcularTemperatura(String ciudad);
}

public class ClimaAccuWeatherAdaper{
	private static List<Map<String, Object>> mapaDeTemperatura; //guardo el mapa para no consultarla innecesariamente.

	@Override
	public float calcularTemperatura(String ciudad){
		//Busco en el mapa si ya consulte antes la temperatura de la ciudad y si estoy dentro de las 12hs
		if (temperaturaYaConsultadaYDentroDeLas12hs()){
			return mapaDeTemperatura.get("Temperatura").get("Value"); //devuelve la temperatura del mapa
		}else{
			mapaDeTemperatura = (new AccuWeatherApi()).getWeather(ciudad);
			return mapaDeTemperatura.get("Temperatura").get("Value");
		}
	}
}

public class Prenda {
	private TipoDePrenda tipoDePrenda;
	private Integer temperaturaAdecuada;
	private String tela;
	private String colorPrincipal;
	private String colorSecundario;

	public void CargarPrenda( TipoDePrenda tipo, String tela, String colorPrincipal)  {
		this.TipoDePrenda = tipo;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
	}
	public void CargarPrenda(TipoDePrenda tipo, String tela, String colorPrincipal, String colorSecundario) {
		this.TipoDePrenda = tipo;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}
}
