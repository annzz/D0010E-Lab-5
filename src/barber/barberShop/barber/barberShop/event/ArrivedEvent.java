package barber.barberShop.barber.barberShop.event;

import barber.simulator.Event;
import barber.simulator.EventQueue;
import barber.simulator.SimulatorState;

import barber.barberShop.EventType;

/**
 * Created by Mumrik on 2017-02-27.
 */
<<<<<<< HEAD
public class ArrivedEvent extends Event{
	
	public ArrivedEvent() {
		
	}
	
	public void runEvent(SimulatorState state, EventQueue eventQueue) {
		// call method in state to create new customer, add to fifo queue
	}
	
=======
public class ArrivedEvent extends Event {
    private EventType type = EventType.ARRIVED;
    Customer customer;

    public ArrivedEvent() {
        // creates a new customer
    }

    public void runEvent(SimulatorState state, EventQueue eventQueue) {

    }
>>>>>>> origin/master
}



