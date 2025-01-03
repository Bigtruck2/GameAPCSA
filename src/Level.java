public class Level {
    private int points;
    private boolean goal;
    public Level(int points, boolean goal){
        this.points = points;
        this.goal = goal;
    }
    //returns true if player reached goal
    public boolean goalReached()
    { return goal; }
    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    { return points; }
// There may be instance variables, constructors, and methods that are not shown.
}