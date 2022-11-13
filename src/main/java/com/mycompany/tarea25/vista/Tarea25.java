/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea25.vista;
import com.mycompany.tarea25.modelo.Estudiante;
import com.mycompany.tarea25.servicio.EstudianteService;
import java.time.LocalDate;
/**
 *
 * @author Jose
 */
public class Tarea25 {

    public static void main(String[] args) {

        var jose = new Estudiante("Jose", "105352199", LocalDate.of(2003, 6, 10));
        var daniel = new Estudiante("Daniel", "010595874", LocalDate.of(2002, 11, 25));
        var erika = new Estudiante("Juan", "0106978124", LocalDate.of(2001, 8, 14));

        var baseDatosEstudiantes = new EstudianteService();
        baseDatosEstudiantes.crearEstudiante(jose);
        baseDatosEstudiantes.crearEstudiante(daniel);
        baseDatosEstudiantes.crearEstudiante(erika);

        System.out.println("\n");
        System.out.println(baseDatosEstudiantes.listarEstudiante());

    }
}