package de.popupberlin.soccer.display;

import de.popupberlin.soccer.SoccerData;

/**
 * @author Wojarski
 * The generic type of display.
 *
 */
public abstract class Display {
	protected final SoccerData data;
	public abstract void gameUpdate();

	public Display(SoccerData data) {
		this.data = data;
		data.registerDisplay(this);
	}
}
