package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.util.ArrayList;

public class Player extends city.cs.engine.Walker {

    private  final Shape playerShape = new PolygonShape(-0.02f, 0.94f, 0.76f, 0.55f, 1.26f, -0.67f, 1.18f, -0.85f, -1.17f, -0.85f, -1.27f, -0.66f, -0.79f, 0.54f);
    private static final BodyImage image = new BodyImage("data/SpaceCraft.png", 4);

    private static final int id = 0;

    private static final int Credit = 0;
    private KeyHandler input;
    private volatile boolean left, right, up, down, fire;
    //Velocities
    private final float verAcc = 0;
    private final float horAcc = 0;
    private final float maxHorVel = 10;
    private final float maxVerVel = 10;
    private final float horVel = 0;
    private final float verVel = 0;
    private final float friction = 0.9999f;

    private boolean isLookingRight = true;
    private boolean isWalking = false;
    private final boolean isInAir = false;


    public Player(World world){
        super(world);
        SolidFixture fixture = new SolidFixture(this, playerShape, 1000);
        fixture.setFriction(1000);
        this.addImage(image);
        this.setPosition(new Vec2(0,-9));
    }
    @Override
    public void startWalking(float speed){
        super.startWalking(speed);
        isWalking = true;
    }
    @Override
    public void stopWalking(){
        super.stopWalking();
        startWalking(getAngularVelocity());
        isWalking = false;
    }

    public void fire() {
        Bullets bullet = new Bullets();
        final BulletCollisions bulletCollisions = new BulletCollisions(bullet);
        bullet.addCollisionListener(bulletCollisions);
    }
}