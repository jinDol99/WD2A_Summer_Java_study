package day2_mission22;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;

abstract class Tribe {
	StarUI ui;

	ImageIcon mainBIC, building1IC, building2IC, building3IC, workerIC, attacker1IC, attacker2IC; // 라벨 이미지
	ImageIcon buildingface, workerface, attacker1face, attacker2face; // 각 페이스 이미지
	
	ImageIcon worker2IC, worker3IC, worker4IC, worker5IC, worker6IC, worker7IC, worker8IC, worker9IC, worker10IC;	
	// 새로운 SCV 라벨 이미지
	
	protected int mineral; //미네랄
	protected int gas; //가스
	protected int unit; //총 유닛 갯수
	protected int maxunit=10; //최대 만들수 있는 유닛 갯수
	protected int building; //총 건물 갯수
	protected int upgradepower; //업그레이드 파워		
	protected String tribe; //종족이름	
	protected String mainbuildingName; //본건물 이름
//	protected String building1Name; //공격생산건물 1
//	protected String building2Name; //공격생산건물 2
//	protected String building3Name; //건물3
	protected String workerName; //일꾼이름
//	protected String attacker1Name; //공격유닛1
//	protected String attacker2Name; //공격유닛2	
	
	protected String worker2Name;	// 새로운 SCV 이름
	protected String worker3Name;
	protected String worker4Name;
	protected String worker5Name;
	protected String worker6Name;
	protected String worker7Name;
	protected String worker8Name;
	protected String worker9Name;
	protected String worker10Name;
	
	

	//유닛 및 건물 설명 부분//
	protected String mainBdesc;
	protected String building1desc;
	protected String building2desc;
	protected String building3desc;
	protected String workerdesc;
	protected String attacker1desc;
	protected String attacker2desc;	
	
	// 새로운 SCV 설명 부분 //
	protected String worker2desc;
	protected String worker3desc;
	protected String worker4desc;
	protected String worker5desc;
	protected String worker6desc;
	protected String worker7desc;
	protected String worker8desc;
	protected String worker9desc;
	protected String worker10desc;
	
	
	
	
	
	protected int workerPower;//일꾼 공격력
	protected int workerEnergy;//일꾼 에너지 정보
	protected int mainBEnergy;//메인건물 에너지 정보
	
	protected int worker2Energy;	// 새로운 SCV 에너지 및 공격력 정보
	protected int worker3Energy;
	protected int worker4Energy;
	protected int worker5Energy;
	protected int worker6Energy;
	protected int worker7Energy;
	protected int worker8Energy;
	protected int worker9Energy;
	protected int worker10Energy;
	protected int worker2Power;
	protected int worker3Power;
	protected int worker4Power;
	protected int worker5Power;
	protected int worker6Power;
	protected int worker7Power;
	protected int worker8Power;
	protected int worker9Power;
	protected int worker10Power;
	
	ArrayList mainBVT; // 메인건물 객체 담는곳
	ArrayList workerVT; // 일꾼객체
	
	ArrayList worker2VT;	// 새로운 SCV 객체 담는 곳
	ArrayList worker3VT;
	ArrayList worker4VT;
	ArrayList worker5VT;
	ArrayList worker6VT;
	ArrayList worker7VT;
	ArrayList worker8VT;
	ArrayList worker9VT;
	ArrayList worker10VT;
	
	
	/////////각 건물 및 유닛 아이템(콤보박스)정보 담는 벡터//////
	ArrayList mainBItem;
	ArrayList workerItem;
	
	ArrayList worker2Item;	// 새로운 SCV 콤보박스 정보 담는 리스트
	ArrayList worker3Item;
	ArrayList worker4Item;
	ArrayList worker5Item;
	ArrayList worker6Item;
	ArrayList worker7Item;
	ArrayList worker8Item;
	ArrayList worker9Item;
	ArrayList worker10Item;
		
	
	Tribe(StarUI ui){
		this.ui = ui;
		mineral=100;
		gas=100;
		
	}
	public int getMainBEnergy(){
		return mainBEnergy;
	}
	public int getWorkerEnergy(){
		return workerEnergy;
	}
	
