package tools;

public class tools {
	
	private void pause(double seconds) {
        try {
              Thread.sleep((long) (seconds*1000));                 
        } catch(InterruptedException e) {
              Thread.currentThread().interrupt();
        }
} 

}
