package Chess;

public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot(Piece piece, int x, int x1) {
        this.piece = piece;
        this.x = x;
        this.x = x1;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
