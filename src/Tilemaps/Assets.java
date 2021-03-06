package Tilemaps;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage laser, vida, astronautTalker, fondoMenu, fondoSpaceInvaders, spriteNina, naveOff, naveOn, asteroids, bullet,enemy,LaserAlien;

    private static final int WIDHT = 131;
    private static final int HEIGHT = 110;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Sprites/Tilesets/Sheet.png"));
        spriteNina = sheet.crop(0, 0, WIDHT, HEIGHT);
        fondoMenu = ImageLoader.loadImage("/Backgrounds/menu_gif.gif");
        fondoSpaceInvaders = ImageLoader.loadImage("/Backgrounds/spaceInvaders.png");
        naveOff = ImageLoader.loadImage("/Player/naveOff.png");
        naveOn = ImageLoader.loadImage("/Player/naveOn.png");
        astronautTalker = ImageLoader.loadImage("/HUD/HUD_DIALOGUE.png");
        enemy = ImageLoader.loadImage(("/Tilesets/Pursoid.png"));
        LaserAlien = ImageLoader.loadImage("/Tilesets/LaserAlien.png");
        laser = ImageLoader.loadImage("/Tilesets/Laser.png");
        SpriteSheet sheetAsteroids = new SpriteSheet(ImageLoader.loadImage("/Sprites/Tilesets/Sheetasteroids.png"));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                asteroids = sheetAsteroids.crop(126 * j, 91 * i, 126, 91);
            }
        }
        SpriteSheet sheetBullets = new SpriteSheet(ImageLoader.loadImage("/Sprites/Tilesets/Sheetbullets.png"));
        for (int i = 0; i < 3; i++) {
            bullet = sheetBullets.crop(0, 30 * i, 46, 30);
        }
        SpriteSheet sheetVida = new SpriteSheet(ImageLoader.loadImage("/Sprites/Tilesets/heatlhBar.png"));
        vida = sheetVida.crop(0, 0, 125, 201);
    }
}
