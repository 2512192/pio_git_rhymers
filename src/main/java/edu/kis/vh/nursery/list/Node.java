package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca pojedynczy węzeł w strukturze danych listy dwukierunkowej.
 * Każdy węzeł przechowuje wartość oraz odniesienia do poprzedniego i następnego węzła.
 * Taka implementacja umożliwia efektywne poruszanie sie w obu kierunkach.
 */

public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor klasy Node.
     * @param i wartosc przechowywana przez wezel
     */

    public Node(int i) {
        value = i;
    }

    /**
     * Metoda zwraca wartosc przechowywana przez wezel.
     * @return wartosc wezla
     */

    public int getValue() {
        return value;
    }

    /**
     * metoda zwraca poprzedni wezel w strukturze listy.
     * @return poprzedniw wezel
     */

    public Node getPrev() {
        return prev;
    }

    /**
     * Metoda ustawia poprzedni wezel w strukturze listy
     * @param prev ustawiany wezel
     */

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Metoda zwraca nastepny wezel w strukturze listy.
     * @return nastepny wezel w liscie
     */

    public Node getNext() {
        return next;
    }

    /**
     * Metoda ustawia nastepny wezel w strukturze listy.
     * @param next wezel, ktory ma zostac ustawony jako nastepny
     */

    public void setNext(Node next) {
        this.next = next;
    }
}
