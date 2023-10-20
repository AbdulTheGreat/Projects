package game.Characters;


import city.cs.engine.*;
import city.cs.engine.Shape;
import game.Player;
import org.jbox2d.common.Vec2;



public class EnemyBullets extends DynamicBody {


    public final BodyImage image = new BodyImage("data/Bullet.png");
    private static World world;
    private static  Shape shape = new BoxShape(0.5f,1);
    private static Enemy enemy;


    public EnemyBullets() {
        super(world,shape);
        this.addImage(image);
        this.setLinearVelocity(new Vec2(0,12));
        this.setPosition(new Vec2(enemy.getPosition().x,enemy.getPosition().y +5));
        this.setBullet(true);
        this.setGravityScale(0);
    }

    public EnemyBullets(World w, Enemy e) {
        super(w,shape);
        this.addImage(image);
        this.setPosition(new Vec2(e.getPosition().x,e.getPosition().y +5));
        this.setLinearVelocity(new Vec2(0,12));
        this.setBullet(true);
        this.setGravityScale(0);
        world = w;
        enemy = e;


    }


    @Override
    public void addCollisionListener(CollisionListener listener){
        super.addCollisionListener(listener);
    }


}