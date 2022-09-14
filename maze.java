/**
 * Name: Luke
 * maze.java 
 */
public class maze {
    public int dimensionSize;
    int maze[][];
    private String mouseHeader = "+x";
    private int x_position;
    private int y_position;
    private String header;

    public maze () {
        this.x_position = 0;
        this.y_position = 0;
    }

    public maze (int dimensionSize) {
        this.dimensionSize = dimensionSize;
        maze = new int [dimensionSize +1][dimensionSize +1];
    }

    public boolean directionChecking(int x_position, int y_position) {
        try {
            return maze[x_position][y_position] != 1;
        } catch (Exception e) {
            return false;
        }
    }

    // set Current Position
    // if 1 is true , the mouse went position
    // else is 0

    public void setDirection(int x_position, int y_position) {
        this.x_position = x_position;
        this.y_position = y_position;
        maze[x_position][y_position] = 1;
    }

    // getPositionX : get current position X
    // getPositionY : get current position Y
    // setCurrentHeadDirection: the mouse which direction\
    // directionChecking: check next position block or not 
    // if 1 is true , the mouse went position, not go
    // else is 0 , the mouse can go
    // setDirection : set Current Position
    // if 1 is true , the mouse went position
    // else is 0

    protected boolean moveKeepDirection() {
        if ((getPositionX() == 0 && getPositionY() == 0) &&  getHeader() == "+x") {
            y_position = getPositionY() + 1;
            header = "+x";
            setCurrentHeadDirection(header);
            setDirection(x_position, y_position);      
            return false;

        } else if(directionChecking(getPositionX() +1 , getPositionY())  &&  getHeader() == "+y") {
            x_position = getPositionX() + 1;
            header = "+y";
            setCurrentHeadDirection(header);
            setDirection(x_position, y_position); 
            return false;

        } else if(directionChecking(getPositionX() -1  , getPositionY())  &&  getHeader() == "-y") {
            x_position = getPositionX() - 1;
            header = "-y";
            setCurrentHeadDirection(header);
            setDirection(x_position, y_position); 
            return false;

        } else if(directionChecking(getPositionX(), getPositionY()-1)  &&  getHeader() == "-x") {
            y_position = getPositionY() - 1;
            header = "-x";
            setCurrentHeadDirection(header);
            setDirection(x_position, y_position); 
            return false;

        } else if(directionChecking(getPositionX(), getPositionY()+1)  &&  getHeader() == "+x") {
            y_position = getPositionY() + 1;
            header = "+x";
            setCurrentHeadDirection(header);
            setDirection(x_position, y_position); 
            return false;
        }
        return false;
    }

    // getPositionX : get current position X
    // getPositionY : get current position Y
    // setCurrentHeadDirection: the mouse which direction
    // directionChecking: check next position block or not 
    // if 1 is true , the mouse went position, not go
    // else is 0 , the mouse can go
    // setDirection : set Current Position
    // if 1 is true , the mouse went position
    // else is 0

    protected boolean moveLeftDirection() {
        if(directionChecking(getPositionX() -1  , getPositionY())  &&  getHeader() == "+x") {
            x_position = getPositionX() - 1;
            setDirection(x_position, y_position);     
            header = "-y";
            setCurrentHeadDirection(header);
            return false;

         } else if(directionChecking(getPositionX()  , getPositionY() +1)  &&  getHeader() == "+y") {
            y_position = getPositionY() + 1;
            setDirection(x_position, y_position); 
            header = "+x";
            setCurrentHeadDirection(header);
            return false;

         }  else if(directionChecking(getPositionX() +1  , getPositionY())  &&  getHeader() == "-x") {
            x_position = getPositionX() + 1;
            setDirection(x_position, y_position); 
            header = "+y";
            setCurrentHeadDirection(header);
            return false;

         } else if(directionChecking(getPositionX(), getPositionY() -1)  &&  getHeader() == "-y") {
            y_position = getPositionY() - 1;
            setDirection(x_position, y_position);    
            header = "-x";
            setCurrentHeadDirection(header);
            return false;
         } 
         return false;
    }

    // getPositionX : get current position X
    // getPositionY : get current position Y
    // setCurrentHeadDirection: the mouse which direction
    // directionChecking: check next position block or not 
    // if 1 is true , the mouse went position, not go
    // else is 0 , the mouse can go
    // setDirection : set Current Position
    // if 1 is true , the mouse went position
    // else is 0

    protected boolean moveRightDirection() {
        if(directionChecking(getPositionX() +1, getPositionY())  &&  getHeader() == "+x") {
            x_position = getPositionX() + 1;
            setDirection(x_position, y_position);
            header = "+y";
            setCurrentHeadDirection(header);
            return false;

        } else if(directionChecking(getPositionX(), getPositionY() -1)  &&  getHeader() == "+y") {
            y_position = getPositionY() - 1;
            setDirection(x_position, y_position); 
            header = "-x";
            setCurrentHeadDirection(header);
            return false;
        
        } else if(directionChecking(getPositionX() -1, getPositionY())  &&  getHeader() == "-x") {
            x_position = getPositionX() - 1;
            setDirection(x_position, y_position); 
            header = "-y";
            setCurrentHeadDirection(header);
            return false;
        
        } else if(directionChecking(getPositionX(), getPositionY() +1)  &&  getHeader() == "-y") {
            y_position = getPositionY() + 1;
            setDirection(x_position, y_position); 
            header = "+x";
            setCurrentHeadDirection(header);
            return false;
        
        }
        return false;
    }

    public void setCurrentHeadDirection(String mouseHeader) {
        this.mouseHeader = mouseHeader;
    }

    public String getHeader(){
        return mouseHeader;
    }

    public int getPositionX(){
        return x_position;
    }

    public int getPositionY(){
        return y_position;
    }

    public int getMazeSize(){
        return dimensionSize;
    }

}