	// 새로운 SCV 에너지량 반환 메소드들
	public int getWorker2Energy(){
		return worker2Energy;
	}
	public int getWorker3Energy(){
		return worker3Energy;
	}
	public int getWorker4Energy(){
		return worker4Energy;
	}
	public int getWorker5Energy(){
		return worker5Energy;
	}
	public int getWorker6Energy(){
		return worker6Energy;
	}
	public int getWorker7Energy(){
		return worker7Energy;
	}
	public int getWorker8Energy(){
		return worker8Energy;
	}
	public int getWorker9Energy(){
		return worker9Energy;
	}
	public int getWorker10Energy(){
		return worker10Energy;
	}
	
	
	
	
	public void setUpgrade(int i){
		upgradepower += i;
	}
	public int getUpgrade(){
		return upgradepower;
	}
	public ImageIcon getWorkerIC(){
		return workerIC;
	}
	
	// 새로운 SCV 이미지 반환 메소드들
	public ImageIcon getWorker2IC(){
		return worker2IC;
	}
	public ImageIcon getWorker3IC(){
		return worker3IC;
	}
	public ImageIcon getWorker4IC(){
		return worker4IC;
	}
	public ImageIcon getWorker5IC(){
		return worker5IC;
	}
	public ImageIcon getWorker6IC(){
		return worker6IC;
	}
	public ImageIcon getWorker7IC(){
		return worker7IC;
	}
	public ImageIcon getWorker8IC(){
		return worker8IC;
	}
	public ImageIcon getWorker9IC(){
		return worker9IC;
	}
	public ImageIcon getWorker10IC(){
		return worker10IC;
	}
	
	
	
	
	synchronized void setMineral(int i){
		mineral+=i;
	}
	public int getMineral(){
		return mineral;
	}	
	synchronized void setGas(int i){
		gas+=i;
	}
	public int getGas(){
		return gas;
	}	
	synchronized void setUnit(int a){
		unit=a;
	}
	public int getUnit(){
		return unit;
	}
	synchronized void setMaxunit(int i){
		maxunit +=i;
	}
	public int getMaxunit(){
		return maxunit;
	}
	synchronized void setBuilding(int a){
		building = a;
	}
	public int getBuilding(){
		return building;
	}	
	public String getTribeName(){
		return tribe;
	}
	public String getMainBName(){
		return mainbuildingName;
	}
	public String getWorkerName(){
		return workerName;
	}
	
	// 새로운 SCV 이름 반환 메소드들
	public String getWorker2Name(){
		return worker2Name;
	}
	public String getWorker3Name(){
		return worker3Name;
	}
	public String getWorker4Name(){
		return worker4Name;
	}
	public String getWorker5Name(){
		return worker5Name;
	}
	public String getWorker6Name(){
		return worker6Name;
	}
	public String getWorker7Name(){
		return worker7Name;
	}
	public String getWorker8Name(){
		return worker8Name;
	}
	public String getWorker9Name(){
		return worker9Name;
	}
	public String getWorker10Name(){
		return worker10Name;
	}
	
	
	public int getWorkerpower(){
		return workerPower;
	}
	
	// 새로운 SCV 파워 공격력 반환 메소드들
	public int getWorker2power(){
		return worker2Power;
	}
	public int getWorker3power(){
		return worker3Power;
	}
	public int getWorker4power(){
		return worker4Power;
	}
	public int getWorker5power(){
		return worker5Power;
	}
	public int getWorker6power(){
		return worker6Power;
	}
	public int getWorker7power(){
		return worker7Power;
	}
	public int getWorker8power(){
		return worker8Power;
	}
	public int getWorker9power(){
		return worker9Power;
	}
	public int getWorker10power(){
		return worker10Power;
	}
}