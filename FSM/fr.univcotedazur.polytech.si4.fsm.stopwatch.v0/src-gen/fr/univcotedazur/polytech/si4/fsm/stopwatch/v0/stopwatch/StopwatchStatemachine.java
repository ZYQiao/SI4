/** Generated by YAKINDU Statechart Tools code generator. */
package fr.univcotedazur.polytech.si4.fsm.stopwatch.v0.stopwatch;

import fr.univcotedazur.polytech.si4.fsm.stopwatch.v0.ITimer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class StopwatchStatemachine implements IStopwatchStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private List<SCInterfaceListener> listeners = new LinkedList<SCInterfaceListener>();
		
		public List<SCInterfaceListener> getListeners() {
			return listeners;
		}
		private boolean rBt;
		
		
		public void raiseRBt() {
			synchronized(StopwatchStatemachine.this) {
				inEventQueue.add(
					new Runnable() {
						@Override
						public void run() {
							rBt = true;
							singleCycle();
						}
					}
				);
				runCycle();
			}
		}
		
		private boolean lBt;
		
		
		public void raiseLBt() {
			synchronized(StopwatchStatemachine.this) {
				inEventQueue.add(
					new Runnable() {
						@Override
						public void run() {
							lBt = true;
							singleCycle();
						}
					}
				);
				runCycle();
			}
		}
		
		private boolean mBt;
		
		
		public void raiseMBt() {
			synchronized(StopwatchStatemachine.this) {
				inEventQueue.add(
					new Runnable() {
						@Override
						public void run() {
							mBt = true;
							singleCycle();
						}
					}
				);
				runCycle();
			}
		}
		
		private boolean m2Bt;
		
		
		public void raiseM2Bt() {
			synchronized(StopwatchStatemachine.this) {
				inEventQueue.add(
					new Runnable() {
						@Override
						public void run() {
							m2Bt = true;
							singleCycle();
						}
					}
				);
				runCycle();
			}
		}
		
		private boolean doInitial;
		
		
		public boolean isRaisedDoInitial() {
			synchronized(StopwatchStatemachine.this) {
				return doInitial;
			}
		}
		
		protected void raiseDoInitial() {
			synchronized(StopwatchStatemachine.this) {
				doInitial = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoInitialRaised();
				}
			}
		}
		
		private boolean doStart;
		
		
		public boolean isRaisedDoStart() {
			synchronized(StopwatchStatemachine.this) {
				return doStart;
			}
		}
		
		protected void raiseDoStart() {
			synchronized(StopwatchStatemachine.this) {
				doStart = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoStartRaised();
				}
			}
		}
		
		private boolean doPause;
		
		
		public boolean isRaisedDoPause() {
			synchronized(StopwatchStatemachine.this) {
				return doPause;
			}
		}
		
		protected void raiseDoPause() {
			synchronized(StopwatchStatemachine.this) {
				doPause = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoPauseRaised();
				}
			}
		}
		
		private boolean doResume;
		
		
		public boolean isRaisedDoResume() {
			synchronized(StopwatchStatemachine.this) {
				return doResume;
			}
		}
		
		protected void raiseDoResume() {
			synchronized(StopwatchStatemachine.this) {
				doResume = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoResumeRaised();
				}
			}
		}
		
		private boolean doStop;
		
		
		public boolean isRaisedDoStop() {
			synchronized(StopwatchStatemachine.this) {
				return doStop;
			}
		}
		
		protected void raiseDoStop() {
			synchronized(StopwatchStatemachine.this) {
				doStop = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoStopRaised();
				}
			}
		}
		
		private boolean doHour;
		
		
		public boolean isRaisedDoHour() {
			synchronized(StopwatchStatemachine.this) {
				return doHour;
			}
		}
		
		protected void raiseDoHour() {
			synchronized(StopwatchStatemachine.this) {
				doHour = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoHourRaised();
				}
			}
		}
		
		private boolean doDate;
		
		
		public boolean isRaisedDoDate() {
			synchronized(StopwatchStatemachine.this) {
				return doDate;
			}
		}
		
		protected void raiseDoDate() {
			synchronized(StopwatchStatemachine.this) {
				doDate = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoDateRaised();
				}
			}
		}
		
		private boolean doClearTitle;
		
		
		public boolean isRaisedDoClearTitle() {
			synchronized(StopwatchStatemachine.this) {
				return doClearTitle;
			}
		}
		
		protected void raiseDoClearTitle() {
			synchronized(StopwatchStatemachine.this) {
				doClearTitle = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoClearTitleRaised();
				}
			}
		}
		
		private boolean doRecord;
		
		
		public boolean isRaisedDoRecord() {
			synchronized(StopwatchStatemachine.this) {
				return doRecord;
			}
		}
		
		protected void raiseDoRecord() {
			synchronized(StopwatchStatemachine.this) {
				doRecord = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoRecordRaised();
				}
			}
		}
		
		private boolean doChangeButtonName;
		
		
		public boolean isRaisedDoChangeButtonName() {
			synchronized(StopwatchStatemachine.this) {
				return doChangeButtonName;
			}
		}
		
		protected void raiseDoChangeButtonName() {
			synchronized(StopwatchStatemachine.this) {
				doChangeButtonName = true;
				for (SCInterfaceListener listener : listeners) {
					listener.onDoChangeButtonNameRaised();
				}
			}
		}
		
		protected void clearEvents() {
			rBt = false;
			lBt = false;
			mBt = false;
			m2Bt = false;
		}
		protected void clearOutEvents() {
		
		doInitial = false;
		doStart = false;
		doPause = false;
		doResume = false;
		doStop = false;
		doHour = false;
		doDate = false;
		doClearTitle = false;
		doRecord = false;
		doChangeButtonName = false;
		}
		
	}
	
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_stopwatch,
		main_region_stopwatch_main_watch,
		main_region_stopwatch_main_watch_stopwatch_StatePause,
		main_region_stopwatch_main_watch_stopwatch_StateStart,
		main_region_stopwatch_main_watch_stopwatch_StateResume,
		main_region_stopwatch_main_watch_stopwatch_StateStop,
		main_region_stopwatch_main_watch_stopwatch_StateInitial,
		main_region_stopwatch_main_showDate,
		main_region_stopwatch_main_showDate_r1_showTime,
		main_region_stopwatch_main_showDate_r1_showDate,
		main_region_stopwatch_record_StateRecord,
		main_region_stopwatch_record_StateIntial,
		$NullState$
	};
	
	private State[] historyVector = new State[1];
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private ITimer timer;
	
	private final boolean[] timeEvents = new boolean[3];
	
	private BlockingQueue<Runnable> inEventQueue = new LinkedBlockingQueue<Runnable>();
	private boolean isRunningCycle = false;
	public StopwatchStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public synchronized void init() {
		this.initialized = true;
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NullState$;
		}
		for (int i = 0; i < 1; i++) {
			historyVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
	}
	
	public synchronized void enter() {
		if (!initialized) {
			throw new IllegalStateException(
				"The state machine needs to be initialized first by calling the init() function."
			);
		}
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		enterSequence_main_region_default();
	}
	
	public synchronized void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		
		if (isRunningCycle) {
			return;
		}
		isRunningCycle = true;
		
		clearOutEvents();
	
		Runnable task = getNextEvent();
		if (task == null) {
			task = getDefaultEvent();
		}
		
		while (task != null) {
			task.run();
			clearEvents();
			task = getNextEvent();
		}
		
		isRunningCycle = false;
	}
	
	protected synchronized void singleCycle() {
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case main_region_stopwatch_main_watch_stopwatch_StatePause:
				main_region_stopwatch_main_watch_stopwatch_StatePause_react(true);
				break;
			case main_region_stopwatch_main_watch_stopwatch_StateStart:
				main_region_stopwatch_main_watch_stopwatch_StateStart_react(true);
				break;
			case main_region_stopwatch_main_watch_stopwatch_StateResume:
				main_region_stopwatch_main_watch_stopwatch_StateResume_react(true);
				break;
			case main_region_stopwatch_main_watch_stopwatch_StateStop:
				main_region_stopwatch_main_watch_stopwatch_StateStop_react(true);
				break;
			case main_region_stopwatch_main_watch_stopwatch_StateInitial:
				main_region_stopwatch_main_watch_stopwatch_StateInitial_react(true);
				break;
			case main_region_stopwatch_main_showDate_r1_showTime:
				main_region_stopwatch_main_showDate_r1_showTime_react(true);
				break;
			case main_region_stopwatch_main_showDate_r1_showDate:
				main_region_stopwatch_main_showDate_r1_showDate_react(true);
				break;
			case main_region_stopwatch_record_StateRecord:
				main_region_stopwatch_record_StateRecord_react(true);
				break;
			case main_region_stopwatch_record_StateIntial:
				main_region_stopwatch_record_StateIntial_react(true);
				break;
			default:
				// $NullState$
			}
		}
	}
	
	protected Runnable getNextEvent() {
		if(!inEventQueue.isEmpty()) {
			return inEventQueue.poll();
		}
		return null;
	}
	
	protected Runnable getDefaultEvent() {
		return new Runnable() {
			@Override
			public void run() {
				singleCycle();
			}
		};
	}
	
	public synchronized void exit() {
		exitSequence_main_region();
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public synchronized boolean isActive() {
		return stateVector[0] != State.$NullState$||stateVector[1] != State.$NullState$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public synchronized boolean isFinal() {
		return false;
	}
	/**
	* This method resets the incoming events (time events included).
	*/
	protected void clearEvents() {
		sCInterface.clearEvents();
		for (int i=0; i<timeEvents.length; i++) {
			timeEvents[i] = false;
		}
	}
	
	/**
	* This method resets the outgoing events.
	*/
	protected void clearOutEvents() {
		sCInterface.clearOutEvents();
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public synchronized boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_stopwatch:
			return stateVector[0].ordinal() >= State.
					main_region_stopwatch.ordinal()&& stateVector[0].ordinal() <= State.main_region_stopwatch_record_StateIntial.ordinal();
		case main_region_stopwatch_main_watch:
			return stateVector[0].ordinal() >= State.
					main_region_stopwatch_main_watch.ordinal()&& stateVector[0].ordinal() <= State.main_region_stopwatch_main_watch_stopwatch_StateInitial.ordinal();
		case main_region_stopwatch_main_watch_stopwatch_StatePause:
			return stateVector[0] == State.main_region_stopwatch_main_watch_stopwatch_StatePause;
		case main_region_stopwatch_main_watch_stopwatch_StateStart:
			return stateVector[0] == State.main_region_stopwatch_main_watch_stopwatch_StateStart;
		case main_region_stopwatch_main_watch_stopwatch_StateResume:
			return stateVector[0] == State.main_region_stopwatch_main_watch_stopwatch_StateResume;
		case main_region_stopwatch_main_watch_stopwatch_StateStop:
			return stateVector[0] == State.main_region_stopwatch_main_watch_stopwatch_StateStop;
		case main_region_stopwatch_main_watch_stopwatch_StateInitial:
			return stateVector[0] == State.main_region_stopwatch_main_watch_stopwatch_StateInitial;
		case main_region_stopwatch_main_showDate:
			return stateVector[0].ordinal() >= State.
					main_region_stopwatch_main_showDate.ordinal()&& stateVector[0].ordinal() <= State.main_region_stopwatch_main_showDate_r1_showDate.ordinal();
		case main_region_stopwatch_main_showDate_r1_showTime:
			return stateVector[0] == State.main_region_stopwatch_main_showDate_r1_showTime;
		case main_region_stopwatch_main_showDate_r1_showDate:
			return stateVector[0] == State.main_region_stopwatch_main_showDate_r1_showDate;
		case main_region_stopwatch_record_StateRecord:
			return stateVector[1] == State.main_region_stopwatch_record_StateRecord;
		case main_region_stopwatch_record_StateIntial:
			return stateVector[1] == State.main_region_stopwatch_record_StateIntial;
		default:
			return false;
		}
	}
	
	/**
	* Set the {@link ITimer} for the state machine. It must be set
	* externally on a timed state machine before a run cycle can be correctly
	* executed.
	* 
	* @param timer
	*/
	public synchronized void setTimer(ITimer timer) {
		this.timer = timer;
	}
	
	/**
	* Returns the currently used timer.
	* 
	* @return {@link ITimer}
	*/
	public ITimer getTimer() {
		return timer;
	}
	
	public synchronized void timeElapsed(int eventID) {
		inEventQueue.add(new Runnable() {
			@Override
			public void run() {
				timeEvents[eventID] = true;
				singleCycle();
			}
		});
		runCycle();
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public synchronized void raiseRBt() {
		sCInterface.raiseRBt();
	}
	
	public synchronized void raiseLBt() {
		sCInterface.raiseLBt();
	}
	
	public synchronized void raiseMBt() {
		sCInterface.raiseMBt();
	}
	
	public synchronized void raiseM2Bt() {
		sCInterface.raiseM2Bt();
	}
	
	public synchronized boolean isRaisedDoInitial() {
		return sCInterface.isRaisedDoInitial();
	}
	
	public synchronized boolean isRaisedDoStart() {
		return sCInterface.isRaisedDoStart();
	}
	
	public synchronized boolean isRaisedDoPause() {
		return sCInterface.isRaisedDoPause();
	}
	
	public synchronized boolean isRaisedDoResume() {
		return sCInterface.isRaisedDoResume();
	}
	
	public synchronized boolean isRaisedDoStop() {
		return sCInterface.isRaisedDoStop();
	}
	
	public synchronized boolean isRaisedDoHour() {
		return sCInterface.isRaisedDoHour();
	}
	
	public synchronized boolean isRaisedDoDate() {
		return sCInterface.isRaisedDoDate();
	}
	
	public synchronized boolean isRaisedDoClearTitle() {
		return sCInterface.isRaisedDoClearTitle();
	}
	
	public synchronized boolean isRaisedDoRecord() {
		return sCInterface.isRaisedDoRecord();
	}
	
	public synchronized boolean isRaisedDoChangeButtonName() {
		return sCInterface.isRaisedDoChangeButtonName();
	}
	
	/* Entry action for state 'StatePause'. */
	private void entryAction_main_region_stopwatch_main_watch_stopwatch_StatePause() {
		sCInterface.raiseDoPause();
	}
	
	/* Entry action for state 'StateStart'. */
	private void entryAction_main_region_stopwatch_main_watch_stopwatch_StateStart() {
		sCInterface.raiseDoStart();
	}
	
	/* Entry action for state 'StateResume'. */
	private void entryAction_main_region_stopwatch_main_watch_stopwatch_StateResume() {
		sCInterface.raiseDoResume();
	}
	
	/* Entry action for state 'StateStop'. */
	private void entryAction_main_region_stopwatch_main_watch_stopwatch_StateStop() {
		sCInterface.raiseDoStop();
	}
	
	/* Entry action for state 'StateInitial'. */
	private void entryAction_main_region_stopwatch_main_watch_stopwatch_StateInitial() {
		sCInterface.raiseDoInitial();
		
		sCInterface.raiseDoClearTitle();
	}
	
	/* Entry action for state 'showTime'. */
	private void entryAction_main_region_stopwatch_main_showDate_r1_showTime() {
		timer.setTimer(this, 0, (1 * 1000), false);
		
		sCInterface.raiseDoHour();
	}
	
	/* Entry action for state 'showDate'. */
	private void entryAction_main_region_stopwatch_main_showDate_r1_showDate() {
		timer.setTimer(this, 1, (1 * 1000), false);
		
		sCInterface.raiseDoDate();
	}
	
	/* Entry action for state 'StateRecord'. */
	private void entryAction_main_region_stopwatch_record_StateRecord() {
		timer.setTimer(this, 2, (1 * 1000), false);
		
		sCInterface.raiseDoRecord();
	}
	
	/* Exit action for state 'showTime'. */
	private void exitAction_main_region_stopwatch_main_showDate_r1_showTime() {
		timer.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'showDate'. */
	private void exitAction_main_region_stopwatch_main_showDate_r1_showDate() {
		timer.unsetTimer(this, 1);
	}
	
	/* Exit action for state 'StateRecord'. */
	private void exitAction_main_region_stopwatch_record_StateRecord() {
		timer.unsetTimer(this, 2);
	}
	
	/* 'default' enter sequence for state stopwatch */
	private void enterSequence_main_region_stopwatch_default() {
		enterSequence_main_region_stopwatch_main_default();
		enterSequence_main_region_stopwatch_record_default();
	}
	
	/* 'default' enter sequence for state watch */
	private void enterSequence_main_region_stopwatch_main_watch_default() {
		enterSequence_main_region_stopwatch_main_watch_stopwatch_default();
	}
	
	/* 'default' enter sequence for state StatePause */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_StatePause_default() {
		entryAction_main_region_stopwatch_main_watch_stopwatch_StatePause();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_watch_stopwatch_StatePause;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state StateStart */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStart_default() {
		entryAction_main_region_stopwatch_main_watch_stopwatch_StateStart();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_watch_stopwatch_StateStart;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state StateResume */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_StateResume_default() {
		entryAction_main_region_stopwatch_main_watch_stopwatch_StateResume();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_watch_stopwatch_StateResume;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state StateStop */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStop_default() {
		entryAction_main_region_stopwatch_main_watch_stopwatch_StateStop();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_watch_stopwatch_StateStop;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state StateInitial */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial_default() {
		entryAction_main_region_stopwatch_main_watch_stopwatch_StateInitial();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_watch_stopwatch_StateInitial;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state showDate */
	private void enterSequence_main_region_stopwatch_main_showDate_default() {
		enterSequence_main_region_stopwatch_main_showDate_r1_default();
	}
	
	/* 'default' enter sequence for state showTime */
	private void enterSequence_main_region_stopwatch_main_showDate_r1_showTime_default() {
		entryAction_main_region_stopwatch_main_showDate_r1_showTime();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_showDate_r1_showTime;
	}
	
	/* 'default' enter sequence for state showDate */
	private void enterSequence_main_region_stopwatch_main_showDate_r1_showDate_default() {
		entryAction_main_region_stopwatch_main_showDate_r1_showDate();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_stopwatch_main_showDate_r1_showDate;
	}
	
	/* 'default' enter sequence for state StateRecord */
	private void enterSequence_main_region_stopwatch_record_StateRecord_default() {
		entryAction_main_region_stopwatch_record_StateRecord();
		nextStateIndex = 1;
		stateVector[1] = State.main_region_stopwatch_record_StateRecord;
	}
	
	/* 'default' enter sequence for state StateIntial */
	private void enterSequence_main_region_stopwatch_record_StateIntial_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_stopwatch_record_StateIntial;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region main */
	private void enterSequence_main_region_stopwatch_main_default() {
		react_main_region_stopwatch_main__entry_Default();
	}
	
	/* 'default' enter sequence for region stopwatch */
	private void enterSequence_main_region_stopwatch_main_watch_stopwatch_default() {
		react_main_region_stopwatch_main_watch_stopwatch__entry_Default();
	}
	
	/* shallow enterSequence with history in child stopwatch */
	private void shallowEnterSequence_main_region_stopwatch_main_watch_stopwatch() {
		switch (historyVector[0]) {
		case main_region_stopwatch_main_watch_stopwatch_StatePause:
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StatePause_default();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStart:
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStart_default();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateResume:
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StateResume_default();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStop:
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStop_default();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateInitial:
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_stopwatch_main_showDate_r1_default() {
		react_main_region_stopwatch_main_showDate_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region record */
	private void enterSequence_main_region_stopwatch_record_default() {
		react_main_region_stopwatch_record__entry_Default();
	}
	
	/* Default exit sequence for state watch */
	private void exitSequence_main_region_stopwatch_main_watch() {
		exitSequence_main_region_stopwatch_main_watch_stopwatch();
	}
	
	/* Default exit sequence for state StatePause */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch_StatePause() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state StateStart */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStart() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state StateResume */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch_StateResume() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state StateStop */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStop() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state StateInitial */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state showDate */
	private void exitSequence_main_region_stopwatch_main_showDate() {
		exitSequence_main_region_stopwatch_main_showDate_r1();
	}
	
	/* Default exit sequence for state showTime */
	private void exitSequence_main_region_stopwatch_main_showDate_r1_showTime() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
		
		exitAction_main_region_stopwatch_main_showDate_r1_showTime();
	}
	
	/* Default exit sequence for state showDate */
	private void exitSequence_main_region_stopwatch_main_showDate_r1_showDate() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
		
		exitAction_main_region_stopwatch_main_showDate_r1_showDate();
	}
	
	/* Default exit sequence for state StateRecord */
	private void exitSequence_main_region_stopwatch_record_StateRecord() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
		
		exitAction_main_region_stopwatch_record_StateRecord();
	}
	
	/* Default exit sequence for state StateIntial */
	private void exitSequence_main_region_stopwatch_record_StateIntial() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_stopwatch_main_watch_stopwatch_StatePause:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StatePause();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStart:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStart();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateResume:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateResume();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStop:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStop();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateInitial:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial();
			break;
		case main_region_stopwatch_main_showDate_r1_showTime:
			exitSequence_main_region_stopwatch_main_showDate_r1_showTime();
			break;
		case main_region_stopwatch_main_showDate_r1_showDate:
			exitSequence_main_region_stopwatch_main_showDate_r1_showDate();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case main_region_stopwatch_record_StateRecord:
			exitSequence_main_region_stopwatch_record_StateRecord();
			break;
		case main_region_stopwatch_record_StateIntial:
			exitSequence_main_region_stopwatch_record_StateIntial();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region stopwatch */
	private void exitSequence_main_region_stopwatch_main_watch_stopwatch() {
		switch (stateVector[0]) {
		case main_region_stopwatch_main_watch_stopwatch_StatePause:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StatePause();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStart:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStart();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateResume:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateResume();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateStop:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStop();
			break;
		case main_region_stopwatch_main_watch_stopwatch_StateInitial:
			exitSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_stopwatch_main_showDate_r1() {
		switch (stateVector[0]) {
		case main_region_stopwatch_main_showDate_r1_showTime:
			exitSequence_main_region_stopwatch_main_showDate_r1_showTime();
			break;
		case main_region_stopwatch_main_showDate_r1_showDate:
			exitSequence_main_region_stopwatch_main_showDate_r1_showDate();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_stopwatch_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_stopwatch_main_watch_stopwatch__entry_Default() {
		enterSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial_default();
	}
	
	/* Default react sequence for shallow history entry history */
	private void react_main_region_stopwatch_main_watch_stopwatch_history() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NullState$) {
			shallowEnterSequence_main_region_stopwatch_main_watch_stopwatch();
		} else {
			enterSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_stopwatch_main__entry_Default() {
		enterSequence_main_region_stopwatch_main_watch_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_stopwatch_main_showDate_r1__entry_Default() {
		enterSequence_main_region_stopwatch_main_showDate_r1_showTime_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_stopwatch_record__entry_Default() {
		enterSequence_main_region_stopwatch_record_StateIntial_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_stopwatch_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.m2Bt) {
				exitSequence_main_region_stopwatch_main_watch();
				enterSequence_main_region_stopwatch_main_showDate_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_stopwatch_StatePause_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.lBt) {
				exitSequence_main_region_stopwatch_main_watch_stopwatch_StatePause();
				enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStop_default();
				main_region_stopwatch_main_watch_react(false);
			} else {
				if (sCInterface.rBt) {
					exitSequence_main_region_stopwatch_main_watch_stopwatch_StatePause();
					enterSequence_main_region_stopwatch_main_watch_stopwatch_StateResume_default();
					main_region_stopwatch_main_watch_react(false);
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_watch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_stopwatch_StateStart_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.rBt) {
				exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStart();
				enterSequence_main_region_stopwatch_main_watch_stopwatch_StatePause_default();
				main_region_stopwatch_main_watch_react(false);
			} else {
				if (sCInterface.lBt) {
					exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStart();
					enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStop_default();
					main_region_stopwatch_main_watch_react(false);
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_watch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_stopwatch_StateResume_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.lBt) {
				exitSequence_main_region_stopwatch_main_watch_stopwatch_StateResume();
				enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStop_default();
				main_region_stopwatch_main_watch_react(false);
			} else {
				if (sCInterface.rBt) {
					exitSequence_main_region_stopwatch_main_watch_stopwatch_StateResume();
					enterSequence_main_region_stopwatch_main_watch_stopwatch_StatePause_default();
					main_region_stopwatch_main_watch_react(false);
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_watch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_stopwatch_StateStop_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.lBt) {
				exitSequence_main_region_stopwatch_main_watch_stopwatch_StateStop();
				enterSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial_default();
				main_region_stopwatch_main_watch_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_watch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_watch_stopwatch_StateInitial_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.lBt) {
				exitSequence_main_region_stopwatch_main_watch_stopwatch_StateInitial();
				enterSequence_main_region_stopwatch_main_watch_stopwatch_StateStart_default();
				main_region_stopwatch_main_watch_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_watch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_showDate_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_showDate_r1_showTime_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (timeEvents[0]) {
				exitSequence_main_region_stopwatch_main_showDate();
				react_main_region_stopwatch_main_watch_stopwatch_history();
			} else {
				if (sCInterface.m2Bt) {
					exitSequence_main_region_stopwatch_main_showDate_r1_showTime();
					enterSequence_main_region_stopwatch_main_showDate_r1_showDate_default();
					main_region_stopwatch_main_showDate_react(false);
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_showDate_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_main_showDate_r1_showDate_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.m2Bt) {
				exitSequence_main_region_stopwatch_main_showDate_r1_showDate();
				enterSequence_main_region_stopwatch_main_showDate_r1_showTime_default();
				main_region_stopwatch_main_showDate_react(false);
			} else {
				if (timeEvents[1]) {
					exitSequence_main_region_stopwatch_main_showDate();
					react_main_region_stopwatch_main_watch_stopwatch_history();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_main_showDate_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_record_StateRecord_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.mBt) {
				exitSequence_main_region_stopwatch_record_StateRecord();
				sCInterface.raiseDoClearTitle();
				
				enterSequence_main_region_stopwatch_record_StateIntial_default();
				main_region_stopwatch_react(false);
			} else {
				if (timeEvents[2]) {
					exitSequence_main_region_stopwatch_record_StateRecord();
					sCInterface.raiseDoChangeButtonName();
					
					enterSequence_main_region_stopwatch_record_StateIntial_default();
					main_region_stopwatch_react(false);
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_stopwatch_record_StateIntial_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.mBt) {
				exitSequence_main_region_stopwatch_record_StateIntial();
				enterSequence_main_region_stopwatch_record_StateRecord_default();
				main_region_stopwatch_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_stopwatch_react(try_transition);
		}
		return did_transition;
	}
	
}
