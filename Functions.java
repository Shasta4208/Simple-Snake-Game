import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Functions implements KeyListener
{
	public Functions(int sx, int sy)
	{
		drawer = new Drawer(sx, sy);	
		grid = new Grid(sx, sy, drawer);
		snake = new Snake(drawer, grid);
		
		grid.draw();
		snake.draw();
		drawer.setVisible(true);
		lastKey = Snake.MoveDir.NONE;
		
		drawer.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) 
	{
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP -> lastKey = Snake.MoveDir.UP;
			case KeyEvent.VK_DOWN -> lastKey = Snake.MoveDir.DOWN;
			case KeyEvent.VK_LEFT -> lastKey = Snake.MoveDir.LEFT;
			case KeyEvent.VK_RIGHT -> lastKey = Snake.MoveDir.RIGHT;
		}

    }
	
	public void run()
	{
		timer = new Timer();
		timer.schedule(new GameLoop(),1000, (long)(550 * 0.4));
	}
	
	class GameLoop extends TimerTask
	{
		public void run()
		{
			if(!snake.move(lastKey))
			{
				timer.cancel();
			}
			
			if(!grid.hasApple())
				grid.spawnApple();
				drawer.setTitle("Score: " + snake.getLength());
			
			grid.draw();
			snake.draw();
		}
	}
	
	private Snake.MoveDir lastKey;
	private Timer timer;
	private Grid grid;
	private Snake snake;
	private Drawer drawer;

}


