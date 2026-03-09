package com.example;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public ArrayList<String> listarTareas() {
        return tareas;
    }

    public boolean marcarTareaCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.set(indice, tareas.get(indice) + " (completada)");
            return true;
        }
        return false;
    }

    public boolean eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            return true;
        }
        return false;
    }

    public int totalTareas() {
        return tareas.size();
    }

    public void ejecutarAutodiagnostico() {
        System.out.println("Ejecutando autodiagnóstico...");
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }
}