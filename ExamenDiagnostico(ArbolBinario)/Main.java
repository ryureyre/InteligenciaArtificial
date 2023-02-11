public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo del arbol:");
        arbol.ImprimirArbol();
        arbol.busqueda(1); 
    }
    
}
