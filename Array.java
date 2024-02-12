import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Array {

    /*
    Class Array (1 dimensional)
        Args : int size
             or
                int size,
        Attributes : array_1D => A list of pieces (Pawn,Rook...)
        Methods : # append(p) : appends p
          -> yet to implement :
                  # insert(i,p),Push, pop delete(i), delete(p)...
                  # sort...

      Dans le cas de ce jeux, nous ne nous soussirons pas du cas ou l'on depasse la taille
      du vecteur, car a priory, ce ci n'arrivera pas .
    */


    List array = new List() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Object get(int index) {
            return null;
        }

        @Override
        public Object set(int index, Object element) {
            return null;
        }

        @Override
        public void add(int index, Object element) {

        }

        @Override
        public Object remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator listIterator() {
            return null;
        }

        @Override
        public ListIterator listIterator(int index) {
            return null;
        }

        @Override
        public List subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    int size_1D ;
    Piece[] array_1D ;
    int index = 0 ;


    public Array(int size){
        this.size_1D = size;
        this.array_1D = new Piece[size] ;
    }
    public Array(int size,Piece p){
        this.size_1D = size;
        this.array_1D = new Piece[size] ;
        this.array_1D[0] = p ;
        this.index++;
    }

    void append(Piece p){
        if(index<size_1D){
        array_1D[index] = p;
        index++;}
    }

    void get_all(){
        for(int i = 0 ;i<size_1D;i++){

        };
    }

     Piece get(int idx){
        return array_1D[idx];
    }
     void set(int idx, Piece other){
        array_1D[idx] = other ;
    }

}
class Array2D {
    /**/

    Array[] arrays ;

    public Array2D(int size_1D,int size_2D) {
        this.arrays = new Array[size_2D];

        for(int i = 0; i<size_2D;i++) {
            this.arrays[i] = new Array(size_1D);
        }
    }

     Array get_row(int idx){
        return arrays[idx];
    }

     void set_row(int idx,Array other){
        arrays[idx] = other;
    }

    Piece get_piece(Piece p){
        Pos2D pos = p.getPos2D();
        return arrays[pos.get_x()].get(pos.get_y()) ;
    }

    void insert_piece(Piece p){
        Pos2D pos = p.getPos2D();
        arrays[pos.get_x()].set(pos.get_y(), p);
    }


}

