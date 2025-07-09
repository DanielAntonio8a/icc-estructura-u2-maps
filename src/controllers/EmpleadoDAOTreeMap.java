package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;
import controllers.EmpleadoDAO;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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
            System.out.println("\nEmpleado eliminado: " + emp);
        } else {
            System.out.println("\nNo existe empleado con ese ID.");
        }
    }
}
