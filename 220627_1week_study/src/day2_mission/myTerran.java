package day2_mission;
import java.util.*;
import javax.swing.ImageIcon;

class myTerran extends myTribe {
	
	myTerran(myStarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //종족 이름
		//////////유닛 및 건물 이름//////////
		mainbuildingName="CommandCenter";
		workerName="SCV";
		
		/////////유닛의 파워정보//////
		workerPower=2;
		
		///////유닛 및 건물 에너지 정보/////
		workerEnergy=60;
		mainBEnergy=1500;
		
		//////////유닛 및 건물 간략한 설명/////
		mainBdesc = "Terran Command Center";
		workerdesc = "Terran SCV";
		
		///////////건물및 유닛 이미지//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		
		//////////건물 및 유닛 페이스 이미지/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		
		///////////건물 및 유닛 아이템(행동)정보 초기화///////////	
		mainBVT = new Vector();
		workerVT = new Vector();
		
		mainBVT = new Vector();
		workerVT = new Vector();
		
		mainBItem = new Vector();
		mainBItem.addElement("SCV");
		
		workerItem = new Vector();
		workerItem.addElement("놀기");
		workerItem.addElement("미네랄");
		workerItem.addElement("가스");
		workerItem.addElement("CommandCenter");
		workerItem.addElement("공격하기");
		
		mainBVT.addElement(new myCommandCenter(ui)); //최초 커맨드 건물 기본 하나
		
		for(int i=0;i<4;i++){//최초 SCV기본 4명
			workerVT.addElement(new mySCV(ui));
		}
		
		setUpgrade(0);//최초 업그레이드 파워 0
		setUnit(workerVT.size());
		setBuilding(mainBVT.size());
	}
}