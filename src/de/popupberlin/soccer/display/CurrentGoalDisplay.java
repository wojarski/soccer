package de.popupberlin.soccer.display;

import de.popupberlin.soccer.SoccerData;

/**
 * @author Wojarski
 * The display presenting current game result.
 *
 */
public class CurrentGoalDisplay extends Display {

	public CurrentGoalDisplay(SoccerData data) {
		super(data);
	}

	@Override
	public void gameUpdate() {
		System.out.println("Current game result A : " + data.getGoalsTeamA() + " | " + data.getGoalsTeamB() + " : B");
	}
}
