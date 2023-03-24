package model;

import java.util.Objects;
public class Quadrado {

    private double lado;

    public Quadrado(){
        this.lado = 1 ;
    }

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quadrado quadrado = (Quadrado) obj;
        return Double.compare(quadrado.lado, lado) == 0;

    }
}
