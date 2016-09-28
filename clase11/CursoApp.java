// Enunciado
// Generar clase Alumno con atributos
// rut
// nombre
// apellidoPaterno
// apellidoMaterno
// sexo
// carrera
// edad
// nota1
// nota2
// nota3

// Metodos
// leerDatos()
// generarPromedio()
// --> nota1*0.2+nota2*0.3+nota5*0.5
// desplegarDatos()
// --> datos y luego promedio

//Req
// - no debe exceder 15 lineas de código en el main
// - la plaicacion se llama CursoApp
// - generar menu de opciones
// - 1 --> Ingresar datos curso (20 alumnos)
// - 2 --> Buscar datos Alumnos por rut
// - 3 --> Listar todos los alumnos (rut, nombre completo, carrera, promedio)
// - 4 --> salir
// Metodos
// leerDatosCurso()
// buscarAlumno()
// listarAlumnos()
// menu()

import java.io.*;

public class CursoApp
{
  Alumno alumnos[] = new Alumno[3];
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String args[])
  {
    CursoApp app = new CursoApp();
    app.menu();
    // por mientras
    app.leerDatosCurso();
    // app.buscarAlumno();
    // app.listarAlumnos();
  }

  // Metodos

  void leerDatosCurso()
  {
    System.out.println("llegue a leer datos curso");
    for(int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      alumnos[i].leerDatos();
    }
  }

  void buscarAlumno()
  {
    System.out.println("Ingrese rut alumno para buscar");
    try
    {
      String rutBuscado = teclado.readLine();
      for(int i = 0; i < alumnos.length; i++) {
        if(alumnos[i].obtenerRut() == rutBuscado) {
          alumnos[i].desplegarDatos();
          break;
        }
      }
    }
    catch(Exception ex)
    {
      System.out.println(ex.getMessage());
    }
  }

  void listarAlumnos()
  {
    for(int i = 0; i < alumnos.length; i++) {
      alumnos[i].desplegarDatos();
    }
  }

  void menu()
  {
    System.out.println("No implementado");
  }
}
