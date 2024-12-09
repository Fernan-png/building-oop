package org.ies.building.model;

import java.util.Objects;

public class Owner {
    private String nif;
    private String name;
    private String surnames;

    public Owner(String nif, String name, String surnames) {
        this.nif = nif;
        this.name = name;
        this.surnames = surnames;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nif, owner.nif) && Objects.equals(name, owner.name) && Objects.equals(surnames, owner.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surnames);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                '}';
    }
}
