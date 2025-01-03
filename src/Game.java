import java.util.Random;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
    /** Postcondition: All instance variables have been initialized. */
    public Game()
    { /* implementation not shown */ }
    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    { return bonus; }
    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
     * game data
     */
    public void play()
    { 
        levelOne = new Level((int) (Math.random()*6)*100, (new Random()).nextBoolean());
        levelTwo = new Level((int) (Math.random()*6)*100, (new Random()).nextBoolean());
        levelThree = new Level((int) (Math.random()*6)*100, (new Random()).nextBoolean());
        bonus = (new Random()).nextBoolean();
    }
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore() {
        boolean goals = levelOne.goalReached();
        int points = 0;
        if(goals) points+=levelOne.getPoints();
        goals&=levelTwo.goalReached();
        if(goals) points+=levelTwo.getPoints();
        goals&=levelThree.goalReached();
        if(goals) points+=levelThree.getPoints();
        if(isBonus()) points*=3;
        return points;
    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    { 
        int score = 0;
        for(int i = 0; i<num;i++){
            play();
            if(score<getScore()) score = getScore();
    } return score; }
// There may be instance variables, constructors, and methods that are not shown.
}