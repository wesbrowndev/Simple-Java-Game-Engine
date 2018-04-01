
public class GameEngine {

	static int fps = 0;
	static int second = 1000000000;
	
	public void LaunchApp() {
		Thread loop = new Thread() {
			public void run () {
				gameLoop();
			}
		};
		
		loop.run();
	}
	
	public void Start() {
		System.out.println("Scene does not contain Start()");
	}

	public void Update(float delta) {}
	
	private void gameLoop()
	{
		int lastFpsTime = 0;

		long lastLoopTime = System.nanoTime();
		final int TARGET_FPS = 60;
		final long OPTIMAL_TIME = second / TARGET_FPS;
		
		// Initialize all required methods
		launchMethods();
		
		// Course laid in... Punch it.
		while (true)
		{
			// Work out how long its been since the last update
			// This will be used to calculate how far the entities should move this loop
			long now = System.nanoTime();
			long updateLength = now - lastLoopTime;
			lastLoopTime = now;
			float delta = updateLength / ((float)OPTIMAL_TIME);

			// Update the frame counter
			lastFpsTime += updateLength;
			fps++;

			// Update the FPS counter if a second has passed since last recorded
			if (lastFpsTime >= second)
			{
				System.out.println("FPS: " + fps);
				lastFpsTime = 0;
				fps = 0;
			}

			// Update game logic
			Update(delta);

			// Draw Everything
			//render();

			// Each frame will take 10 milliseconds. to do this
			// Add 10 milliseconds to the start then factor in the current time to give the final value
			try {
				Thread.sleep( (lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void launchMethods() {
		WindowManager winMan = new WindowManager();
		winMan.createWindow();
		
		Start();
	}
}
