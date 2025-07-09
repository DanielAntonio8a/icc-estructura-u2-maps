package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nSID: " + id + ", Name: " + name + ", Position: " + position;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

        @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Objects.equals(name, empleado.name);
    }

        @Override
        public int compareTo(Empleado o) {
            if (id == 0) {
            return Integer.compare(this.getId(),o.getId());
            }
            return name.compareTo(o.getName());
        }



}