package day2_mission;
import java.util.Vector;

interface myIStarUnit {
	public String getTribe(); //��������
	public String getName(); //�����̸�����
	public int getEnergy(); //���� ������ ����
	public int getPower(); //���� �Ŀ�����
	public void attack(int power,int attackspeed, Vector vt,myStarObject target); //����
	public void progressing(int time); 
}

