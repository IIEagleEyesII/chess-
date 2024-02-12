public class Piece {
    int color ; //1 colored, 0 blank
    Pos2D pos2D;
    public Piece(int color,Pos2D pos2D){
        this.color = color ;
        this.pos2D = pos2D;
    }
    int get_x(){return pos2D.get_x(); };

    int get_y(){return pos2D.get_y();}

    Pos2D getPos2D(){return this.pos2D;}



}

class Pawn extends Piece{
    public Pawn(int color, Pos2D pos2D){
        super(color, pos2D);
    }


    boolean first_move = false; //So that the pawn gets to move forward by two the first time if wanted.

    void move(){
        if (!this.first_move){

        }



    }
}
class Bishop extends Piece{
    public Bishop(int color, Pos2D pos2D) {
        super(color , pos2D);
    }
    short hall_way_color = pos2D.getSquare_color() ;


}

class Knight extends Piece{
    public Knight(int color, Pos2D pos2D){
        super(color, pos2D);
    }
}

class Rook extends Piece{
    public Rook(int color, Pos2D pos2D){
        super(color, pos2D);
    }
}

class Queen extends Piece{
    public Queen(int color, Pos2D pos2D){
        super(color, pos2D);
    }
}

class King extends Piece{
    public King(int color, Pos2D pos2D){
        super(color, pos2D);
    }
}