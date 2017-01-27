package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public enum TypePiece {
    R("Roi", 20, 'R'),
    D("Dame", 9, 'D'),
    C("Cavalier", 3, 'C'),
    P("Pion", 1, 'P');

    private String nom = "";
    private int valeur = 0;
    private char symbole = '_';


    TypePiece(String nom, int valeur, char symbole){
        this.nom = nom;
        this.valeur = valeur;
        this.symbole = symbole ;
    }

    public int getValeur() {
        return valeur;
    }

    public String getNom() {
        return nom;
    }

    public char getSymbole() {
        return symbole;
    }
}
