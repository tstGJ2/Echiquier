package fr.imie.guillaume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Echiquier {
    // Attributs
    private static Echiquier myInstance;    // instance Singleton

    private List<Piece> listPiece; //→ Collection de Pieces
    // Accesseurs

    // Constructeur
    private Echiquier()
    {
        listPiece = new ArrayList<Piece>();
    }

    // Méthodes Statiques

    public static Echiquier getInstance()
    {
        if (myInstance == null)
        {
            myInstance = new Echiquier();
        }
        return myInstance;
    }

    // Méthodes

    //→ public void ajouterPiece(Piece p) : qui ajoute une pièce
    public void ajouterPiece(Piece P){
        // Ajoute une pièce à la liste
        this.listPiece.add(P);
    }

    //→ public Piece getPiece(Position p) : qui renvoie la pièce à la position ou null
    public Piece getPiece(Position p)
    {
        Piece result = null;
        // On parcourt toutes les pièces de l'échiquier
        for (Piece piece : this.listPiece)
        {
            // Si la position de la pièce correspond à la position recherché
            // On récupère la pièce
            // TODO : Gérer les cases vides (Null Exception)
            if (piece.getPosition().equals(p))
            {
                result = piece;
            }
        }
        return result;
    }

    //→ public int getPoints(char couleur) : qui renvoie le nombre de point du joueur
    public int getPoints(CouleurPion couleurPion)
    {
        int result = 0;
        for (Piece piece : this.listPiece)
        {
            // On fait la somme des points pour chaque pièce de la couleur souhaitée
            if (piece.getCouleur().equals(couleurPion))
            {
                result += piece.getValeur();
            }
        }
        return result;
    }

    //→ public void afficher() : qui affiche l’échiquier
    public void afficher()
    {
        // Afficher le plateau
        // TODO
        // Afficher les pièces
        // TODO
    }

    //→ public void sauvegarde() : qui sauvegarde l’échiquier dans un fichier
    //→ public void chargement() : qui charge l’échiquier depuis un fichier
}
