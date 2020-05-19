package heapimpl;

import java.util.ArrayList;

public class HeapImpl {

    private ArrayList<Integer> Lista;

    public static void main(String[] args) {

    }

    public HeapImpl(ArrayList<Integer> items) {
        this.Lista = items;
        ArmarHeap();
    }

    public void Insertar(int dato) {
        Lista.add(dato);
        int i = Lista.size() - 1;
        int Padre = Padre(i);

        while (Padre != i && Lista.get(i) < Lista.get(Padre)) {
            Cambiar(i, Padre);
            i = Padre;
            Padre = Padre(i);
        }
    }

    public void ArmarHeap() {

        for (int i = Lista.size() / 2; i >= 0; i--) {
            HeapMin(i);
        }
    }

    public int extractMin() {

        if (Lista.size() == 0) {

            throw new IllegalStateException("Está vacío");
        } else if (Lista.size() == 1) {

            int Min = Lista.remove(0);
            return Min;
        }

        int Min = Lista.get(0);
        int UltimoItem = Lista.remove(Lista.size() - 1);
        Lista.set(0, UltimoItem);
        HeapMin(0);

        return Min;
    }

    public void Decremento(int i, int Llave) {

        if (Lista.get(i) < Llave) {

            throw new IllegalArgumentException("La llave es más grande que la original");
        }
        Lista.set(i, Llave);
        int Padre = Padre(i);

        while (i > 0 && Lista.get(Padre) > Lista.get(i)) {
            Cambiar(i, Padre);
            i = Padre;
            Padre = Padre(Padre);
        }
    }

    private void HeapMin(int i) {

        int Izq = Izq(i);
        int Der = Der(i);
        int Peq = -1;

        if (Izq <= Lista.size() - 1 && Lista.get(Izq) < Lista.get(i)) {
            Peq = Izq;
        } else {
            Peq = i;
        }

        if (Der <= Lista.size() - 1 && Lista.get(Der) < Lista.get(Peq)) {
            Peq = Der;
        }
        if (Peq != i) {

            Cambiar(i, Peq);
            HeapMin(Peq);
        }
    }

    public int getMin() {

        return Lista.get(0);
    }

    public boolean isEmpty() {

        return Lista.size() == 0;
    }

    private int Der(int i) {

        return 2 * i + 2;
    }

    private int Izq(int i) {

        return 2 * i + 1;
    }

    private int Padre(int i) {

        if (i % 2 == 1) {
            return i / 2;
        }

        return (i - 1) / 2;
    }

    private void Cambiar(int i, int Padre) {

        int Temporal = Lista.get(Padre);
        Lista.set(Padre, Lista.get(i));
        Lista.set(i, Temporal);
    }
}
