package day02;

public class Student {

	int num;
	String name;
	
	static void study() {
		System.out.println("공부중...");
	}
	
	void work(int time) {
		if(time == 0) return;
		System.out.println(time + "시간째");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		work(--time);
	}
}
