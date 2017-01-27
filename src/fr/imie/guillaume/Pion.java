package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Pion extends Piece {

    // Constructeur
    public Pion(CouleurPion couleur, Position pos)
    {
        super(TypePiece.P, couleur, pos);
    }

    // Méthodes
    final protected boolean positionPossible(Position position)
    {

        return true;
    }
}
