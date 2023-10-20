package game;


import city.cs.engine.*;
import city.cs.engine.Shape;
import game.KeyHandler;
import org.jbox2d.common.Vec2;


public class Bullets extends DynamicBody {


    public final BodyImage image = new BodyImage("data/Bullet.png");
    private static World world;
    private static  Shape shape = new BoxShape(0.5f,1);
    private static Player player;

// Create a constructor that takes no parameter
    public Bullets() {
        super(world,shape);
      this.addImage(image);
      // make the Bullet travel in straight vertical line
      this.setLinearVelocity(new Vec2(0,12));
      // make the bullet launch from the position of the player
      this.setPosition(new Vec2(player.getPosition().x,player.getPosition().y +2));
      this.setBullet(true);
      this.setGravityScale(0);
    }
   // another Constructor that take parameters of world and player
    public Bullets(World w, Player p) {
        super(w,shape);
        this.addImage(image);
        this.setPosition(new Vec2(p.getPosition().x,p.getPosition().y +5));
        this.setLinearVelocity(new Vec2(0,12));
        this.setBullet(true);
        this.setGravityScale(0);
        world = w;
        player = p;
    }
   // create the override method for Collisions and overrides the method in the supertype
   @Override
    public void addCollisionListener(CollisionListener listener){
        super.addCollisionListener(listener);
   }


}