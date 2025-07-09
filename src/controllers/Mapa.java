package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        System.out.println("\n\t-----Run Hash Map");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001 ", " Celular");
        mapa.put("002 ", " Laptop");
        mapa.put("003 ", " Celular");
        mapa.put("003 ", " PC");
        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for(String codigo: mapa.keySet()){
            System.out.println(mapa.get(codigo));
        }
    }

    public void runLinkedHashMap(){
        System.out.println("\n\t------Run Linked Hash Map");
        // Crear un mapa con clave numeros y valor nombre de personas solo nombre de personas 
        // Intger - String
        //Agreguen 5 elementos e imprimir todos los VALORES
        LinkedHashMap<Integer, String> personas = new LinkedHashMap<>();
        personas.put(1,"Daniel");
        personas.put(1,"Antonio");
        personas.put(3,"Juan");
        personas.put(4,"Sebastian");
        personas.put(5,"Cristian");

        for (String nombre: personas.values()){
            System.out.println(nombre);
        }
    }

    public void runTreeMap(){
        System.out.println("\n\t-----Run Tree Map");
        Map<Integer,String> items = new TreeMap();
        items.put(3, " Carro");
        items.put(6, " Bicicleta");
        items.put(1, " Moto");

        //Imprimir los valores
        
        for (String item: items.values()) {
            System.out.println(item);
        }
    }

    public void runHashMapObj(){
        System.out.println("\n\t-----Run Hash Map Objeto");
        Map<Empleado, Integer> empleados = new HashMap(); 
        empleados.put(new Empleado(1,"Juan", "Dev"),1200);   
        empleados.put(new Empleado(2,"Juan", "Dev"),1500);
        empleados.put(new Empleado(3,"Pedro", "Dev"),2000);
        empleados.put(new Empleado(1,"Juan", "Dev"),2500);
        empleados.put(new Empleado(1,"Diego", "Dev"),3000);


        for(Map.Entry<Empleado,Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void runTreeMapObj(){
        System.out.println("\n\t-----Run Tree Map Objeto");
        Map<Empleado, Integer> empleados = new HashMap(); 
        empleados.put(new Empleado(1,"Juan", "Dev"),1200);   
        empleados.put(new Empleado(2,"Juan", "Dev"),1500);
        empleados.put(new Empleado(3,"Pedro", "Dev"),2000);
        empleados.put(new Empleado(2,"Diego", "Dev"),1200);
        empleados.put(new Empleado(3,"Juan", "Senior"),3000);
        System.out.println("\n"+empleados);

    }



}
