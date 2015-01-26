package de.popupberlin.soccer.display;

import de.popupberlin.soccer.SoccerData;

/**
 * @author Wojarski
 * The display presenting elapsed time.
 * 
 */
public class ElapsedTimeDisplay extends Display {

	public ElapsedTimeDisplay(SoccerData data) {
		super(data);
	}

	@Override
	public void gameUpdate() {
		System.out.println("Time: " + data.getCurrentMinute());
	}

}
