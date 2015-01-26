package de.popupberlin.soccer.display;

import de.popupberlin.soccer.SoccerData;

/**
 * @author Wojarski
 * The display responsible for nice game statistics. 
 *
 */
public class GameStatisticsDisplay extends Display {

	public GameStatisticsDisplay(SoccerData data) {
		super(data);
	}

	@Override
	public void gameUpdate() {
		// a very simple statistic
		System.out.println("Total goals in this game are: " + (data.getGoalsTeamA() + data.getGoalsTeamB()));
	}

}
