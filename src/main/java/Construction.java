import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Construction {
    private float area;
    private boolean exit;

    Construction() {
        area = 0;
        exit = false;
    }
  private static Logger logger = LogManager.getLogger(Construction.class);

    public void calculate() throws IOException {

        Scanner sc = new Scanner(System.in);
        ConstructionCost cost = new ConstructionCost();
        while (exit == false) {
            logger.info("\nEnter area of house: (in sqr feet)");
            area = sc.nextFloat();
          logger.info("**** Material Standards ****\n");
          logger.info("1. Standard Material Rs.1200/sq feet\n");
          logger.info("2. Above Standard Material Rs.1500/sq feet\n");
          logger.info("3. High Standard Material Rs.1800/sq feet\n");
          logger.info("4. High Standard Material and Fully Automated Rs.2500/sq feet\n");
          logger.info("5. Exit\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                  logger.info(("The total cost of standard material for house of area " + area + " sq feet is Rs." + cost.standardHouseCost(area)));
                    break;
                case 2:
                    logger.info(("The total cost of above standard material for house of area " + area + " sq feet is Rs." + cost.aboveStandardHouseCost(area)));
                    break;
                case 3:
                  logger.info(("The total cost of high standard material for house of area " + area + " sq feet is Rs." + cost.highStandardHouseCost(area, false)));
                    break;
                case 4:
                    logger.info(("The total cost of high standard material and fully automated house of area " + area + " sq feet is Rs." + cost.highStandardHouseCost(area, true)));
                    break;
                case 5:
                    logger.info("Program Terminating..");
                    exit = true;
                    System.exit(0);
                    break;
                default:
                    logger.error("Wrong choice!!");
            }
        }

    }
}
