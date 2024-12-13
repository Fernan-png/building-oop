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
        System.out.print("¿Cuál es la planta del piso?:");
        int flat = scanner.nextInt();
        scanner.nextLine();

        System.out.print("¿Cuál es la puerta?");
        String door = scanner.nextLine();

        int howManyOwners = askOwners();

        Owner[] owners = new Owner[howManyOwners];
        for (int i = 0; i < howManyOwners; i++) {
            owners[i] = ownerReader.read();
        }

        return new Apartment(
                flat,
                door,
                owners
        );
    }

    private int askOwners() {
        int owners;
        do {
            System.out.println("Cuántos propiertarios hay: ");
            owners = scanner.nextInt();
            scanner.nextLine();
            if (owners < 1) {
                System.out.println("El piso debe tener al menos un propietario");
            }
        } while (owners < 1);
        return askOwners();
    }
}