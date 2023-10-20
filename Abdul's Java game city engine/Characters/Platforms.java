package game.Characters;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class Platforms {
    private World world;
    private float width;
    private float height;
    private float x;
    private float y;
    private boolean isDestroyed;

    public Platforms(World world, float width, float height, float x, float y) {
        this.world = world;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;

        update();
    }

    public void update() {
        Shape shape = new BoxShape(this.width, this.height);
        StaticBody ground = new StaticBody(this.world, shape);
        ground.setPosition(new Vec2(this.x, this.y));

    }

    public void destroy() {
        isDestroyed = true;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }


    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
        update();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        update();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
        update();
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        update();
    }
}