package examenD;

public class Nodo {
    int dato;
	Nodo izq, der;

	public Nodo(int dato) {
		this.dato = dato;
		this.izq = this.der = null;
	}

	public void imprimir() {
		System.out.println(dato);
	}
}
