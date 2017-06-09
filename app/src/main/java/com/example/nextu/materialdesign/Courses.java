package com.example.nextu.materialdesign;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class Courses {
    private static Curso[] courses = {
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            "Material Design \n" +
                            "Temas", "Encargado",
                    3f, 4340, 22, R.drawable.item1),
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            "Material Design \n" +
                            "Temas", "Encargado",
                    5f, 220, 24, R.drawable.item2),
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            "Material Design \n" +
                            "Temas", "Encargado",
                    4.4f, 34235, 32, R.drawable.item3),
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            "Material Design \n" +
                            "Temas", "Encargado",
                    3.4f, 11245, 35, R.drawable.item4),
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            ";aterial Design \n" +
                            "Temas", "Encargado",
                    4.0f, 122, 45, R.drawable.item5),
            new Curso("Primer item",
                    "Contenido del item " +
                            "Aprende RecyclerView\n" +
                            "\n" +
                            "Material Design \n" +
                            "Temas", "Encargado", 3.2f, 2503, 34, R.drawable.item6),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<Curso> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static Curso getCourseByPosition(int position) {
        return courses[position];
    }

}
