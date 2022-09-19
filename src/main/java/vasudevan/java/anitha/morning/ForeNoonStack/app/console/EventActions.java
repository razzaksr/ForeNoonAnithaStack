package vasudevan.java.anitha.morning.ForeNoonStack.app.console;

import java.util.Date;

public interface EventActions {
    //create
    public void addEvent(Event event);
    //list
    public void listEvents();
    //read
    public Event getEvent(int id);
    //delete
    public String remove(int id);
    //update
    public void update(int id,String person);
    public void update(Event event);
    public void update(Date date);
    // search
    public void search(Date date);
    public void search(String eveName);
    public void search(Date date,String parts);
}
