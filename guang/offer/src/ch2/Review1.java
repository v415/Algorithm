package ch2;

public class Review1 {
	public static class Singleton  {
		private static Singleton singleton=new Singleton();
		
		private Singleton() {
			
		}
		public synchronized  Singleton getSingleton() {
			
			return singleton;
			
		}
	}
	
}
