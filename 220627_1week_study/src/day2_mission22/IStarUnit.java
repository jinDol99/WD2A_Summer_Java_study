package day2_mission22;
import java.util.Vector;

interface IStarUnit {
	public String getTribe(); //��������
	public String getName(); //�����̸�����
	public int getEnergy(); //���� ������ ����
	public int getPower(); //���� �Ŀ�����
	public void attack(int power,int attackspeed, Vector vt,StarObject target); //����
	public void progressing(int time); 
}