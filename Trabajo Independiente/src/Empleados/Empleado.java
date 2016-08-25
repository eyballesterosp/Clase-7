package Empleados;

import java.io.File;
import java.util.Scanner;

public class Empleado {

    private String nombre, apellido, genero, foto;
    private float identificacion = 0;
    private int[] fechaNacimiento = new int[3], fechaIngreso = new int[3];

    public void crearEmpleado(String nombre, String apellido, float identificacion, String genero, int[] fechaNacimiento, File foto, int[] fechaIngreso) {
        Scanner input = new Scanner(System.in);
        this.nombre = input.next();
        this.apellido = input.next();
        this.identificacion = input.nextFloat();
        this.genero = input.next();
        this.foto = input.next();
        for (int i = 0; i < fechaNacimiento.length; i++) {
            this.fechaNacimiento[i] = input.nextInt();
           }
        for (int i = 0; i < fechaIngreso.length; i++) {
            this.fechaIngreso[i] = input.nextInt();
           }

    }

}
/*
 */
