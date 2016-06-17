/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen8;

/**
 *
 * @author Alex Lopez
 */
public class Alumno implements Comparable<Alumno> {

  private static int alumnosTotales = 0;
  private static int alumnosMatriculados = 0;
  
  private String nombre;
  private String apellido;
  private String matricula = "";

  public Alumno(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    Alumno.alumnosTotales++;
  }

  public static int getAlumnosTotales() {
    return alumnosTotales;
  }

  public static int getAlumnosMatriculados() {
    return alumnosMatriculados;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void matricula(String matricula) {
    this.matricula = matricula;
    Alumno.alumnosMatriculados++;
  }
  
  @Override
  public String toString() {
        String aclaracion;
        if(matricula.equals("")) {
            aclaracion = "(no matriculado)";
        } else {
            aclaracion = "(matriculado)";
        }
        return apellido + ", " + nombre + " - " + matricula + " " + aclaracion;
    }


  @Override
  public int compareTo(Alumno e) {
    if (this.apellido.equals(e.getApellido())) {
      return this.nombre.compareTo(e.getNombre());
    } else {
      return this.apellido.compareTo(e.getApellido());
    }    
  }
}
