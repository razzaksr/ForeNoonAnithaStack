package vasudevan.java.anitha.morning.ForeNoonStack.app.console;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Manage implements EventActions{
    private Event[] storage=new Event[10];
    private Scanner scan=new Scanner(System.in);

    public Manage(){
        storage=new Event[]{
                new Event(20101,"Hackathon",new Date("5/20/2022"),null,null),
                new Event(19802,"CodeVita",new Date("2/10/2022"),null,null),
                new Event(22095,"Debugging",new Date("7/4/2022"),null,null),
                new Event(17894,"Presentation",new Date("3/30/2022"),null,null)
        };
    }

    public static void main(String[] args) {
//        Event e1=new Event(20101,"Hackathon",new Date("5/20/2022"),null,null);
//        Event e2=new Event(19802,"CodeVita",new Date("2/10/2022"),null,null);
//        Event e3=new Event(22095,"Debugging",new Date("7/4/2022"),null,null);
//        Event e4=new Event(17894,"Presentation",new Date("3/30/2022"),null,null);
        Event e5=new Event(22012,"Ideathon",new Date("11/11/2022"),null,null);
        Manage manage=new Manage();
        //manage.addEvent(e5);
        //System.out.println(manage.remove(20101));
        //System.out.println(manage.remove(22095));
        //manage.listEvents();
        //System.out.println(manage.getEvent(11111));

        //manage.update(20100,"Razak Mohamed");

//        System.out.println(manage.remove(20101));
//        System.out.println(manage.remove(22095));
//        manage.update(e5);

//        manage.addEvent(e1);manage.addEvent(e2);manage.addEvent(e3);
//        manage.addEvent(e4);

//        manage.listEvents();
//
//        Event tmp=manage.getEvent(22090);
//        System.out.println("found "+tmp);

        //System.out.println(manage.remove(17894));

//        manage.update(20101,"Razak Mohamed");
//        manage.update(20101,"Annamalai");
//        manage.update(22095,"Rasheedha");
//        manage.update(22095,"Rajiya");
//        manage.update(22095,"Meena");


//        // due to array dependency(i.e changes happen anywhere will be updated)
//        // so no need to call update(event) explicitly to assign the changes
//        Event tmp=manage.getEvent(19802);
//        tmp.setEventDate(new Date("2/28/2022"));
//        tmp.setEventId(19001);
//        //manage.update(tmp);

//        manage.update(new Date("7/4/2022"));
//        manage.update(new Date("3/30/2022"));
//
//        manage.listEvents();
    }

    @Override
    public void addEvent(Event event) {
        try{
            for(int index=0;index<storage.length;index++){
                if(storage[index]==null){
                    storage[index]=event;
                    System.out.println(event.getEventName()+" has opened to registration");
                    return;
                }
            }
            System.out.println(event.getEventName()+"doesn't have space to insert");
            throw new EventException();
        }
        catch (EventException e){
            System.out.println(e+"\nPlease remove any existing to add new one");
            int id= scan.nextInt();
            System.out.println(remove(id));
            addEvent(event);
        }
    }

    @Override
    public void listEvents() {
        //System.out.println(Arrays.toString(storage));
//        for(Event e:storage){
//            if(e!=null)
//                System.out.println(e);
//        }
        for(Event e:storage){
            try{
                System.out.println(e.toString());
            }
            catch (NullPointerException nu){
                continue;
            }
        }
    }

    @Override
    public Event getEvent(int id) {
        try{
            for(int index=0;index<storage.length;index++){
                if(storage[index]!=null){
                    if(storage[index].getEventId()==id){
                        return storage[index];
                    }
                }
            }
            throw new EventException();
        }
        catch (EventException e){
            System.out.println(e);
            System.out.println("Enter valid id");
            id= scan.nextInt();
            return getEvent(id);
        }

    }

    @Override
    public String remove(int id) {
        String tmp="";
        try{
            for(int index=0;index<storage.length;index++){
                if(storage[index]!=null){
                    if(storage[index].getEventId()==id){
                        tmp=storage[index].getEventName()+" has been removed";
                        storage[index]=null;
                        return tmp;
                    }
                }
            }
            System.out.println("Id "+id+" doesn't match with any event");
            throw new EventException();
        }
        catch (EventException e){
            System.out.println(e+" try new id ");
            id= scan.nextInt();
            return remove(id);
        }
    }

    @Override
    public void update(int id,String person) {
        //System.out.println(person+" gonna added to the event");
        try{
            for(int index=0;index<storage.length;index++){
                if(storage[index]!=null){
                    if(storage[index].getEventId()==id){
                        if(storage[index].getEventParticipants()==null){
                            storage[index].setEventParticipants(person+",");
                        }
                        else{
                            String news=storage[index].getEventParticipants()+person+",";
                            storage[index].setEventParticipants(news);
                        }
                        System.out.println(person+" has added to "+storage[index].getEventName());
                        return;
                    }
                }
            }
            System.out.println("No event matches the id "+id);
            throw new EventException();
        }
        catch (EventException e){
            System.out.println(e+" try new id ");
            id= scan.nextInt();
            update(id,person);
        }
    }

    @Override
    public void update(Event event) {
        try{
            int id=event.getEventId();
            System.out.println("Received id is "+id);
            for(int index=0;index<storage.length;index++){
                try {
                    if (storage[index].getEventId() == id) {
                        System.out.println(storage[index].getEventId() + " " + id);
                        storage[index] = event;
                        System.out.println(event.getEventName() + " has updated");
                        return;
                    }
                }
                catch (NullPointerException n){
                    System.out.println(n);
                    continue;
                }
            }
            System.out.println("Invalid event "+event.getEventName());
            throw new EventException();
        }
        catch (EventException e){
            System.out.println(e+" try new id ");
            event.setEventId(scan.nextInt());
            update(event);
        }
    }

    @Override
    public void update(Date date) {
        for(int index=0;index<storage.length;index++){
            if(storage[index]!=null){
                if(storage[index].getEventDate().getDate()==date.getDate()&&
                        storage[index].getEventDate().getMonth()==date.getMonth()&&
                        storage[index].getEventDate().getYear()==date.getYear()&&
                storage[index].getEventParticipants()!=null){
                    //System.out.println(storage[index].getEventParticipants());
                    String[] tmp=storage[index].getEventParticipants().split(",");
                    System.out.println(Arrays.toString(tmp));
                    System.out.println("Select participant position to declare as winner ");
                    int pos= scan.nextInt();
                    pos=pos-1;
                    storage[index].setEventWinner(tmp[pos]);
                    System.out.println(storage[index].getEventWinner()+" declared ");
                    return;
                }
            }
        }
        System.out.println("No event happened @ "+date+" or invalid participants");
    }

    @Override
    public void search(Date date) {

    }

    @Override
    public void search(String eveName) {

    }

    @Override
    public void search(Date date, String parts) {

    }
}
