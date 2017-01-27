package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Dame extends Piece {
    // Constructeur
    public Dame(CouleurPion couleur, Position pos)
    {
        super(TypePiece.D, couleur, pos);
    }

    // Méthodes
    final protected boolean positionPossible(Position position)
    {

        return true;
    }
}
