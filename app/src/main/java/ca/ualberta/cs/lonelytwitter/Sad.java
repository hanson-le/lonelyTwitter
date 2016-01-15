package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hanson on 2016-01-12.
 */
public class Sad extends Mood {
    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    public String getMood() {
        return "Sad";
    }
}
