package day2_mission;
import java.util.Vector;

abstract class myTerranBuilding extends myStarObject implements myIStarBuilding  {
	myTerranBuilding(myStarUI ui) {
		super(ui);
		// TODO Auto-generated constructor stub
	}
	public void makeUnit() {
		// TODO Auto-generated method stub
		
	}
	public void flightBuilding(){
		
	}
	public void progressing(int time){
		while(progress<100){
			try {
                Thread.sleep(time);
            } catch (InterruptedException ignore) {}
            progress+=1;
		}
	}
}

