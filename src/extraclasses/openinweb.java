package extraclasses;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Meow-Meow!
 */
public class openinweb {
    public static void lauchvivexsite(){
                try {
            Desktop.getDesktop().browse(URI.create("http://vivex.ml"));
        } catch (Exception e) {
        }
    }
    public static void lauchsnowfalkestudiotwitter(){
                try {
            Desktop.getDesktop().browse(URI.create("https://twitter.com/StudioSnowflake"));
        } catch (Exception e) {
        }
    }
}
