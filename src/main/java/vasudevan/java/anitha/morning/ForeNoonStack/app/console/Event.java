package vasudevan.java.anitha.morning.ForeNoonStack.app.console;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private int eventId;
    private String eventName;
    private Date eventDate;
    private String eventParticipants;
    private String eventWinner;
}
