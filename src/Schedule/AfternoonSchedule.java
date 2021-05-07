package Schedule;

import java.util.Scanner;

public class AfternoonSchedule extends MornigSchedule implements Scheduleinput{
	
	public AfternoonSchedule(ScheduleKind kind) {
		super(kind);
	}

    public void getUserInput(Scanner input) {
		
		
		System.out.println("Schedule : ");
		String schedule = input.next();  //입력값을 'schedule' 변수에 저장
		this.setSchedule(schedule);  //'schedule'값을 'setSchedule'함수를 이용해 'schedule'에 저장
		
		char answer = 'X';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have anything to memo? (Y/N)");
			
			answer = input.next().charAt(0);
			//'answer'이 Yes인 경우
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Memo : ");
				String memo = input.next();	 //입력값을 'memo'배열에 저장함
				this.setMemo(memo);  //'memo'값을 'setMemo'함수를 이용해 'memo'에 저장
				break;
			
			}
			//'answer'이 No인 경우
			else if(answer == 'n' || answer == 'N') {
				this.setMemo(""); //'setMemo'함수에 'memo'값을 공백으로 둠
				break;
			}
			//'answer'이 Yes 나 No가 아닌경우
			else {
				System.out.println("Chek your answer");
			}
		}
		
		
	}
}
