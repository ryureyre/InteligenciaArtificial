import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Mario R�os
 */
public class ArbolBusqueda {

    Nodo raiz;
    String objetivo;

    public ArbolBusqueda(Nodo raiz, String objetivo) {
        this.raiz = raiz;
        raiz.prof = 1;
        this.objetivo = objetivo;
    }

    // Busqueda por Anchura
    public void busquedaPorAnchura() {
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList<String>();
        Queue<Nodo> estadosPorVisitar = new LinkedList<Nodo>();
        while (!nodoActual.getEstado().equals(objetivo)) {
            estadosVisitados.add(nodoActual.getEstado());
            // Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos(); // <-- Cada Equipo tiene que ingeniarselas para crear
                                                                 // este metodo!
            for (String hijo : hijos) {
                if (!estadosVisitados.contains(hijo)) {
                    // System.out.println("---Metiendo nuevo Nodo");
                    // Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.prof = nodoActual.prof + 1;
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.poll();
        }
        System.out.println("YA SE ENCONTRO EL NODO OBJETIVO");
        System.out.println(nodoActual.getEstado() + "\n");

        System.out.println("Se imprimiran los pasos para conseguir el estado final");
        camino(nodoActual, new String());
    }

    public void busquedaPorProfundidad() {
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList<String>();
        Stack<Nodo> estadosPorVisitar = new Stack<Nodo>();
        while (!nodoActual.getEstado().equals(objetivo)) {
            estadosVisitados.add(nodoActual.getEstado());
            // Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos(); // <-- Cada Equipo tiene que ingeniarselas para crear
                                                                 // este metodo!
            for (String hijo : hijos) {
                if (!estadosVisitados.contains(hijo)) {
                    // System.out.println("---Metiendo nuevo Nodo");
                    // Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.prof = nodoActual.prof + 1;
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.pop();
        }
        System.out.println("YA SE ENCONTRO EL NODO OBJETIVO");
        System.out.println(nodoActual.getEstado());
        System.out.println(nodoActual.prof);

        System.out.println("Se imprimiran los pasos para conseguir el estado final");
        camino(nodoActual, new String());
        
    }

    /* public ArrayList<Nodo> camino(Nodo nodo, ArrayList<Nodo> pasosNodos) {
        if (nodo.padre != null) {
            pasosNodos = camino(nodo.padre, pasosNodos);
        }
        pasosNodos.add(nodo);
        return pasosNodos;
    } */

    public void camino(Nodo nodo, String aux) {
        if (nodo.padre != null) {
            camino(nodo.padre, aux);
        }
        aux = nodo.getEstado();
        System.out.println(aux.charAt(0) + " | " + aux.charAt(1) + " | " + aux.charAt(2));
        System.out.println(aux.charAt(3) + " | " + aux.charAt(4) + " | " + aux.charAt(5));
        System.out.println(aux.charAt(6) + " | " + aux.charAt(7) + " | " + aux.charAt(8));
        System.out.println();
    }
}
