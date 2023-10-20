package game.Characters;

import city.cs.engine.*;
import city.cs.engine.Shape;
import game.BulletCollisions;
import game.Bullets;

import java.awt.*;
import java.util.ArrayList;

public class Enemy extends Walker {


   // public static ArrayList<Enemy> enemies = new ArrayList<>();


    public static final Shape enemyShape = new PolygonShape(0.33f,1.68f, 1.12f,0.7f, 1.65f,-1.12f, 1.24f,-1.65f, -1.22f,-1.58f, -1.71f,-1.08f, -1.13f,0.79f, -0.38f,1.66f);

    //Velocities
    private final float gravity = 10;
    private final float horAcc = 0;
    private final float maxHorVel = 10;
    private final float maxVerVel = 10;
    private final float horVel = 0;
    private final float verVel = 0;

    public Enemy(World world, Shape shape){
        super(world, enemyShape);


    }
    /*public Enemy(World world, Frame frame) {
        super(world, enemyShape);
        enemies.add(this);
    }

     */
    public void fire() {
        Bullets bullet = new Bullets();
        final BulletCollisions bulletCollisions = new BulletCollisions(bullet);
        bullet.addCollisionListener(bulletCollisions);
    }
}
