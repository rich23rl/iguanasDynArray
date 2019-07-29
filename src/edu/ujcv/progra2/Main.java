package edu.ujcv.progra2;

public class Main {

    public static void main(String[] args) {
        // write your code here


        DynArray<Integer> areglo = new DynArray(5);

        areglo.addIndex(0,1);
        areglo.add(2);
        areglo.add(3);
        areglo.add(4);
        areglo.addIndex(1,1);
        areglo.add(5);
        areglo.add(6);
        areglo.add(7);
        areglo.add(8);
        areglo.addIndex(areglo.getSize(),1);

        DynArray<String> areglos = new DynArray(5);

        areglos.addIndex(0,"hola");
        areglos.add("mundo");
        areglos.add("3");
        areglos.add("jaime ");
        areglos.addIndex(1,"david");
        areglos.add("cinco");
        areglos.add("mineCraft");
        areglos.add("www.");
        areglos.addIndex(areglos.getSize(),"G");



    }
}