// Luke
// Done : 30/01/2022
public class main {
    static int success = 0;
    final static int numberOfTimes = 1000000;
    static mouse mouse;
    static maze maze;

    public static void main(String[] args) {   
        int trial = 0;
        while(trial < numberOfTimes) {
            maze mazes = new maze(6);     
            mouse = new mouse(mazes);
            mouse.resetDirection();
            while (!mouse.gameover()) {
                mouse.move();
                if (mouse.gameWin()) {
                    success += 1;
                    break;
                }               
            }
            trial++;
        }
        printResult();
    }

    private static void printResult(){
        mouse.getResult(success, numberOfTimes);
    }
}