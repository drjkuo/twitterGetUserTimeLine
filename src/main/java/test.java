import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by CYKUO on 07/01/2018.
 */

public class test {
    public static void main(String[] args) throws TwitterException, IOException {
        // The factory instance is re-useable and thread safe.
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                    status.getText());
        }
    }

}
