package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {
	 @Test
	    void testCalcularProductividad() {
	        // Crea un objeto Desarrollador con los valores correctos
	        Desarrollador desarrollador = new Desarrollador("123456789", "Juan Pérez", 5000.0, "Java");

	        // Calculamos la productividad del desarrollador usando el método calcularProductividad()
	        double productividad = desarrollador.calcularProductividad();

	        // Verificamos que la productividad es correcta
	        assertEquals(1.10, productividad, 0.01);
	    }


}


