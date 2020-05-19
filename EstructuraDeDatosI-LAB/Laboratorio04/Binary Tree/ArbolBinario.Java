class Nodo { 
    char datos; 
    Nodo izq, der; 
  
    Nodo(char item) 
    { 
        datos = item; 
        izq = der = null; 
    } 
} 
  
int buscar(char arr[], int inicio, int fin, char valor) 
{ 
    int i; 
    for (i = inicio; i <= fin; i++) { 
        if (arr[i] == valor) 
            return i; 
    } 
    return i; 
    } 

void mostrarIN(Nodo nodo) 
{ 
    if (nodo == null) 
        return; 

    mostrarIN(nodo.izq); 

    System.out.print(nodo.datos + " "); 

    mostrarIN(nodo.der); 
    } 

class ArbolBinario { 
    Nodo raiz; 
    static int indicePRE = 0; 

    Nodo construirArbol(char in[], char pre[], int inicioIN, int finalIN) 
    { 
        if (inicioIN > finalIN) 
            return null; 

        Nodo tNodo = new Nodo(pre[indicePRE++]); 

        if (inicioIN == finalIN) 
            return tNodo; 

        int indiceIN = buscar(in, inicioIN, finalIN, tNodo.datos); 

        tNodo.izq = construirArbol(in, pre, inicioIN, indiceIN - 1); 
        tNodo.der = construirArbol(in, pre, indiceIN + 1, finalIN); 
  
        return tNodo; 
    } 

    public static void main(String args[]) 
    { 
        ArbolBinario arbol = new ArbolBinario(); 
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' }; 
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' }; 
        int tamanio = in.length; 
        Node root = arbol.construirArbol(in, pre, 0, tamanio - 1); 
 
        System.out.println("Árbol recorrido InOrden es: "); 
        arbol.mostrarIN(root); 
    } 
} 