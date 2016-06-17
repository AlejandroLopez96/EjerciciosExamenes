/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen7;

/**
 *
 * @author Alex Lopez
 */
public class Empleado implements Comparable<Empleado> {

  private static int EmpleadosTotales = 0;
  private static int EmpleadosConCargo = 0;
  
  private String nombre;
  private String apellido;
  private String asignaCargo = "";

  public Empleado(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    Empleado.EmpleadosTotales++;
  }

  public static int getEmpleadosTotales() {
    return EmpleadosTotales;
  }

  public static int getEmpleadosConCargo() {
    return EmpleadosConCargo;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void asignaCargo(String asignaCargo) {
    this.asignaCargo = asignaCargo;
    Empleado.EmpleadosConCargo++;
  }
  
  @Override
  public String toString() {
        String aclaracion;
        if(asignaCargo.equals("")) {
            aclaracion = "(sin cargo)";
        } else {
            aclaracion = asignaCargo;
        }
        return apellido + ", " + nombre + " - " + aclaracion;
    }


  @Override
  public int compareTo(Empleado e) {
    if (this.apellido.equals(e.getApellido())) {
      return this.nombre.compareTo(e.getNombre());
    } else {
      return this.apellido.compareTo(e.getApellido());
    }    
  }
}

