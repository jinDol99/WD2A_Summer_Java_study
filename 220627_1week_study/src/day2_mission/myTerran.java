package day2_mission;
import java.util.*;
import javax.swing.ImageIcon;

class myTerran extends myTribe {
	
	myTerran(myStarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //���� �̸�
		//////////���� �� �ǹ� �̸�//////////
		mainbuildingName="CommandCenter";
		workerName="SCV";
		
		/////////������ �Ŀ�����//////
		workerPower=2;
		
		///////���� �� �ǹ� ������ ����/////
		workerEnergy=60;
		mainBEnergy=1500;
		
		//////////���� �� �ǹ� ������ ����/////
		mainBdesc = "Terran Command Center";
		workerdesc = "Terran SCV";
		
		///////////�ǹ��� ���� �̹���//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		
		//////////�ǹ� �� ���� ���̽� �̹���/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		
		///////////�ǹ� �� ���� ������(�ൿ)���� �ʱ�ȭ///////////	
		ArrayList mainBVT = new ArrayList();
		ArrayList workerVT = new ArrayList();
		
//		ArrayList mainBVT = new ArrayList();
//		ArrayList workerVT = new ArrayList();
		
		ArrayList mainBItem = new ArrayList();
		mainBItem.add("SCV");
		
		ArrayList workerItem = new ArrayList();
		workerItem.add("���");
		workerItem.add("�̳׶�");
		workerItem.add("����");
		workerItem.add("CommandCenter");
		
		mainBVT.add(new myCommandCenter(ui)); //���� Ŀ�ǵ� �ǹ� �⺻ �ϳ�
		
		for(int i=0;i<4;i++){//���� SCV�⺻ 4��
			workerVT.add(new mySCV(ui));
		}
		
		setUpgrade(0);//���� ���׷��̵� �Ŀ� 0
		setUnit(workerVT.size());
		setBuilding(mainBVT.size());
	}
}