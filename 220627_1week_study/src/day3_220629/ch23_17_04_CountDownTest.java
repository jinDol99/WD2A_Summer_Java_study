package day3_220629;
import java.awt.Font;
import javax.swing.*;

public class ch23_17_04_CountDownTest extends JFrame {
	private JLabel label;
	
	class MyThread extends Thread {					// 클래스 속 내부클래스를 사용
		public void run() {							// Thread를 상속받아 run() 메소드 안에 실행시킬 스레드
			for (int i = 10; i >= 0; i--) {			// 동작을 지정함.
				try {
					Thread.sleep(1000);				// sleep 메소드는 사용 도중 에러 발생 가능성이 높으므로
				} catch (InterruptedException e) {	// try catch문을 사용해 미리 익셉션을 잡아줌.
					e.printStackTrace();
				}
				label.setText(i + "");				// 1초(1000밀리초)가 지나면 레이블의 텍스트를 변경
			}
		}
	}
	public ch23_17_04_CountDownTest() {
		setTitle("카운트다운");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();	// 새 스레드를 만듦과 동시에 시작을 할 수 있음.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ch23_17_04_CountDownTest t = new ch23_17_04_CountDownTest();

	}

}
