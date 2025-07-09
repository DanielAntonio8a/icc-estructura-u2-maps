package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
        System.out.println("Empleado agregado: " + emp);
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("\nNo hay empleados.");
        } else {
            System.out.println("\nLista de empleados:");
            for (Empleado emp : empleados.values()) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void remove(int id) {
        Empleado emp = empleados.remove(id);
        if (emp != null) {
            System.out.println("Empleado eliminado: " + emp);
        } else {
            System.out.println("No existe empleado con ese ID.");
        }
    }
}
