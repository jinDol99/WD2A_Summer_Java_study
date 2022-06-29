package day3_mission;
import java.util.*;
import javax.swing.ImageIcon;

class Terran extends Tribe {
	Terran(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //���� �̸�
		//////////���� �� �ǹ� �̸�//////////
		mainbuildingName="CommandCenter";
//		building1Name="Barracks";
//		building2Name="Factory";
//		building3Name="SupplyDepot";
		workerName="SCV";
//		attacker1Name="Marine";
//		attacker2Name="Tank";
		/////////������ �Ŀ�����//////
		workerPower=2;
		///////���� �� �ǹ� ������ ����/////
		workerEnergy=60;
		mainBEnergy=1500;
		//////////���� �� �ǹ� ������ ����/////
		mainBdesc = "Terran Command Center";
//		building1desc = "Terran Barracks";
//		building2desc = "Terran Factory";
//		building3desc = "Terran Supply Depot";
		workerdesc = "Terran SCV";
//		attacker1desc = "Terran Marine";
//		attacker2desc = "Terran Siege Tank";
		///////////�ǹ��� ���� �̹���//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
//		building1IC = new ImageIcon("img/terranbuilding1.jpg");
//		building2IC = new ImageIcon("img/terranbuilding2.jpg");
//		building3IC = new ImageIcon("img/terranbuilding3.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
//		attacker1IC = new ImageIcon("img/terranattacker1.jpg");
//		attacker2IC = new ImageIcon("img/terranattacker2.jpg");
		//////////�ǹ� �� ���� ���̽� �̹���/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
//		attacker1face = new ImageIcon("img/terranattacker1face.jpg");
//		attacker2face = new ImageIcon("img/terranattacker2face.jpg");
		
		
		///////////�ǹ� �� ���� ������(�ൿ)���� �ʱ�ȭ///////////	
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBItem = new ArrayList();
		mainBItem.add("SCV");
		
		
		workerItem = new ArrayList();
		workerItem.add("���");
		workerItem.add("�̳׶�");
		workerItem.add("����");
		workerItem.add("CommandCenter");
		
		
		mainBVT.add(new CommandCenter(ui)); //���� Ŀ�ǵ� �ǹ� �⺻ �ϳ�
		
		for(int i=0;i<4;i++){//���� SCV�⺻ 4��
			workerVT.add(new SCV(ui));
		}		
		setUpgrade(0);//���� ���׷��̵� �Ŀ� 0
		setUnit(workerVT.size());
		setBuilding(mainBVT.size());
		
	}
}