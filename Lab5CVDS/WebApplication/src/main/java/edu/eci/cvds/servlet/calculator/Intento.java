package edu.eci.cvds.servlet.calculator;

public class Intento {
    private int numberIntento;
    private int value;

    public Intento(int numberIntento, int value) {
        this.numberIntento = numberIntento;
        this.value = value;
    }

    public int getNumberIntento() {
        return numberIntento;
    }

    public void setNumberIntento(int numberIntento) {
        this.numberIntento = numberIntento;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
