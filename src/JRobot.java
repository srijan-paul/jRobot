public class JRobot extends Robot
{
    /**
     * Create a new JRobot
     *
     * @param show True to include a visual simulation of this JRobot
     */
    public JRobot(boolean show)
    {
        super(show);
    }

    /**
     * Create a new JRobot
     * @param show True to include a visual simulation of this JRobot
     * @param delay The delay in miliseconds the JRobot will take between each cleaning movement
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

    }
}