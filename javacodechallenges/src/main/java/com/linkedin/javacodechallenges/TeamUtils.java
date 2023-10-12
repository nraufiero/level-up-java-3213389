package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

public class TeamUtils {

  public static void generateTeamsScores(List<Team> teams,
      int numberOfRounds) {
    Random random = new Random();
    teams.forEach(team -> {
      for (int i = 0; i < numberOfRounds; i++) {
        team.getScores().add(random.nextInt(11));
      }
    });
  }

  public static void revealResults(List<Team> teams) {
    List<Team> sortedTeams = new ArrayList<>(teams);
    sortedTeams.sort((Team team1, Team team2) -> team2.sumTotalScore() - team1.sumTotalScore());
    for(int i=0; i<sortedTeams.size(); i++) {
      System.out.println(i + "th element is " + sortedTeams.get(i).sumTotalScore());
    }
  }
}