package ar.edu.ies6.informatica.punto03.main;

import ar.edu.ies6.informatica.punto03.model.Provincia;
import ar.edu.ies6.informatica.punto03.util.Region;

public class Main {

    public static void main(String[] args) {
        
        // Crear 10 provincias
        Provincia[] provincias = new Provincia[10];
        provincias[0] = new Provincia("1", "Buenos Aires", Region.CENTRO, 16770000.0, 307571.0, true);
        provincias[1] = new Provincia("2", "Córdoba", Region.CENTRO, 3567654.0, 165321.0, true);
        provincias[2] = new Provincia("3", "Santa Fe", Region.CENTRO, 3397532.0, 133007.0, true);
        provincias[3] = new Provincia("4", "Mendoza", Region.CUYO, 2000000.0, 148827.0, true);
        provincias[4] = new Provincia("5", "Tucumán", Region.NOA, 1700000.0, 22524.0, true);
        provincias[5] = new Provincia("6", "Salta", Region.NOA, 1335000.0, 155488.0, false);
        provincias[6] = new Provincia("7", "Chaco", Region.NEA, 1200000.0, 99633.0, false);
        provincias[7] = new Provincia("8", "Misiones", Region.NEA, 1180000.0, 29801.0, false);
        provincias[8] = new Provincia("9", "San Luis", Region.CUYO, 450000.0, 76748.0, false);
        provincias[9] = new Provincia("10", "La Pampa", Region.PATAGONIA, 340000.0, 143440.0, false);

        // Mostrar solo las provincias con estado true
        System.out.println("Provincias con estado true:");
        for (Provincia provincia : provincias) {
            if (provincia.getEstado()) {
                Double densidad = provincia.denPobl(provincia.getPoblacion(), provincia.getSuperficie());
                System.out.println(provincia.getNombre() + " - Densidad poblacional: " + densidad + " hab/km²");
            }
        }
    }
}
