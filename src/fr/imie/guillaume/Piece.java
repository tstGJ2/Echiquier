package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public abstract class Piece {
    // Attributs
    protected CouleurPion couleur; //→ Une pièce est caractérisée par une couleur et une position
    protected Position position;
    protected TypePiece typePiece;

    // Accesseurs

    public CouleurPion getCouleur() {
        return couleur;
    }

    public void setCouleur(CouleurPion couleur) {
        this.couleur = couleur;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public TypePiece getTypePiece() {
        return typePiece;
    }

    public void setTypePiece(TypePiece typePiece) {
        this.typePiece = typePiece;
    }

    // Constructeur
    public Piece(TypePiece typePiece, CouleurPion couleur, Position pos)
    {
        this.typePiece = typePiece;
        this.couleur = couleur;
        this.position = pos;
    }
    // Méthodes

    //→ Il sera nécessaire de développer une méthode :
    //            → boolean positionPossible(Position position) : vérifie si la position de la
    //    pièce est possible
    protected abstract boolean positionPossible(Position position);

    //→ char getSymbole() : affiche le typePiece de la pièce (R, D, C, P)
    public char getSymbole()
    {
        return this.typePiece.getSymbole();
    }

    //→ int getValeur() : affiche la valeur de la pièce (20, 9 , 3 ; 1)
    public int getValeur()
    {
        return this.typePiece.getValeur();
    }

    //→ void deplacement(Position position) : qui déplace la pièce sur l’échiquier
    public void deplacement(Position newPos)
    {
        // Si le déplacement est possible
        if (positionPossible(newPos)) {
            // Changer de position
            this.position = newPos;
        }
    }

    @Override
    //→ toString : qui affiche le typePiece de la pièce, la couleur et la position
    public String toString()
    {
        return "Symbole : " + this.typePiece.getSymbole() +
                "/n Couleur : " + this.couleur +
                "/n Position : X=" + this.position.getX() + " Y=" + this.position.getY()
                ;
    }

}
