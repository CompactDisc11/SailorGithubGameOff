package io.github.Sailor;

public class Timer
{	
	
	
	public double timeRemaining;
	private double timeMaximum;
	private double timeScale;
	private boolean finished;
	private boolean repeat;
	//Subscribers 
	public Timer(double maxTime, double tScale, boolean shouldRepeat)
	{
		timeMaximum = maxTime;
		timeRemaining = timeMaximum;
		timeScale = tScale;
		repeat = shouldRepeat;
	}
	
	public void update(double dt)
	{
		timeRemaining -= timeScale*dt;
		if (timeRemaining <= 0.0)
		{
			//updateListeners();
		}
		
	}

}
