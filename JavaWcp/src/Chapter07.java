
//public class Chapter07 {
//	public static void main(String[] args) {
//		int distance = 12;
//		if (distance <= 5) {
//			System.out.println("とても近いです");
//		} else if (distance <= 10 ) {
//			System.out.println("近いです");
//		} else if (distance <= 15 ) {
//			System.out.println("遠いです");
//		} else {
//			System.out.println("とても遠いです");
//		}
//	}
//}

public class Chapter07 {
	public static void main(String[] args) {
		String signal = "red";
		switch(signal) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.print("黄信号です");
			break;
		case "blue":
			System.out.print("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
