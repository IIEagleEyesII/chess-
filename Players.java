public class Players {
    short color;
    Array Pawns = new Array(64) ;
    Array Rooks = new Array(64)  ;
    Array Knights = new Array(64);
    Array Bishops = new Array(64);
    Array Queens = new Array(64);
    Array Kings = new Array(64); //A board with 64 Kings would be funny XD
    Array2D All = new Array2D(8,8);
    public Players(short color){

        this.color = color ;

        for(int i=0;i<8;i++){

            Pos2D second_row  = new Pos2D(0,i);
            Pos2D first_row = new Pos2D(1,i) ;
            Pawns.append(new Pawn(this.color,second_row));

            switch (i){
                case 0 :
                    Rook rook1 = new Rook(this.color,first_row);
                    Rooks.append(rook1);
                    All.insert_piece(rook1);

                case 1:
                    Knight knight1 = new Knight(this.color,first_row);
                    Knights.append(knight1);
                    All.insert_piece(knight1);

                case 2 :
                    Bishop bishop1 = new Bishop(this.color,first_row);
                    Bishops.append(bishop1);
                    All.insert_piece(bishop1);

                case 3 :
                    if(this.color == 0){
                        Queen queen = new Queen(this.color,first_row) ;
                        Queens.append(queen);
                        All.insert_piece(queen);
                    }
                    else {
                        King king = new King(this.color,first_row);
                        Kings.append(king);
                        All.insert_piece(king);

                    }

                case 4 :
                    if(this.color == 1){
                        Queen queen = new Queen(this.color,first_row) ;
                        Queens.append(queen);
                        All.insert_piece(queen);
                    }
                    else {
                        King king = new King(this.color,first_row);
                        Kings.append(king);
                        All.insert_piece(king) ;
                    }

                case 5 :
                    Bishop bishop2 = new Bishop(this.color,first_row);
                    Bishops.append(bishop2);
                    All.insert_piece(bishop2);

                case 6 :
                    Knight knight2 = new Knight(this.color,first_row);
                    Knights.append(knight2);
                    All.insert_piece(knight2);

                case 7 :
                    Rook rook2 = new Rook(this.color,first_row);
                    Rooks.append(rook2);
                    All.insert_piece(rook2);
    }
    }
    }


    void print_details(){
        if(color == 0 ){
            System.out.println("Player Blank");
        }
        else {System.out.println("Player Black");}

        System.out.println("Pawns : "+ Pawns.get(1).get_y());


    }


}




class HumanPlayer extends Players {
    public HumanPlayer(short color) {
        super(color);
    }

    }



class AiPlayer extends Players {
    public AiPlayer(short color) {
        super(color);
    }
    }