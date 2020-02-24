import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Task4 {

  private static final Logger logger = LogManager.getLogger(Task4.class);

  public static void main(String args[]) throws IOException {
        Scanner s =new Scanner(System.in);
        logger.info("Enter 1 for calculating SI or CI");
        logger.info("Enter 2 to calculate the cost of construction");
        logger.info("Enter 3 to exit");
        int choose=s.nextInt();
        switch (choose){
            case 1:
                InterestCal i=new InterestCal();
                i.calculate();
                break;
            case 2:
                Construction c=new Construction();
                c.calculate();
                break;
            case 3:
                System.exit(0);
            default:
              logger.error("invalid choice");
        }
    }
}
