package fr.unice.polytech.si4.stopwatch.v1.td01;

import fr.unice.polytech.si4.stopwatch.v1.IStatemachine;
import fr.unice.polytech.si4.stopwatch.v1.ITimerCallback;

import org.yakindu.sct.generator.polytech.java.types.Event;



public interface ITd01Statemachine extends ITimerCallback,IStatemachine {

	public interface SCInterface {
	
	
		public Event start = new Event();
		public Event init = new Event();
		public Event pause = new Event();
		public Event stop = new Event();
		public Event time = new Event();
		public Event date = new Event();
		public Event recordInit = new Event();
		public Event initLabel = new Event();
		public Event record = new Event();
	
		public void raiseLeftB();
		
		public void raiseRightB();
		
		public void raiseMidB();
		
		public void raiseRecordB();
		
		
		
		
		
		
		
		
		
		
	}
	
	public SCInterface getSCInterface();
	
	
	
}
