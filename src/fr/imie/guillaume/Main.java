package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Main {
    public static void main(String[] args) {

    Echiquier.getInstance();

    //   Ajouter un roi, une reine, un cavalier et un pion à l’échiquier
        // TODO Vérifier que l'on ne puisse pas avoir 2 pièces différentes sur la même position
    Echiquier.getInstance().ajouterPiece(new Pion(CouleurPion.Blanc, new Position(0, 0)));
    Echiquier.getInstance().ajouterPiece(new Roi(CouleurPion.Blanc, new Position(1, 0)));
    Echiquier.getInstance().ajouterPiece(new Dame(CouleurPion.Blanc, new Position(2, 0)));
    Echiquier.getInstance().ajouterPiece(new Cavalier(CouleurPion.Blanc, new Position(3, 0)));

    //→ Afficher les points du joueurs
    System.out.println("Nombre de points pour les " + CouleurPion.Blanc + " : " + Echiquier.getInstance().getPoints(CouleurPion.Blanc));

    //→ Déplacer le roi (Exception) et le pion (Valide)
        Echiquier.getInstance().getPiece(new Position(0,0)).deplacement(new Position(0,3));
    //→ Sauvegarder

    //→ Restaurer

    //→ Afficher l’échiquier

    //→ Afficher le roi

    }
}
