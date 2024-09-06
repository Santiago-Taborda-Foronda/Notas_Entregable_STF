package nota;

import java.util.ArrayList;
import java.util.Arrays;

public class EstudianteNotas {
	      static class Alumno {
	          String nombreAlumno;
	          ArrayList<Double> calificaciones;
	          double promedioNotas;

	          Alumno(String nombreAlumno, Double... calificaciones) {
	              this.nombreAlumno = nombreAlumno;
	              this.calificaciones = new ArrayList<>(Arrays.asList(calificaciones));
	              calcularPromedioNotas();
	          }

	          void calcularPromedioNotas() {
		            double suma = 0;
		            for (Double calificacion : calificaciones) {
		                suma += calificacion;
		            }
		            this.promedioNotas = suma / calificaciones.size();
		        }
	      }

	      static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	      public static void main(String[] args) {
	          inicializarAlumnos();
	          mostrarResultados();
	      }

	      // Método sin retorno sin parámetro
	      public static void inicializarAlumnos() {
	          listaAlumnos.add(new Alumno("Juan", 3.5, 4.0, 3.8));
	          listaAlumnos.add(new Alumno("Mariana", 4.2, 3.9, 4.5));
	          listaAlumnos.add(new Alumno("David", 2.8, 3.1, 2.9));
	          listaAlumnos.add(new Alumno("Stiven", 4.8, 4.9, 4.7));
	          listaAlumnos.add(new Alumno("Ana", 1.5, 2.0, 1.8));
	      }

	      // Método con retorno sin parámetro (Punto 2)
	      public static int obtenerCantidadAlumnos() {
	          int cantidad = listaAlumnos.size();
	          System.out.println("Número total de alumnos: " + cantidad);
	          return cantidad;
	      }

	      // Método con retorno sin parámetro (Punto 3)
	      public static int obtenerCantidadCalificaciones() {
	          int cantidadCalificaciones = listaAlumnos.size() * 3;
	          System.out.println("Número total de calificaciones ingresadas: " + cantidadCalificaciones);
	          return cantidadCalificaciones;
	      }

	      // Método con retorno sin parámetro (Punto 4)
	      public static int contarAlumnosQueAprueban() {
	          int aprueban = 0;
	          for (Alumno alumno : listaAlumnos) {
	              if (alumno.promedioNotas >= 3.5) {
	                  aprueban++;
	              }
	          }
	          System.out.println("Número de alumnos que aprueban: " + aprueban);
	          return aprueban;
	      }

	      // Método con retorno sin parámetro (Punto 5)
	      public static int contarAlumnosQueReprueban() {
	          int reprueban = 0;
	          for (Alumno alumno : listaAlumnos) {
	              if (alumno.promedioNotas < 3.5) {
	                  reprueban++;
	              }
	          }
	          System.out.println("Número de alumnos que reprueban: " + reprueban);
	          return reprueban;
	      }

	      // Método con retorno sin parámetro (Punto 6)
	      public static int contarAlumnosQueRecuperan() {
	          int puedenRecuperar = 0;
	          for (Alumno alumno : listaAlumnos) {
	              if (alumno.promedioNotas > 2 && alumno.promedioNotas < 3.5) {
	                  puedenRecuperar++;
	              }
	          }
	          System.out.println("Número de alumnos que pueden recuperar: " + puedenRecuperar);
	          return puedenRecuperar;
	      }

	      // Método con retorno sin parámetro (Punto 7)
	      public static int contarAlumnosNoRecuperables() {
	          int noRecuperables = 0;
	          for (Alumno alumno : listaAlumnos) {
	              if (alumno.promedioNotas <= 2) {
	                  noRecuperables++;
	              }
	          }
	          System.out.println("Número de alumnos que no son recuperables: " + noRecuperables);
	          return noRecuperables;
	      }

	      // Método con retorno sin parámetro (Punto 8)
	      public static double calcularPromedioGeneral() {
	          double sumaPromediosNotas = 0;
	          for (Alumno alumno : listaAlumnos) {
	              sumaPromediosNotas += alumno.promedioNotas;
	          }
	          double promedioGeneral = sumaPromediosNotas / listaAlumnos.size();
	          System.out.println("Promedio general de las calificaciones: " + String.format("%.2f", promedioGeneral));
	          return promedioGeneral;
	      }

	      // Método sin retorno sin parámetro (Punto 9)
	      public static void imprimirListadoAlumnos() {
	          System.out.println("\nLista de alumnos y sus promedios finales:");
	          for (Alumno alumno : listaAlumnos) {
	              System.out.printf("%s: %.2f%n", alumno.nombreAlumno, alumno.promedioNotas);
	          }
	      }

	      // Método sin retorno sin parámetro
	      private static void mostrarResultados() {
	          obtenerCantidadAlumnos();
	          obtenerCantidadCalificaciones();
	          contarAlumnosQueAprueban();
	          contarAlumnosQueReprueban();
	          contarAlumnosQueRecuperan();
	          contarAlumnosNoRecuperables();
	          calcularPromedioGeneral();
	          imprimirListadoAlumnos();
	      }
	  }