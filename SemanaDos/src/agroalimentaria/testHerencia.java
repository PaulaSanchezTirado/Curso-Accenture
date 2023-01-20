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
		
		// Definimos los productos
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
		
		congeladoNitrogeno.setTemperatura("-5º");
		
		// Comprobamos que funciona
		
		System.out.println("Fecha caducidad: "+productoFresco.getFechaCaducidad()+" Número lote: "+productoFresco.getNumeroLote()
		+" Fecha envasado: "+productoFresco.getFechaEnvasado());
		System.out.println("Fecha caducidad: "+productoRefrigerado.getFechaCaducidad()+" Número lote: "+productoRefrigerado.getNumeroLote());
		System.out.println("Fecha caducidad: "+congeladoAire.getFechaCaducidad()+" Número lote: "+congeladoAire.getNumeroLote());
		System.out.println("Fecha caducidad: "+congeladoAgua.getFechaCaducidad()+" Número lote: "+congeladoAgua.getNumeroLote());
		System.out.println("Fecha caducidad: "+congeladoNitrogeno.getFechaCaducidad()+" Número lote: "+congeladoNitrogeno.getNumeroLote());
		
		System.out.println("La fecha de envasado del producto fresco 1 es "+productoFresco.getFechaEnvasado()+" y el número de"
				+ " lote es "+productoFresco.getNumeroLote());
		System.out.println("La fecha de caducidad del producto refrigerado es "+productoRefrigerado.getFechaCaducidad()+
				" y su código es "+productoRefrigerado.getCodigo() +" El número de lote es "+productoRefrigerado.getNumeroLote());
		System.out.println("La salinidad del producto congelado por agua es "+congeladoAgua.getSalinidad());
		System.out.println("La composición de oxigeno del producto congelado por aire es "+congeladoAire.getOxigeno());
		System.out.println("El método de congelación empleado para el producto congelado con nitrogeno es "+congeladoNitrogeno.getMetodoCongelacion()
		+" y la temperatura es "+" la temperatura es de "+congeladoNitrogeno.getTemperatura());
	}

}
