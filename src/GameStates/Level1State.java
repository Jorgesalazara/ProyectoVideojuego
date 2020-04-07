package GameStates;

import FirstMinigame.Level1UpManager;
import MainG.Handler;
import java.awt.Graphics2D;
import java.util.concurrent.ThreadPoolExecutor;

public class Level1State extends GameState{

    ThreadPoolExecutor pool;
    Handler handler;
    
    public Level1State(GameStateManager gsm, ThreadPoolExecutor pool, Handler handler, Level1UpManager manager){
        super(gsm);
    }
    
    @Override
    public void init() {
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {

    }

    @Override
    public void musicControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
