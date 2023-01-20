package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class testHerencia {
	
	/**
	 * Test para comprobar que se ha trabajado bien el concepto de herencia
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Definimos los objetos
		ProductosFrescos productoFresco = new ProductosFrescos("02/02/02", "");
		ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados("3333");
		CongeladosAire congeladoAire = new CongeladosAire("25%", "25%", "25%", "25%");
		CongeladosAgua congeladoAgua = new CongeladosAgua("44g/l");
		CongeladosNitrogeno congeladoNitrogeno = new CongeladosNitrogeno("metodo 1", "60s");
		
		// Agregamos información a los productos
		productoFresco.setNumeroLote("1");
		productoRefrigerado.setNumeroLote("2");
		congeladoAire.setNumeroLote("3");
		congeladoAgua.setNumeroLote("4");
		congeladoNitrogeno.setNumeroLote("5");
		
		productoFresco.setFechaCaducidad("02/02/2022");	
		productoRefrigerado.setFechaCaducidad("02/02/2022");
		congeladoAire.setFechaCaducidad("02/02/2022");
		congeladoAgua.setFechaCaducidad("02/02/2022");
		congeladoNitrogeno.setFechaCaducidad("02/02/2022");
		
		productoFresco.setFechaEnvasado("23/06/2022");
		productoFresco.setPaisOrigen("España");
		
		productoRefrigerado.setCodigo("34356");
		
		congeladoAire.setNitrogeno("25%");
		congeladoAire.setOxigeno("25%");
		congeladoAire.setCO2("25%");
		congeladoAire.setVaporAgua("25%");
		congeladoAire.setTemperatura("-5º");
		
		congeladoAgua.setSalinidad("5g/l");
		congeladoAgua.setTemperatura("-4º");
		
		congeladoNitrogeno.setMetodoCongelacion("método 1");
		congeladoNitrogeno.setTiempoExposicion("10s");
		congeladoNitrogeno.setTemperatura("-8º");
		
		// Comprobamos que funciona
		
		System.out.println("Fecha caducidad: "+productoFresco.getFechaCaducidad()+" Número lote: "+productoFresco.getNumeroLote()
		+" Fecha envasado: "+productoFresco.getFechaEnvasado()+" Fecha envasado: "+productoFresco.getFechaEnvasado()+
		" País de origen"+productoFresco.getPaisOrigen());
		System.out.println("Fecha caducidad: "+productoRefrigerado.getFechaCaducidad()+" Número lote: "+productoRefrigerado.getNumeroLote()+
		" Código: "+productoRefrigerado.getCodigo());
		System.out.println("Fecha caducidad: "+congeladoAire.getFechaCaducidad()+" Número lote: "+congeladoAire.getNumeroLote()+
		" Temperatura: "+" Composición del aire: "+congeladoAire.getNitrogeno()+" nitrógeno, "+congeladoAire.getOxigeno()+
		" oxígeno, "+congeladoAire.getCO2()+" CO2 y "+congeladoAire.getVaporAgua());
		System.out.println("Fecha caducidad: "+congeladoAgua.getFechaCaducidad()+" Número lote: "+congeladoAgua.getNumeroLote()+
		" Temperatura: "+congeladoAgua.getTemperatura()+" Salinidad: "+congeladoAgua.getSalinidad());
		System.out.println("Fecha caducidad: "+congeladoNitrogeno.getFechaCaducidad()+" Número lote: "+congeladoNitrogeno.getNumeroLote()+
		" Temperatura: "+congeladoNitrogeno.getTemperatura()+" Método de congelación: "+congeladoNitrogeno.getMetodoCongelacion()+
		" Tiempo de exposición: "+congeladoNitrogeno.getTiempoExposicion());
	}

}
