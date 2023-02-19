package examenD;


public class Arbol {
    private Nodo raiz;

	public Arbol() {
	}

	public void ImprimirArbol(Nodo n) {
		if (n != null) {
			n.imprimir();
			ImprimirArbol(n.izq);
			ImprimirArbol(n.der);
		}
	}

	public void ImprimirArbol() {
		this.ImprimirArbol(this.raiz);
	}

	public Nodo busqueda(int busqueda) {
		System.out.println("Se buscara el elemento " + busqueda + " en el arbol");
		Nodo n = existe(this.raiz, busqueda);
		return n;
	}

	private Nodo existe(Nodo n, int busqueda) {
		if (n == null) {
			return null;
		}
		if (n.dato == busqueda) {
			return n;
		} else if (busqueda < n.dato) {
			return existe(n.izq, busqueda);
		} else {
			return existe(n.der, busqueda);
		}
	}

	private void insertar(Nodo padre, int dato) {
		if (dato < padre.dato) {
			if (padre.izq == null) {
				padre.izq = (new Nodo(dato));
			} else {
				this.insertar(padre.izq, dato);
			}
		} else {
			if (padre.der == null) {
				padre.der = (new Nodo(dato));
			} else {
				this.insertar(padre.der, dato);
			}
		}
	}

	public void insertar(int dato) {
		if (this.raiz == null) {
			this.raiz = new Nodo(dato);
		} else {
			this.insertar(this.raiz, dato);
		}
	}

}