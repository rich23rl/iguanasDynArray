package edu.ujcv.progra2;

public class DynArray {

    private int[] array;
    private int size;

    public DynArray(){

        array = new int[10];
        size = 0;
    }

    public DynArray(int size){
        array = new int[size];
        this.size = 0;
    }


    // array[n] = 3;

    public void setIndex(int n,int element){
        if(n > size){
            throw new IndexOutOfBoundsException();
        }
        array[n] = element;
    }


    // x = array[n];

    public int getIndex(int n){
        if(n > size){
            throw new IndexOutOfBoundsException();
        }
        return array[n];
    }

    public void add(int element){
        array[size++] = element;
        grow();
    }



    private void grow() {

        if(size >= array.length) {
            int[] temp = new int[array.length * 2];

            System.arraycopy(array, 0, temp, 0, array.length);

            //for (int i = 0; i < array.length; i++) {
            //  temp[i]= array[i];
            //}

            array = temp;
        }
    }

    public void remove(){
        size--;
    }


    public void addFirst(int element){

        size = size + 1;
        int temp;
        for (int i = 1; i < size; i++) {
            temp = array[i];
            array[i] = element;
            element = temp;
        }
        grow();

    }




    public String toString(){
       StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if(i< size){
                builder.append(array[i]);
                builder.append(',');
                builder.append(' ');
            }else{
                builder.append('v');
                builder.append(',');
                builder.append(' ');

            }
        }
        int sizeb = builder.length();

        builder.deleteCharAt(sizeb - 1);
        builder.deleteCharAt(sizeb - 2);

        return builder.toString();

    }
}
