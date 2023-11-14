
import java.util.Scanner;

public class Puzzle8 {

    public static String estadoInicialFacil = "134862 75";
    public static String estadoInicialDificil = "8 2461357";
    
    public static String estadoFinal = "12345678 ";
    
    public static void main(String[] args) {
        //Instanciar el arbol
        // ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicialFacil), estadoFinal);
        
        ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicialFacil), estadoFinal);
        //Ejecuta la busqueda
        // a.busquedaPorAnchura();
        Scanner scan = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\n\tMenu de heuristicas para busqueda por anchura");
            System.out.println("1.- Posiciones erroneas");
            System.out.println("2.- Diferencia absoluta entre valores");
            System.out.println("3.- Diferencia entre posiciones");
            System.out.println("4.- Mostrar resultados");
            System.out.println("5.- Salir");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    a.busquedaPorAnchuraConHeuristica(op);
                    break;
                case 2:
                    a.busquedaPorAnchuraConHeuristica(op);
                    break;
            
                case 3:
                    a.busquedaPorAnchuraConHeuristica(op);
                    break;
                    
                case 4:
                    a.mostarResultados();
                    break;
                case 5:
                    System.out.println("Ayos");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida\n\n");
                    break;
            }
        }while(op!=5);
        
        //a.busquedaPorProfundidad();
        //Imprime movimientos
        
        /*
        Nodo n = new Nodo(estadoInicial);
        Collection<String> c = 4n.generaHijos();
        c = c;
        */
        scan.close();
    }

}