package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Cavalier extends Piece {
    // Constructeur
    public Cavalier(CouleurPion couleur, Position pos)
    {
        super(TypePiece.C, couleur, pos);
    }

    // Méthodes
    final protected boolean positionPossible(Position position)
    {

        return true;
    }
}
