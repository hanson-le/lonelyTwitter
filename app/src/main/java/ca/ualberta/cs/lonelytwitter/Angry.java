package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hanson on 2016-01-12.
 */
public class Angry extends Mood {
    public Angry() {
        super();
    }

    public Angry(Date date) {
        super(date);
    }

    public String getMood() {
        return "Angry";
    }
}
