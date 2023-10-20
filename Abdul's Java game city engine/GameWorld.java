package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import static game.Characters.Enemy.enemyShape;

import game.Characters.Enemy;
import game.Characters.Platforms;


public class GameWorld extends World {
   // private final KeyHandler input;
    private final Player player;

    public GameWorld() {

        //Populate the GameWorld with bodies (ex. platforms, collectibles, characters)

        // make the platforms
        final Platforms ground = new Platforms(this, 15, 0.5f, 0, -15);
        final Platforms leftWall = new Platforms(this, 0.3f,18,-14.7f,0);
        final Platforms rightWall= new Platforms(this, 0.3f,18,14.7f,0);
       // final Platforms object = new Platforms()
        //Make the Player main Character with an overlying Image
        this.player = new Player(this);

        // bullets for the player to fire
        final Bullets bullet = new Bullets(this, player);

        // make enemy objects from the class Enemy
        // making a list of enemies with various set positions and take enemyShape
       Enemy enemy0 = new Enemy(this, enemyShape);
       enemy0.setPosition(new Vec2(-10, 9));
       enemy0.addImage(new BodyImage("data/enemy1.png", 3));
       enemy0.setLinearVelocity(new Vec2(-0,1));

        Enemy enemy1 = new Enemy(this, enemyShape);
        enemy1.setPosition(new Vec2(-6, 20));
        enemy1.addImage(new BodyImage("data/enemy6.png", 3));
        enemy1.setGravityScale(0.1f);

        Enemy enemy2 = new Enemy(this, enemyShape);
        enemy2.setPosition(new Vec2(-3, 30));
        enemy2.addImage(new BodyImage("data/enemy2.png", 3));
        enemy2.setGravityScale(0.1f);

        Enemy enemy3 = new Enemy(this, enemyShape);
        enemy3.setPosition(new Vec2(3, 40));
        enemy3.addImage(new BodyImage("data/enemy2.png", 3));
        enemy3.setGravityScale(0.1f);

        Enemy enemy4 = new Enemy(this, enemyShape);
        enemy4.setPosition(new Vec2(6, 50));
        enemy4.addImage(new BodyImage("data/enemy2.png", 3));
        enemy4.setGravityScale(0.1f);



      /*  //Loop
        while (enemy1.equals(player.getPosition())){
            player.destroy();
        }

       */
    }
    public Player getPlayer(){
        return player;
    }
}