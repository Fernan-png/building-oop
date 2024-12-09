package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.apartmentReader = apartmentReader;
    }

    public Building read() {
        System.out.println("Introduce los datos del edificio");
        System.out.println("Dirección:");
        String address = scanner.nextLine();

        System.out.println("Municipio:");
        String municipality = scanner.nextLine();

        System.out.println("¿Cuantos apartamentos hay?");
        int numApartments = scanner.nextInt();
        scanner.nextLine();

        Apartment[] apartments = new Apartment[numApartments];

        for (int i = 0; i < apartments.length; i++) {
            apartments[i] = apartmentReader.read();
        }

        return new Building(
                address,
                municipality,
                apartments
                );
    }
}
