package tirol.htlanichstrasse.htlcatcher.util;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Config class holding general application constants for the HTL Catcher game
 *
 * @author Joshua Winkler
 * @since 02.11.19
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Config {

   /**
    * Application-wide config instance (singleton)
    */
   @Getter
   private static final Config instance = new Config();

   /*
      LOGO CONFIGURATION
    */

   /**
    * The minimum speed the logo random generate may use
    */
   private int logoMinSpeed = 5;

   /**
    * Pixel margin from lower and upper bound of the screen for random Y coordinate of logos — make
    * sure to not use a too high value here as the margin might quickly be greater than the screen
    * height in landscape mode
    */
   private int logoMargin = 150;

   /**
    * Logo radius in pixels
    */
   private int logoRadius = 60;

   /**
    * The minimum delay between 2 logos spawning on the screen in seconds
    */
   private long logoMinDelay = 5;

   /*
      CURSOR CONFIGURATION
    */

   /**
    * The initial X position of the player cursor
    */
   private int cursorInitialX = 100;

   /**
    * Cursor radius in pixels
    */
   private int cursorRadius = 40;

   /**
    * Constant gravity value
    */
   private int cursorGravity = 1;

   /**
    * Value of cursor accelerating in negative y direction on touch
    */
   private int cursorAcceleration = 20;

   /**
    * The direction delay in the start phase
    */
   private long cursorStartChangeDelay = 500L;

   /*
    * OBSTACLE CONFIGURATION
    */

   /**
    * The speed of obstacles for moving to the left; increases over time
    */
   private int obstacleXDelta = 4;

   /**
    * Minimum gap between two obstacles in pixels
    */
   private int obstacleMinGap = 450;

   /**
    * Maximum gap between two obstacles in pixels
    */
   private int obstacleMaxGap = 650;

   /**
    * Delay in milliseconds between two obstacles spawning
    */
   private long obstacleSpawnDelay = 4500L;

   /**
    * Max amount of obstacles to be on screen simultaneously
    */
   private int obstaclesMaxAmount = 40;

   /**
    * Constant width for all obstacles
    */
   private int obstacleWidth = 120;

}