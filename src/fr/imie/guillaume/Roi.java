package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Roi extends Piece
{
    // Constructeur
    public Roi(CouleurPion couleur, Position pos)
    {
        super(TypePiece.R, couleur, pos);
    }

    // Méthodes
    final protected boolean positionPossible(Position position)
    {

        return true;
    }
}
