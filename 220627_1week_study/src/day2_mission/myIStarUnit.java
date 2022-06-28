package day2_mission;
import java.util.ArrayList;

interface myIStarUnit {
	public String getTribe(); //종족정보
	public String getName(); //유닛이름정보
	public int getEnergy(); //유닛 에너지 정보
	public int getPower(); //유닛 파워정보
	public void attack(int power,int attackspeed, ArrayList vt,myStarObject target); //공격
	public void progressing(int time); 
}

