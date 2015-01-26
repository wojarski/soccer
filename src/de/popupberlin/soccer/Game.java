package de.popupberlin.soccer;

import de.popupberlin.soccer.display.CurrentGoalDisplay;
import de.popupberlin.soccer.display.ElapsedTimeDisplay;
import de.popupberlin.soccer.display.GameStatisticsDisplay;

/**
 * @author Wojarski
 * Game class containing example game 
 */
public class Game {

	public static void main(String[] args) {
		SoccerData soccerData = new SoccerData();
		
		new CurrentGoalDisplay(soccerData);
		soccerData.measurementsChanged();
		
		new GameStatisticsDisplay(soccerData);
		soccerData.measurementsChanged();
		
		new ElapsedTimeDisplay(soccerData);
		soccerData.measurementsChanged();
	}

}
