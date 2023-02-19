package examenD;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(7);
        arbol.insertar(6);
        System.out.println("Recorriendo del arbol:");
        arbol.ImprimirArbol();
        arbol.busqueda(1); 
    }
    
}
