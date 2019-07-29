package edu.ujcv.progra2;

public class DynArray<T> {

    private T[] array;

    public int getSize() {
        return size;
    }

    private int size;

    public DynArray(){

        array = (T[])new Object[10];
        size = 0;
    }

    public DynArray(int size){
        array = (T[])new Object[size];
        this.size = 0;
    }


    // array[n] = 3;

    public void setIndex(int n,T element){
        if(n > size){
            throw new IndexOutOfBoundsException();
        }
        array[n] = element;
    }




    public void add(T element){
        array[size++] = element;
        grow();
    }



    private void grow() {

        if(size >= array.length) {
            T[] temp = (T[])new Object[array.length * 2];

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


    public void addFirst(T element){

        size = size + 1;
        T temp;
        for (int i = 0; i < size; i++) {
            temp = array[i];
            array[i] = element;
            element = temp;
        }
        grow();

    }

    public  void addIndex(int index, T element){
        size++;
        if(index>= size){
            throw new IndexOutOfBoundsException();
        }
        T temp;
        for (int i = index; i < size; i++) {
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
                builder.append(array[i].toString());
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