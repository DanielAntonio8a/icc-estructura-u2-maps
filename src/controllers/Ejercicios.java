package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
                // Eliminar espacios y convertir a minúsculas para comparación
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Si las longitudes son diferentes, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Crear un mapa para contar la frecuencia de caracteres en la primera cadena
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Decrementar la frecuencia de caracteres en el mapa basado en la segunda cadena
        for (char c : str2.toCharArray()) {
            if (!charFrequencies.containsKey(c)) {
                return false; // Carácter no encontrado en la primera cadena
            }
            charFrequencies.put(c, charFrequencies.get(c) - 1);
            if (charFrequencies.get(c) < 0) {
                return false; // Más ocurrencias en la segunda cadena que en la primera
            }
        }

        // Si todas las frecuencias son cero, son anagramas
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = objetivo - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

    /**
     * Cuenta la frecuencia de cada caracter en la cadena recibida y
     * muestra el resultado por consola.
     *
     * Ejemplo:
     * Input: "hola"
     * Output: {h=1, o=1, l=1, a=1}
     */
    public void contarCaracteres(String texto) {
        Map<Character, Integer> frecuencia = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }
        System.out.println(frecuencia);
    }

    

    /**
     * Verifica si dos palabras son anagramas.
     * Deben contener las mismas letras con la misma frecuencia.
     *
     * Ejemplo:
     * Input: palabra1 = "roma", palabra2 = "amor"
     * Output: true
     */
    public boolean sonAnagramas(String palabra1, String palabra2) {
    if (palabra1.length() != palabra2.length()) return false;
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : palabra1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : palabra2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}
