package com.jm3002.learn.spring.ioc.v3;

public class CoatchFactory {

	public static Coatch getCoatch(){
		Coatch coatch = null;
		
		/**
		 * coatch=fitnessCoatch
		 */
		String coatchType = "yogaCoatch";
		
		if(coatchType.equals("cricketCoatch")){
			coatch = new CricketCoatch();
		}
		else if (coatchType.equals("fitnessCoatch")) {
			coatch = new FitnessCoatch();
		}
		else if (coatchType.equals("yogaCoatch")) {
			coatch = new YogaCoatch();
		}		
		
		return coatch;
	}
}
