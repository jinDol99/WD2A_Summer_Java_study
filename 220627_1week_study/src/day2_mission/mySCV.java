package day2_mission;

import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


class mySCV extends myTerranUnit implements Runnable{
	static int cost=50; //���
	static int gascost=0; //�������
	static int buildtime = 70;
	static int attackspeed = 600;
	mySCV(myStarUI ui){
		super(ui);
		name = "SCV";
		energy=60;
		power=2;
		work=true;
		flag=true;
		progress=0;
		con = new Vector();
		con.addElement("�����");
		con.addElement("�̳׶�");
		con.addElement("����");
		con.addElement("Ŀ�ǵ�");
		con.addElement("����");
		condi=(String) con.elementAt(0);
		go=new Thread(this);
		go.start();
	}
		
	public void run(){
		while(true){
			switch(job){
			case 0:
				flag=true;
				go.suspend();
				break;
			case 1:
				flag=true;
				addMineral();
				break;
			case 2:
				flag=true;
				addGas();
				break;
			case 3:
				flag=true;
				makeMainB();
				break;
			case 7:
				flag=true;
				condi=(String)getCondition(7);
				int rand;
				ui.setTB(ui.clan.workerVT);
				while(true){ 			
					if(ui.enemy.clan.getBuilding()==0||flag==false){ //�ǹ��� �� ��������
						job=0; //���� ����
						condi=(String)getCondition(0);
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName())
							ui.setTB(ui.enemy.clan.workerVT);
						ui.endMessage("�¸��Ͽ����ϴ�.");
						ui.enemy.endMessage("�й��Ͽ����ϴ�.");
						System.exit(0); //���� ����
						break;
					}
				}
				if(flag==false)
					break;
				
				break;
			}
		}
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	
	void addMineral(){
		condi=(String)getCondition(1);
		ui.setTB(ui.clan.workerVT); //�������� �ٲ�
		
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			ui.clan.setMineral(8);;
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			
			if(flag==false){
				break;
			}
		}		
	}
	void addGas(){
		condi=(String)getCondition(2);
		ui.setTB(ui.clan.workerVT);
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			ui.clan.setGas(8);
			ui.U_gas.setText(String.valueOf(ui.clan.getGas()));
			
			if(flag==false){
				break;
			}
		}		
	}
	void makeMainB(){
		if(ui.clan.getMineral()>=myCommandCenter.cost){
			condi=(String)getCondition(3);
			ui.clan.setMineral(-myCommandCenter.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(myCommandCenter.buildtime);
			ui.clan.mainBVT.addElement(new myCommandCenter(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getMainBName())
				ui.setTB(ui.clan.mainBVT);
		}
		else{
			ui.setMessage("Not enough minerals");
		}
		progress=0;
		job=0;
	}
}

