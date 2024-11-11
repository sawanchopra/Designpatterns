package TicTacToe;

public class Player {
    public String Name;
    public PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        Name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
