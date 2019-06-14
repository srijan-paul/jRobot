import java.util.Stack;
public class JRobot extends Robot
{
    /**
     * Create a new JRobot
     *
     *  show True to include a visual simulation of this JRobot
     */
    public JRobot(boolean show)
    {
        super(show);
        
    }

    /**
     * Create a new JRobot
     *  show True to include a visual simulation of this JRobot
     *  delay The delay in milliseconds the JRobot will take between each cleaning movement
     */
    public JRobot(boolean show, int delay)
    {
        super(show, delay);
    }

    /**
     * Start cleaning/moving
     */
    public void start()
    {
    	Stack<Direction> stack = new Stack<Direction>();
    	while(true) {
    		if(this.canMove(Direction.FORWARD) && !this.haveBeen(Direction.FORWARD)) {
 			   this.move(Direction.FORWARD);
 			   stack.add(Direction.FORWARD);
 			    			   
 		   }else if(this.canMove(Direction.LEFT) && !this.haveBeen(Direction.LEFT)) {
 			   this.move(Direction.LEFT);
 			   stack.add(Direction.LEFT);
 		   }else if(this.canMove(Direction.RIGHT) && !this.haveBeen(Direction.RIGHT)) {
 			   this.move(Direction.RIGHT);
 			  stack.add(Direction.RIGHT);
 		   }else if(this.canMove(Direction.BACKWARD) && !this.haveBeen(Direction.BACKWARD)) {
 			   this.move(Direction.BACKWARD);
 			  stack.add(Direction.BACKWARD);
 		   }else if(!stack.isEmpty()){
 			   	Direction last = stack.pop();
 			   if(last == Direction.FORWARD) {
 				  this.move(Direction.BACKWARD);
 				}else if(last == Direction.BACKWARD) {
 					this.move(Direction.FORWARD);
 				}else if(last == Direction.LEFT) {
 					this.move(Direction.RIGHT);
 				}else {
 					this.move(Direction.LEFT);
 				}
 		   }
    	}//close while
    		
    }
}