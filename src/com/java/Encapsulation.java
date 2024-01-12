package com.java;

public class Encapsulation {
	//example of encapsulation
	
		private static int score  = 0; // 0 this variable can not be accessed outside this class private
		//private static String s = "123";
		
		public Encapsulation() {
			
			//TODO Auto generated constructer stub
		}//implicit constructor
		
		public void four() {//this method is accessable outside this class
			score = score + 4;
			int c = 0;//local variable
			///print it
			//return score;
		}
		public void six() {
			score = score + 6; //in case of void no return is needed
		}
		public int getScore() {
			return score ;//if there is return type in any method there should be return statement
		}

	public static void main(String[] args) {
Encapsulation score12 = new Encapsulation();///object ClassName variablename = new classname()
		
		Encapsulation.score =  5; //creation//class variable(static)
		score12.six();//object.methodName
		
		score12.four();//object.methodNamescore12.four();
		score12.six();
		//state of score is(score12 => 10 ==>16)
		
		System.out.println(score12.getScore());//behavior
		

	}

}
