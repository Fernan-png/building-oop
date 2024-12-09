package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read() {
        System.out.println("Introduce los datos del apartamento:");
        System.out.println("Planta:");
        String plant = scanner.nextLine();

        System.out.println("Nº Puerta:");
        String door = scanner.nextLine();

        System.out.println("¿Cuantos propietarios hay en el apartamento?");
        int numOwners = scanner.nextInt();
        scanner.nextLine();

        Owner[] owners = new Owner[numOwners];

        for (int i = 0; i < owners.length ; i++) {
            owners[i] = ownerReader.read();
        }

        return new Apartment(
                plant,
                door,
                owners
        );
    }
}
