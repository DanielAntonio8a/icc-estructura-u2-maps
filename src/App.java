import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Daniel Duran"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        
        //runEjerciciosMapa();
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        // --- Prueba directa con DAOHashMap ---
    EmpleadoDAOHashMap empleadoDAOHashMap = new EmpleadoDAOHashMap();
    Empleado empA = new Empleado(4, "Pedro","DEV");
    Empleado empB = new Empleado(2, "Pedro","DEV");
    Empleado empC = new Empleado(5, "Juan","DEV");
    Empleado empD = new Empleado(3, "Maria","DEV");
    Empleado empE = new Empleado(1, "Juan","DEV");

    empleadoDAOHashMap.add(empA);
    empleadoDAOHashMap.add(empB);
    empleadoDAOHashMap.add(empC);
    empleadoDAOHashMap.add(empD);
    empleadoDAOHashMap.add(empE);

    empleadoDAOHashMap.list();
    empleadoDAOHashMap.remove(2);
    empleadoDAOHashMap.list();

    // --- Prueba con Controller y DAO por interfaz ---
    EmpleadoDAO daoHash = new EmpleadoDAOHashMap();
    EmpleadoContoller controladorHash = new EmpleadoContoller(daoHash);

    EmpleadoDAO daoTree = new EmpleadoDAOTreeMap();
    EmpleadoContoller controladorTree = new EmpleadoContoller(daoTree);

    Empleado emp1 = new Empleado(5,"Pedro","Dev");
    Empleado emp2 = new Empleado(3,"Juan","Dev");
    Empleado emp3 = new Empleado(1,"Jose","Dev");
    Empleado emp4 = new Empleado(2,"Pedro","Dev");
    Empleado emp5 = new Empleado(4,"Pedro","Dev");

    controladorHash.agregarEmpleado(emp1);
    controladorHash.agregarEmpleado(emp2);
    controladorHash.agregarEmpleado(emp3);
    controladorHash.agregarEmpleado(emp4);
    controladorHash.agregarEmpleado(emp5);

    controladorTree.agregarEmpleado(emp1);
    controladorTree.agregarEmpleado(emp2);
    controladorTree.agregarEmpleado(emp3);
    controladorTree.agregarEmpleado(emp4);
    controladorTree.agregarEmpleado(emp5);

    System.out.println("---------------- HASH MAP");
    controladorHash.listarEmpleados();
    System.out.println("---------------- TREE MAP");
    controladorTree.listarEmpleados();
    Ejercicios ejercicios = new Ejercicios();

    System.out.println("\n\t Ejercicios Mapas Ejercicio 1");
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";

        System.out.println("\"" + str1 + "\" y \"" + str2 + "\" son anagramas: " + ejercicios.areAnagrams(str1, str2)); // true
        System.out.println("\"" + str1 + "\" y \"" + str3 + "\" son anagramas: " + ejercicios.areAnagrams(str2, str3)); // false

         System.out.println("\n\t Ejercicios Mapas Ejercicio 2");
        // Test para sonAnagramas (mismo resultado que el anterior)
        System.out.println("¿'roma' y 'amor' son anagramas?: " + ejercicios.sonAnagramas("roma", "amor"));

        // Test para sumatoriaDeDos
        System.out.println("\n\t Ejercicios Mapas Ejercicio 3");
        int[] resultado1 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        System.out.println("Indices con suma 5: " + (resultado1 != null ? Arrays.toString(resultado1) : "No hay combinación"));

        int[] resultado2 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        System.out.println("Indices con suma 10: " + (resultado2 != null ? Arrays.toString(resultado2) : "No hay combinación"));

        // Test para contarCaracteres
        System.out.println("\n\t Ejercicios Mapas Ejercicio 4");
        System.out.print("Frecuencia de caracteres en 'hola': ");
        ejercicios.contarCaracteres("hola");

    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }

    private static void runEjerciciosMapa(){
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
        
    }
}
