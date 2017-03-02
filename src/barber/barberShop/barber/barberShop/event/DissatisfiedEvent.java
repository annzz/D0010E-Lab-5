package barber.barberShop.barber.barberShop.event;

import barber.barber.customerFactory.Customer;
import barber.barberShop.BarberState;
import barber.barberShop.EventType;
import barber.simulator.Event;
import barber.simulator.EventQueue;
import barber.simulator.SimulatorState;

/**
 * Created by Mumrik on 2017-02-27.
 */
public class DissatisfiedEvent extends Event {
	
	private EventType type = EventType.DISSATISFIED;
	private Customer customer;
	private BarberState barberState;
	
	/**
	 * Constructor
	 * 
	 * @param customer The customer that is dissatisfied
	 * @param time The time this customer will return at
	 */
	DissatisfiedEvent(Customer customer, double time) {
		this.customer = customer;
		setTime(time);
	}
	
	/**
	 * 
	 */
	public void runEvent(SimulatorState state, EventQueue eventQueue) {
		
		barberState = (BarberState) state;
		barberState.setCurrentTime(getTime());
		
		
	}
}

