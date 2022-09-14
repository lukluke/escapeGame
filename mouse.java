/**
 * Name: Luke Luk
 * maze.java 
 */
public class mouse {
    private maze mazes;
    static int x_position;
    static int y_position;
        
    public mouse(maze mazes){
        this.mazes = mazes;
        x_position = mazes.getPositionX();
        y_position = mazes.getPositionY();
    }

    // inital position (0, 0)

    protected void resetDirection() {
        mazes.setDirection(0, 0); 
    }

    // prob, 0.4 keep direction
    // 0.7 right
    // 1 left
    protected void move() {
        double chance = Math.random();
        if (chance < 0.4) {
            mazes.moveKeepDirection();
        }else if (chance < 0.7) {
            mazes.moveRightDirection();
        } else if (chance < 1) {
            mazes.moveLeftDirection();
        } 
    }

    // return Information 

    protected void getResult(int success, int numberOfTimes) {
        double successRate = (double) success / numberOfTimes;
        System.out.println("The Monte Carlo simulation result of one million runs: ");
        System.out.printf("No. of successful escape: %d\n", success);
        System.out.printf("Success Rate P: %.3f", successRate);
    }

    // check position block or not 
    // True --> the mouse need to find another direction
    // false --> the mouse can move this direction 

    public  boolean gameover() {
            if (mazes.getPositionX() == 0 && mazes.getPositionY() > 0 && (mazes.getPositionY() == 6)) {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() +1, mazes.getPositionY()) 
                    && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() -1) 
                ); 
            } else if ( (mazes.getPositionX() == 0 && mazes.getPositionY() > 0) && (mazes.getPositionY() != 6)) {
                
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() +1, mazes.getPositionY()) 
                && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() +1)  && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() -1) 
                );
            } else if ((mazes.getPositionX() > 0 && mazes.getPositionY() == 6) && (mazes.getPositionX() != 6)) {
               
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() +1, mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                    && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() -1)
                );
            } else if ( (mazes.getPositionX() > 0 && mazes.getPositionY() == 0  && (mazes.getPositionX() != 6))) {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() +1, mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                );
            } else if ( (mazes.getPositionX() == 6 && mazes.getPositionY() == 0)) {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() +1) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                );
            } else if ( (mazes.getPositionX() == 6 && mazes.getPositionY() == 0)) {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() +1) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                );
            } else if ( (mazes.getPositionX() == 6 && mazes.getPositionY() > 0) &&  mazes.getPositionY() != 6) {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() +1) && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() -1) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                );
            } else {
                return (!mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() +1, mazes.getPositionY()) && !mazes.directionChecking(mazes.getPositionX() -1, mazes.getPositionY())
                && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() +1) && !mazes.directionChecking(mazes.getPositionX(), mazes.getPositionY() -1)
                );
            }
    }

    // check game win
    // if now rat position is == (6, 6)
    // win
    // else not win

    protected  boolean gameWin() {
        if (mazes.getPositionX() == mazes.getMazeSize() && mazes.getPositionY() == mazes.getMazeSize()) {  
            return true;
        }
        return false;
    }
}
