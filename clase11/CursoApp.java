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
  Alumno alumnos[] = new Alumno[20];
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  boolean continuar = true;

  public static void main(String args[])
  {
    CursoApp app = new CursoApp();
    for(int i = 0; i < app.alumnos.length; i++) {
      app.alumnos[i] = new Alumno();
    }
    while(app.continuar) {
      app.menu();
    }
  }

  // Metodos

  void leerDatosCurso()
  {
    System.out.println("llegue a leer datos curso");
    for(int i = 0; i < alumnos.length; i++) {
      alumnos[i].leerDatos(i);
    }
  }

  void buscarAlumno()
  {
    System.out.println("Ingrese rut alumno para buscar");
    try
    {
      String rutBuscado = teclado.readLine();
      boolean encontrado = false;
      for(int i = 0; i < alumnos.length; i++) {
        if(alumnos[i].obtenerRut().equals(rutBuscado)) {
          encontrado = true;
          alumnos[i].desplegarDatos();
          break;
        }
      }
      if(!encontrado) {
        System.out.println("Alumno no encontrado");
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
    try{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("---- Menu ----");
		System.out.println("1) Ingresar Datos del curso");
		System.out.println("2) Buscar datos por alumno");
		System.out.println("3) Listar alumnos");
		System.out.println("4) Salir");

		String entrada = br.readLine();
		int respuesta = Integer.parseInt(entrada);

		switch (respuesta){
			case 1: leerDatosCurso(); break; //Faltan metodos a los cuales ingresar
			case 2: buscarAlumno(); break;
			case 3: listarAlumnos(); break;
			case 4:
        continuar = false;
        System.out.println("Hasta pronto!");
        break;
			}
		}

		catch(Exception ex){
		System.out.println(ex.getMessage());
		}
  }
}
