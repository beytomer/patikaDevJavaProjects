package GenericList;
import java.io.ObjectInputFilter;
import java.util.Arrays;
public class MyList <T>{
    private int capacity=10;
    private T[]array;

    public MyList(){
        this.array=(T[]) new Object[capacity];
    }

    public MyList(int capacity){
        this.capacity=capacity;
        this.array=(T[])new Object[capacity];
    }
    public int getCapacity(){
        return this.array.length;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public T[] getArray(){
        return array;
    }
    public void setArray(T[] array){
        this.array=array;
    }

    public int size(){
        int size=0;
        for (int i=0; i<getCapacity();i++){
            if (array[i]!=null){
                size++;
            }
        }
        return size;
    }
    public void add(T data) {
        //add to element in array
        if (this.size() == this.getCapacity()) {

            T[] newArray = (T[]) new Object[this.getCapacity() * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[this.size()] = data;
    }

    public T get(int index){
        if(index<0  || index>=this.size()){
            return null;
        }
        return this.array[index];
    }

    public T remove(int index){
        if (index<0 || index>=this.size()){
            return null;
        }
        T removeIndex=this.array[index];
        for (int i=index; i<this.size()-1;i++){
            this.array[i]=this.array[i+1];
        }
        this.array[this.size()-1]=null;

        return removeIndex;
    }

    public T set(int index, T data){
        if(index<0 || index>=this.size()){
            return null;
        }
        T oldData=this.array[index];
        this.array[index]=data;
        return oldData;
    }
    public String toString(){
        StringBuilder string = new StringBuilder("[");
        String str;


        for ( int i=0; i < this.size() ; i++ ) {
            str = String.valueOf( this.array[i] );

            if ( i != this.size()-1 ){
                string.append(str).append(",");
            }else string.append(str);

        }
        string.append("]");


        return string.toString();
    }
    public int indexOf(T data){
        for (int i=0; i<this.size();i++){
            if (this.array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int i=this.size(); i<0;i--){
            if (this.array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        if (this.size()==0){
            return true;
        }
        return false;
    }
    public T[] toArray(){
        T[] newArray=(T[])new Object[this.size()];
        for (int i=0; i<this.size();i++){
            newArray[i]=this.array[i];
        }
        return newArray;
    }
    public void clear(){
        for (int i=0; i<this.array.length;i++){
            this.array[i]=null;
        }
    }

    public MyList<T>sublist(int star,int finish){
        if (star<0 || finish<0 || star>this.size()||finish>this.size()){
            return null;
        }
        MyList<T>newList=new MyList(finish-star);
        for (int i=star; i<=finish;i++){
            newList.add(this.array[i]);
        }
        return newList;
    }
    public boolean contains(T data){
        for(int i=0; i<this.size();i++){
            if (this.array[i].equals(data)){
                return true;
            }
        }
        return false;
    }



}
