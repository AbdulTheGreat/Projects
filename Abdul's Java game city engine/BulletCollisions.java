package game;
import game.Bullets;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import game.Characters.Enemy;

public class BulletCollisions implements CollisionListener {

    // declaring a Variable from Class Bullets
    private Bullets bullet;
   // Creating a constructor for the Class and assigning bullet value to the actual bullet from the Bullet class
    public BulletCollisions(Bullets bullet){
        this.bullet= bullet;
    }

    //Override method to use the collisionEvent that interacts with bodies in the world
    @Override
    public void collide(CollisionEvent e){
        e.getReportingBody().destroy();
        if (e.getOtherBody() instanceof Enemy){
            e.getOtherBody().destroy();
        }
        else if(e.getReportingBody() instanceof Player){
                e.getOtherBody().destroy();}
    }
}