package de.popupberlin.soccer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.popupberlin.soccer.display.Display;

/**
 * @author Wojarski
 * Tracks soccer data like goals of each team, time elapse.
 * Via the methods register / unregisterDisplay gives possibility of attaching / detaching
 * game displays. 
 * All registered displays are notified as soon as soccer data changes and all process same version of it.
 */
public class SoccerData {
	private List<Display> displays = new ArrayList<Display>();
	private Byte goalsTeamA = 2;
	private Byte goalsTeamB = 3;
	private long startTime;
	private long currentMinute;
	
	public SoccerData() {
		this.startTime = new Date().getTime();
	}
	
	public Byte getGoalsTeamA() {
		return goalsTeamA;
	}
	
	public Byte getGoalsTeamB() {
		return goalsTeamB;
	}
	
	public long getCurrentMinute() {
		return currentMinute;
	}
	
	/**
	 * Detach display from the game
	 * @param display
	 */
	public void registerDisplay(Display display) {
		synchronized(this) {
			displays.add(display);
		}
	}
	/**
	 * Attach new display to the game
	 * @param display
	 */
	public void unregisterDisplay(Display display) {
		synchronized(this) {
			displays.remove(display);
		}
	}
	/**
	 * Called when new data is available
	 */
	public void measurementsChanged() {
		 synchronized(this) {
			 System.out.println("---------------------------------");
			 currentMinute = new Date().getTime() - startTime;
			 for(Display display: displays) {
				 display.gameUpdate();
			 }
		 }
	}
}
