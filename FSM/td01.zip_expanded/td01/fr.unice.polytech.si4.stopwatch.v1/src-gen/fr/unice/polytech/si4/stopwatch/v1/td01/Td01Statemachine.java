	package fr.unice.polytech.si4.stopwatch.v1.td01;
	import fr.unice.polytech.si4.stopwatch.v1.ITimer;
	
	public class Td01Statemachine implements ITd01Statemachine {

		protected class SCInterfaceImpl implements SCInterface {
		
			
			private boolean leftB;
			public void raiseLeftB() {
				leftB = true;
				runCycle();
			}
			
			
			private boolean rightB;
			public void raiseRightB() {
				rightB = true;
				runCycle();
			}
			
			
			private boolean midB;
			public void raiseMidB() {
				midB = true;
				runCycle();
			}
			
			
			private boolean recordB;
			public void raiseRecordB() {
				recordB = true;
				runCycle();
			}
			
			
			
			protected void raiseStart() {
				start.emits();
			}
			
			
			
			protected void raiseInit() {
				init.emits();
			}
			
			
			
			protected void raisePause() {
				pause.emits();
			}
			
			
			
			protected void raiseStop() {
				stop.emits();
			}
			
			
			
			protected void raiseTime() {
				time.emits();
			}
			
			
			
			protected void raiseDate() {
				date.emits();
			}
			
			
			
			protected void raiseRecordInit() {
				recordInit.emits();
			}
			
			
			
			protected void raiseInitLabel() {
				initLabel.emits();
			}
			
			
			
			protected void raiseRecord() {
				record.emits();
			}
			
			protected void clearEvents() {
				leftB = false;
				rightB = false;
				midB = false;
				recordB = false;
			}
			public void clearOutEvents() {
			//nothings to do with the newly introduced Event Type
			}
			
		}
		
		protected SCInterfaceImpl sCInterface;
		
		private boolean initialized = false;
		
		public enum State {
			time_main,
			time_main_r1_Stop,
			time_main_r1_Pause,
			time_main_r1_Start,
			time_main_r1_Init,
			time_date_time,
			time_date_time_r2_Time,
			time_date_time_r2_Date,
			record_record,
			record_RecordInit,
			record_initLabel,
			$NullState$
		};
		
		private State[] historyVector = new State[1];
		private final State[] stateVector = new State[2];
		
		private int nextStateIndex;
		
		private ITimer timer;
		
		private final boolean[] timeEvents = new boolean[4];
		public Td01Statemachine() {
			sCInterface = new SCInterfaceImpl();
		}
		
		public void init() {
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
		
		public void enter() {
			if (!initialized) {
				throw new IllegalStateException(
						"The state machine needs to be initialized first by calling the init() function.");
			}
			if (timer == null) {
				throw new IllegalStateException("timer not set.");
			}
			enterSequence_time_default();
			enterSequence_record_default();
		}
		
		public void exit() {
			exitSequence_time();
			exitSequence_record();
		}
		
		/**
		 * @see IStatemachine#isActive()
		 */
		public boolean isActive() {
			return stateVector[0] != State.$NullState$||stateVector[1] != State.$NullState$;
		}
		
		/** 
		* Always returns 'false' since this state machine can never become final.
		*
		* @see IStatemachine#isFinal()
		*/
		public boolean isFinal() {
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
		* This method resets the outgoing events !
		*/
		public void clearOutEvents() {
		}
		
		/**
		* Returns true if the given state is currently active otherwise false.
		*/
		public boolean isStateActive(State state) {
		
			switch (state) {
			case time_main:
				return stateVector[0].ordinal() >= State.
						time_main.ordinal()&& stateVector[0].ordinal() <= State.time_main_r1_Init.ordinal();
			case time_main_r1_Stop:
				return stateVector[0] == State.time_main_r1_Stop;
			case time_main_r1_Pause:
				return stateVector[0] == State.time_main_r1_Pause;
			case time_main_r1_Start:
				return stateVector[0] == State.time_main_r1_Start;
			case time_main_r1_Init:
				return stateVector[0] == State.time_main_r1_Init;
			case time_date_time:
				return stateVector[0].ordinal() >= State.
						time_date_time.ordinal()&& stateVector[0].ordinal() <= State.time_date_time_r2_Date.ordinal();
			case time_date_time_r2_Time:
				return stateVector[0] == State.time_date_time_r2_Time;
			case time_date_time_r2_Date:
				return stateVector[0] == State.time_date_time_r2_Date;
			case record_record:
				return stateVector[1] == State.record_record;
			case record_RecordInit:
				return stateVector[1] == State.record_RecordInit;
			case record_initLabel:
				return stateVector[1] == State.record_initLabel;
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
		public void setTimer(ITimer timer) {
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
		
		public void timeElapsed(int eventID) {
			timeEvents[eventID] = true;
			runCycle();
		}
		
		public SCInterface getSCInterface() {
			return sCInterface;
		}
		
		public void raiseLeftB() {
			sCInterface.raiseLeftB();
		}
		
		public void raiseRightB() {
			sCInterface.raiseRightB();
		}
		
		public void raiseMidB() {
			sCInterface.raiseMidB();
		}
		
		public void raiseRecordB() {
			sCInterface.raiseRecordB();
		}
		
		
		
		
		
		
		
		
		
		
		private boolean check_time_main_tr0_tr0() {
			return sCInterface.midB;
		}
		
		private boolean check_time_main_r1_Stop_tr0_tr0() {
			return sCInterface.leftB;
		}
		
		private boolean check_time_main_r1_Pause_tr0_tr0() {
			return sCInterface.rightB;
		}
		
		private boolean check_time_main_r1_Pause_tr1_tr1() {
			return sCInterface.leftB;
		}
		
		private boolean check_time_main_r1_Pause_tr2_tr2() {
			return sCInterface.rightB;
		}
		
		private boolean check_time_main_r1_Start_tr0_tr0() {
			return sCInterface.leftB;
		}
		
		private boolean check_time_main_r1_Start_tr1_tr1() {
			return sCInterface.rightB;
		}
		
		private boolean check_time_main_r1_Init_tr0_tr0() {
			return sCInterface.leftB;
		}
		
		private boolean check_time_date_time_r2_Time_tr0_tr0() {
			return sCInterface.midB;
		}
		
		private boolean check_time_date_time_r2_Time_tr1_tr1() {
			boolean isPresent = timeEvents[0];
			timeEvents[0] = false;
			return isPresent;
		}
		
		private boolean check_time_date_time_r2_Date_tr0_tr0() {
			boolean isPresent = timeEvents[1];
			timeEvents[1] = false;
			return isPresent;
		}
		
		private boolean check_time_date_time_r2_Date_tr1_tr1() {
			return sCInterface.midB;
		}
		
		private boolean check_record_record_tr0_tr0() {
			return sCInterface.recordB;
		}
		
		private boolean check_record_record_tr1_tr1() {
			boolean isPresent = timeEvents[2];
			timeEvents[2] = false;
			return isPresent;
		}
		
		private boolean check_record_RecordInit_tr0_tr0() {
			return sCInterface.recordB;
		}
		
		private boolean check_record_initLabel_tr0_tr0() {
			boolean isPresent = timeEvents[3];
			timeEvents[3] = false;
			return isPresent;
		}
		
		private void effect_time_main_tr0() {
			exitSequence_time_main();
			enterSequence_time_date_time_default();
		}
		
		private void effect_time_main_r1_Stop_tr0() {
			exitSequence_time_main_r1_Stop();
			enterSequence_time_main_r1_Init_default();
		}
		
		private void effect_time_main_r1_Pause_tr0() {
			exitSequence_time_main_r1_Pause();
			enterSequence_time_main_r1_Start_default();
		}
		
		private void effect_time_main_r1_Pause_tr1() {
			exitSequence_time_main_r1_Pause();
			enterSequence_time_main_r1_Stop_default();
		}
		
		private void effect_time_main_r1_Pause_tr2() {
			exitSequence_time_main_r1_Pause();
			enterSequence_time_main_r1_Init_default();
		}
		
		private void effect_time_main_r1_Start_tr0() {
			exitSequence_time_main_r1_Start();
			enterSequence_time_main_r1_Stop_default();
		}
		
		private void effect_time_main_r1_Start_tr1() {
			exitSequence_time_main_r1_Start();
			enterSequence_time_main_r1_Pause_default();
		}
		
		private void effect_time_main_r1_Init_tr0() {
			exitSequence_time_main_r1_Init();
			enterSequence_time_main_r1_Start_default();
		}
		
		private void effect_time_date_time_r2_Time_tr0() {
			exitSequence_time_date_time_r2_Time();
			enterSequence_time_date_time_r2_Date_default();
		}
		
		private void effect_time_date_time_r2_Time_tr1() {
			exitSequence_time_date_time();
			react_time_main_r1_historystate();
		}
		
		private void effect_time_date_time_r2_Date_tr0() {
			exitSequence_time_date_time();
			react_time_main_r1_historystate();
		}
		
		private void effect_time_date_time_r2_Date_tr1() {
			exitSequence_time_date_time_r2_Date();
			enterSequence_time_date_time_r2_Time_default();
		}
		
		private void effect_record_record_tr0() {
			exitSequence_record_record();
			enterSequence_record_initLabel_default();
		}
		
		private void effect_record_record_tr1() {
			exitSequence_record_record();
			enterSequence_record_RecordInit_default();
		}
		
		private void effect_record_RecordInit_tr0() {
			exitSequence_record_RecordInit();
			enterSequence_record_record_default();
		}
		
		private void effect_record_initLabel_tr0() {
			exitSequence_record_initLabel();
			enterSequence_record_RecordInit_default();
		}
		
		/* Entry action for state 'Stop'. */
		private void entryAction_time_main_r1_Stop() {
			sCInterface.raiseStop();
		}
		
		/* Entry action for state 'Pause'. */
		private void entryAction_time_main_r1_Pause() {
			sCInterface.raisePause();
		}
		
		/* Entry action for state 'Start'. */
		private void entryAction_time_main_r1_Start() {
			sCInterface.raiseStart();
		}
		
		/* Entry action for state 'Init'. */
		private void entryAction_time_main_r1_Init() {
			sCInterface.raiseInit();
		}
		
		/* Entry action for state 'Time'. */
		private void entryAction_time_date_time_r2_Time() {
			timer.setTimer(this, 0, (1 * 1000), false);
			
			sCInterface.raiseTime();
		}
		
		/* Entry action for state 'Date'. */
		private void entryAction_time_date_time_r2_Date() {
			timer.setTimer(this, 1, (1 * 1000), false);
			
			sCInterface.raiseDate();
		}
		
		/* Entry action for state 'record'. */
		private void entryAction_record_record() {
			timer.setTimer(this, 2, (1 * 1000), false);
			
			sCInterface.raiseRecord();
		}
		
		/* Entry action for state 'RecordInit'. */
		private void entryAction_record_RecordInit() {
			sCInterface.raiseRecordInit();
		}
		
		/* Entry action for state 'initLabel'. */
		private void entryAction_record_initLabel() {
			timer.setTimer(this, 3, (0 * 1000), false);
			
			sCInterface.raiseInitLabel();
		}
		
		/* Exit action for state 'Time'. */
		private void exitAction_time_date_time_r2_Time() {
			timer.unsetTimer(this, 0);
		}
		
		/* Exit action for state 'Date'. */
		private void exitAction_time_date_time_r2_Date() {
			timer.unsetTimer(this, 1);
		}
		
		/* Exit action for state 'record'. */
		private void exitAction_record_record() {
			timer.unsetTimer(this, 2);
		}
		
		/* Exit action for state 'initLabel'. */
		private void exitAction_record_initLabel() {
			timer.unsetTimer(this, 3);
		}
		
		/* 'default' enter sequence for state main */
		private void enterSequence_time_main_default() {
			enterSequence_time_main_r1_default();
		}
		
		/* 'default' enter sequence for state Stop */
		private void enterSequence_time_main_r1_Stop_default() {
			entryAction_time_main_r1_Stop();
			nextStateIndex = 0;
			stateVector[0] = State.time_main_r1_Stop;
			
			historyVector[0] = stateVector[0];
		}
		
		/* 'default' enter sequence for state Pause */
		private void enterSequence_time_main_r1_Pause_default() {
			entryAction_time_main_r1_Pause();
			nextStateIndex = 0;
			stateVector[0] = State.time_main_r1_Pause;
			
			historyVector[0] = stateVector[0];
		}
		
		/* 'default' enter sequence for state Start */
		private void enterSequence_time_main_r1_Start_default() {
			entryAction_time_main_r1_Start();
			nextStateIndex = 0;
			stateVector[0] = State.time_main_r1_Start;
			
			historyVector[0] = stateVector[0];
		}
		
		/* 'default' enter sequence for state Init */
		private void enterSequence_time_main_r1_Init_default() {
			entryAction_time_main_r1_Init();
			nextStateIndex = 0;
			stateVector[0] = State.time_main_r1_Init;
			
			historyVector[0] = stateVector[0];
		}
		
		/* 'default' enter sequence for state date_time */
		private void enterSequence_time_date_time_default() {
			enterSequence_time_date_time_r2_default();
		}
		
		/* 'default' enter sequence for state Time */
		private void enterSequence_time_date_time_r2_Time_default() {
			entryAction_time_date_time_r2_Time();
			nextStateIndex = 0;
			stateVector[0] = State.time_date_time_r2_Time;
		}
		
		/* 'default' enter sequence for state Date */
		private void enterSequence_time_date_time_r2_Date_default() {
			entryAction_time_date_time_r2_Date();
			nextStateIndex = 0;
			stateVector[0] = State.time_date_time_r2_Date;
		}
		
		/* 'default' enter sequence for state record */
		private void enterSequence_record_record_default() {
			entryAction_record_record();
			nextStateIndex = 1;
			stateVector[1] = State.record_record;
		}
		
		/* 'default' enter sequence for state RecordInit */
		private void enterSequence_record_RecordInit_default() {
			entryAction_record_RecordInit();
			nextStateIndex = 1;
			stateVector[1] = State.record_RecordInit;
		}
		
		/* 'default' enter sequence for state initLabel */
		private void enterSequence_record_initLabel_default() {
			entryAction_record_initLabel();
			nextStateIndex = 1;
			stateVector[1] = State.record_initLabel;
		}
		
		/* 'default' enter sequence for region time */
		private void enterSequence_time_default() {
			react_time__entry_Default();
		}
		
		/* 'default' enter sequence for region r1 */
		private void enterSequence_time_main_r1_default() {
			react_time_main_r1__entry_Default();
		}
		
		/* shallow enterSequence with history in child r1 */
		private void shallowEnterSequence_time_main_r1() {
			switch (historyVector[0]) {
			case time_main_r1_Stop:
				enterSequence_time_main_r1_Stop_default();
				break;
			case time_main_r1_Pause:
				enterSequence_time_main_r1_Pause_default();
				break;
			case time_main_r1_Start:
				enterSequence_time_main_r1_Start_default();
				break;
			case time_main_r1_Init:
				enterSequence_time_main_r1_Init_default();
				break;
			default:
				break;
			}
		}
		
		/* 'default' enter sequence for region r2 */
		private void enterSequence_time_date_time_r2_default() {
			react_time_date_time_r2__entry_Default();
		}
		
		/* 'default' enter sequence for region record */
		private void enterSequence_record_default() {
			react_record__entry_Default();
		}
		
		/* Default exit sequence for state main */
		private void exitSequence_time_main() {
			exitSequence_time_main_r1();
		}
		
		/* Default exit sequence for state Stop */
		private void exitSequence_time_main_r1_Stop() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
		}
		
		/* Default exit sequence for state Pause */
		private void exitSequence_time_main_r1_Pause() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
		}
		
		/* Default exit sequence for state Start */
		private void exitSequence_time_main_r1_Start() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
		}
		
		/* Default exit sequence for state Init */
		private void exitSequence_time_main_r1_Init() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
		}
		
		/* Default exit sequence for state date_time */
		private void exitSequence_time_date_time() {
			exitSequence_time_date_time_r2();
		}
		
		/* Default exit sequence for state Time */
		private void exitSequence_time_date_time_r2_Time() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
			
			exitAction_time_date_time_r2_Time();
		}
		
		/* Default exit sequence for state Date */
		private void exitSequence_time_date_time_r2_Date() {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;
			
			exitAction_time_date_time_r2_Date();
		}
		
		/* Default exit sequence for state record */
		private void exitSequence_record_record() {
			nextStateIndex = 1;
			stateVector[1] = State.$NullState$;
			
			exitAction_record_record();
		}
		
		/* Default exit sequence for state RecordInit */
		private void exitSequence_record_RecordInit() {
			nextStateIndex = 1;
			stateVector[1] = State.$NullState$;
		}
		
		/* Default exit sequence for state initLabel */
		private void exitSequence_record_initLabel() {
			nextStateIndex = 1;
			stateVector[1] = State.$NullState$;
			
			exitAction_record_initLabel();
		}
		
		/* Default exit sequence for region time */
		private void exitSequence_time() {
			switch (stateVector[0]) {
			case time_main_r1_Stop:
				exitSequence_time_main_r1_Stop();
				break;
			case time_main_r1_Pause:
				exitSequence_time_main_r1_Pause();
				break;
			case time_main_r1_Start:
				exitSequence_time_main_r1_Start();
				break;
			case time_main_r1_Init:
				exitSequence_time_main_r1_Init();
				break;
			case time_date_time_r2_Time:
				exitSequence_time_date_time_r2_Time();
				break;
			case time_date_time_r2_Date:
				exitSequence_time_date_time_r2_Date();
				break;
			default:
				break;
			}
		}
		
		/* Default exit sequence for region r1 */
		private void exitSequence_time_main_r1() {
			switch (stateVector[0]) {
			case time_main_r1_Stop:
				exitSequence_time_main_r1_Stop();
				break;
			case time_main_r1_Pause:
				exitSequence_time_main_r1_Pause();
				break;
			case time_main_r1_Start:
				exitSequence_time_main_r1_Start();
				break;
			case time_main_r1_Init:
				exitSequence_time_main_r1_Init();
				break;
			default:
				break;
			}
		}
		
		/* Default exit sequence for region r2 */
		private void exitSequence_time_date_time_r2() {
			switch (stateVector[0]) {
			case time_date_time_r2_Time:
				exitSequence_time_date_time_r2_Time();
				break;
			case time_date_time_r2_Date:
				exitSequence_time_date_time_r2_Date();
				break;
			default:
				break;
			}
		}
		
		/* Default exit sequence for region record */
		private void exitSequence_record() {
			switch (stateVector[1]) {
			case record_record:
				exitSequence_record_record();
				break;
			case record_RecordInit:
				exitSequence_record_RecordInit();
				break;
			case record_initLabel:
				exitSequence_record_initLabel();
				break;
			default:
				break;
			}
		}
		
		/* The reactions of state Stop. */
		private void react_time_main_r1_Stop() {
			if (check_time_main_r1_Stop_tr0_tr0()) {
				effect_time_main_r1_Stop_tr0();
			} else {
				if (check_time_main_tr0_tr0()) {
					effect_time_main_tr0();
				}
			}
		}
		
		/* The reactions of state Pause. */
		private void react_time_main_r1_Pause() {
			if (check_time_main_r1_Pause_tr0_tr0()) {
				effect_time_main_r1_Pause_tr0();
			} else {
				if (check_time_main_r1_Pause_tr1_tr1()) {
					effect_time_main_r1_Pause_tr1();
				} else {
					if (check_time_main_r1_Pause_tr2_tr2()) {
						effect_time_main_r1_Pause_tr2();
					} else {
						if (check_time_main_tr0_tr0()) {
							effect_time_main_tr0();
						}
					}
				}
			}
		}
		
		/* The reactions of state Start. */
		private void react_time_main_r1_Start() {
			if (check_time_main_r1_Start_tr0_tr0()) {
				effect_time_main_r1_Start_tr0();
			} else {
				if (check_time_main_r1_Start_tr1_tr1()) {
					effect_time_main_r1_Start_tr1();
				} else {
					if (check_time_main_tr0_tr0()) {
						effect_time_main_tr0();
					}
				}
			}
		}
		
		/* The reactions of state Init. */
		private void react_time_main_r1_Init() {
			if (check_time_main_r1_Init_tr0_tr0()) {
				effect_time_main_r1_Init_tr0();
			} else {
				if (check_time_main_tr0_tr0()) {
					effect_time_main_tr0();
				}
			}
		}
		
		/* The reactions of state Time. */
		private void react_time_date_time_r2_Time() {
			if (check_time_date_time_r2_Time_tr0_tr0()) {
				effect_time_date_time_r2_Time_tr0();
			} else {
				if (check_time_date_time_r2_Time_tr1_tr1()) {
					effect_time_date_time_r2_Time_tr1();
				}
			}
		}
		
		/* The reactions of state Date. */
		private void react_time_date_time_r2_Date() {
			if (check_time_date_time_r2_Date_tr0_tr0()) {
				effect_time_date_time_r2_Date_tr0();
			} else {
				if (check_time_date_time_r2_Date_tr1_tr1()) {
					effect_time_date_time_r2_Date_tr1();
				}
			}
		}
		
		/* The reactions of state record. */
		private void react_record_record() {
			if (check_record_record_tr0_tr0()) {
				effect_record_record_tr0();
			} else {
				if (check_record_record_tr1_tr1()) {
					effect_record_record_tr1();
				}
			}
		}
		
		/* The reactions of state RecordInit. */
		private void react_record_RecordInit() {
			if (check_record_RecordInit_tr0_tr0()) {
				effect_record_RecordInit_tr0();
			}
		}
		
		/* The reactions of state initLabel. */
		private void react_record_initLabel() {
			if (check_record_initLabel_tr0_tr0()) {
				effect_record_initLabel_tr0();
			}
		}
		
		/* Default react sequence for initial entry  */
		private void react_time_main_r1__entry_Default() {
			enterSequence_time_main_r1_Init_default();
		}
		
		/* Default react sequence for shallow history entry history state */
		private void react_time_main_r1_historystate() {
			/* Enter the region with shallow history */
			if (historyVector[0] != State.$NullState$) {
				shallowEnterSequence_time_main_r1();
			} else {
				enterSequence_time_main_r1_Init_default();
			}
		}
		
		/* Default react sequence for initial entry  */
		private void react_time__entry_Default() {
			enterSequence_time_main_default();
		}
		
		/* Default react sequence for initial entry  */
		private void react_time_date_time_r2__entry_Default() {
			enterSequence_time_date_time_r2_Time_default();
		}
		
		/* Default react sequence for initial entry  */
		private void react_record__entry_Default() {
			enterSequence_record_RecordInit_default();
		}
		
		public void runCycle() {
			if (!initialized)
				throw new IllegalStateException(
						"The state machine needs to be initialized first by calling the init() function.");
			clearOutEvents();
			for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
				switch (stateVector[nextStateIndex]) {
				case time_main_r1_Stop:
					react_time_main_r1_Stop();
					break;
				case time_main_r1_Pause:
					react_time_main_r1_Pause();
					break;
				case time_main_r1_Start:
					react_time_main_r1_Start();
					break;
				case time_main_r1_Init:
					react_time_main_r1_Init();
					break;
				case time_date_time_r2_Time:
					react_time_date_time_r2_Time();
					break;
				case time_date_time_r2_Date:
					react_time_date_time_r2_Date();
					break;
				case record_record:
					react_record_record();
					break;
				case record_RecordInit:
					react_record_RecordInit();
					break;
				case record_initLabel:
					react_record_initLabel();
					break;
				default:
					// $NullState$
				}
			}
			clearEvents();
		}
		
}
