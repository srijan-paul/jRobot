import java.io.IOException;

public class Driver {
    public static void main(String[] args)
    {
        try {

            JRobot r = new JRobot(true);
            r.powerOn("room.txt");
            r.start();
            r.stop();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
