package OOP.Logger;

import java.util.logging.Logger;

public class ConfigLogTest {
    private static Logger log = Logger.getLogger(ConfigLogTest.class.getName());

    public static void main(String[] args) {
        log.info("new logo1");
        log.warning("Return warning message");

    }

}
   /* public static void main(String[] args) throws IOException {
        logger.log(Level.ALL, "FirstLogo");

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logger.addHandler(ch);

        try {
            FileHandler fh = new FileHandler("firstLogo.log");
            fh.setLevel(Level.FINE);
            logger.addHandler(fh);

        } catch (java.io.IOException e) {
            //Handle exception
            logger.log(Level.SEVERE, "File logger not working", e);

        }
        FileHandler fh = new FileHandler("myLogger.Log");
        fh.setFormatter(new SimpleFormatter());
        logger.info("My New Logo"); */






