package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ScheduleAdder;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	//frame을 받아오는 생성자
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JButton b = (JButton)e.getSource();
		ScheduleAdder adder = frame.getScheduleadder();//ScheduleAdder 객체를 생성
		frame.setupPanel(adder);//fram에 adder panel을 새로 넣음

	}

}
