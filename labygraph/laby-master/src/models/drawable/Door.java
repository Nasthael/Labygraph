package models.drawable;

import controllers.ingame.GameManager;

/**
 * Door est la classe représentant la porte de sortie du labyrinthe.
 * @see Entity
 */
public class Door extends Entity{
    public Door(int x, int y) {
        super(x, y, EntityType.DOOR);
        this.setSpriteType(SpriteType.EXIT);
        setGoalX(x);
        setGoalY(y);
    }

    public Door() {
        super(EntityType.DOOR);
        this.setSpriteType(SpriteType.EXIT);
    }

    @Override
    public void eventCollision(Entity collider)
    {
        switch (collider.getType()) {
            case PLAYER:
                GameManager.callCleared();
                break;
            case NPC:
                break;
            case DOOR:
                break;
            case ONOFF:
                break;
            case BONUS:
                break;
        }
    }

    public boolean ifCollision(Entity e){
        return (getX() == e.getGoalX() && getY() == e.getGoalY());
    }

}


