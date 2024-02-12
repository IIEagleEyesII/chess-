public class Pos2D {
    private int row ;
    private int col ;

    private final short square_color ;

    Pos2D(int row, int col){
        this.row = row ;
        this.col = col ;
        if ((row + col) % 2 == 0) {
            this.square_color = 1 ; //Colored square
        }
        else{
            this.square_color = 0 ; //Blank square
        }
    }

    short getSquare_color(){
        return square_color;
    }

    int get_x(){
        return row ;
    }
    int get_y(){
        return col ;
    }


}
