/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Utility.Event;

/**
 *
 * @author ankit
 */
public class EventMgmtWorkRequest  extends WorkRequest{
    
    private Event events;

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return events.getEventName();
    }
    
    
    
}
