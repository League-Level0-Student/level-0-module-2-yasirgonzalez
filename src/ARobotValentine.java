import org.jointheleague.graphical.robot.Robot;

public abstract class ARobotValentine {
	public static void main(String[] args) {
	Robot valentine  = new Robot();
	valentine.setWindowImage("download.jpeg");
valentine.moveTo(450, 450);
	valentine.penDown();
	valentine.setSpeed(5);
	valentine.turn(30);
	valentine.move(225);
	valentine.setAngle(0);
	for (int i = 0; i <180; i++) {
	valentine.turn(-1);
		valentine.move(1);	
	}
	valentine.setAngle(0);
	for (int i = 0; i <180; i++) {
		valentine.turn(-1);
			valentine.move(1);	
		}
	valentine.setAngle(150);
	valentine.move(225);  
	valentine.hide();
}
}