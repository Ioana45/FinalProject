import java.util.concurrent.TimeUnit;

public class Utills {
    final static String CHROME_DRIVER_LOCATION = "chromedriver";
    final static String BASE_URL = "https://www.aboutyou.ro/";

    public static void WaitForElement(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
