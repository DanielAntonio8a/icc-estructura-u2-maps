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
