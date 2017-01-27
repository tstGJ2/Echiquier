package fr.imie.guillaume;

/**
 * Created by jiolle.cdi04 on 27/01/2017.
 */
public class Position {
    // Attributs
    private int x;
    private int y;

    // Accesseurs

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Constructeur

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Position.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Position position = (Position) obj;
        if ((this.x == null) ? (position.x != null) : !this.x.equals(position.x)) {
            return false;
        }
        if (this.age != position.age) {
            return false;
        }
        return true;
    }}
