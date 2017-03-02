package barber.barberShop.barber.barberShop.event;

import barber.barberShop.BarberState;
import barber.simulator.Event;
import barber.simulator.EventQueue;
import barber.simulator.SimulatorState;

/*
 * 
 * Inte s�ker om den h�r beh�vs men l�gger till den, s� f�r vi diskutera senare
 * 
 */
public class CloseStoreEvent extends Event {
	
	private BarberState barberState;
	
	/**
	 * Constructor
	 * 
	 * @param time The time when the store should close
	 */
	CloseStoreEvent(double time) {
		setTime(time);
	}
	
	/**
	 * Closes the store
	 * @param state Which state the store should close in
	 */
	private void closeStore(BarberState state) {
		//state.closeStore();
	}
	
	public void runEvent(SimulatorState state, EventQueue eventQueue) {
		
		barberState = (BarberState) state;
		barberState.setCurrentTime(getTime());
		
		closeStore( (BarberState) state);
	}

}
