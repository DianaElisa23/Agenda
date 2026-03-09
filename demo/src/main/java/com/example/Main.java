package com.example;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nORGANIZADOR DE TAREAS");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar una tarea");
            System.out.println("5. Ejecutar autodiagnostico (Test)");
            System.out.println("6. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Nueva tarea: ");
                    String tarea = sc.nextLine();
                    agenda.agregarTarea(tarea);
                    System.out.println("Tarea agregada");
                }

                case 2 -> {
                    System.out.println("Lista de tareas:");
                    for (int i = 0; i < agenda.listarTareas().size(); i++) {
                        System.out.println((i + 1) + ". " + agenda.listarTareas().get(i));
                    }
                }
                case 3 -> {
                    System.out.print("Número de tarea a marcar como completada: ");
                    int indice = sc.nextInt() - 1;
                    if (agenda.marcarTareaCompletada(indice)) {
                        System.out.println("Tarea marcada como completada");
                    } else {
                        System.out.println("Índice inválido");
                    }
                }
                case 4 -> {
                    System.out.print("Número de tarea a eliminar: ");
                    int indiceEliminar = sc.nextInt() - 1;
                    if (agenda.eliminarTarea(indiceEliminar)) {
                        System.out.println("Tarea eliminada");
                    } else {
                        System.out.println("Índice inválido");
                    }
                }
                case 5 -> agenda.ejecutarAutodiagnostico();
                case 6 -> System.out.println("Adiosss");
            }

        } while (opcion != 6);

        sc.close();
    }
}