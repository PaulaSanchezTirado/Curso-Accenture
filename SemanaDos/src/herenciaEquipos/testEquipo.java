package herenciaEquipos;

/**
 * Ejercicio de herencia
 */

import java.util.ArrayList;
import java.util.List;

public class testEquipo {
	
	/**
	 * Comprobación del ejercicio de herencia
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Array List
		
		List<Equipo> equipo = new ArrayList<Equipo>();
		// Esto también puede hacerse: ArrayList<Equipo> equipo = new ArrayList<Equipo>();
		
		equipo.add(new Futbolista(1, "Sergio", "Uclés", 28, 3, "delantero"));
		equipo.add(new Futbolista(2, "Lorenzo", "García", 19, 4, "lateral"));
		equipo.add(new Entrenador(3, "Toni", "Sánchez", 40, "325678"));
		equipo.add(new Entrenador(4, "Marcos", "Pérez", 45, "837458"));
		equipo.add(new Masajista(1, "Lorena", "Hurtado", 27, "Fisioterapeuta", 3));
		
		// Comprobar a qué clase pertenece cada objeto de la lista e imprimir sus métodos
		
		/*
		for (Equipo eq:equipo) {
			if (eq instanceof Futbolista) {
				((Futbolista) eq).jugarPartido(); // Se ha hecho el cast directo. También puede hacerse:
				// Futbolista fut = (Futbolista) eq;
				// fut.jugarPartido();
				// fut.entrenar();
				((Futbolista) eq).entrenar();
			}
			if (eq instanceof Entrenador) {
				((Entrenador) eq).dirigirPartido();
				((Entrenador) eq).dirigirEntrenamiento();
			}
			
			if (eq instanceof Masajista) {
				((Masajista) eq).darMasaje();
			}
		}
		*/
		
		equipo.forEach(eq -> {
			if (eq instanceof Futbolista) {
				((Futbolista) eq).jugarPartido(); // Se ha hecho el cast directo. También puede hacerse:
				// Futbolista fut = (Futbolista) eq;
				// fut.jugarPartido();
				// fut.entrenar();
				((Futbolista) eq).entrenar();
			}
			if (eq instanceof Entrenador) {
				((Entrenador) eq).dirigirPartido();
				((Entrenador) eq).dirigirEntrenamiento();
			}
			
			if (eq instanceof Masajista) {
				((Masajista) eq).darMasaje();
			}
		});
		
	}

}
