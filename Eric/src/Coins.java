
public class Coins {

	public static void main(String[] args) {
		int totalMoney = 100;
		//统计换法总数		
		int count = 0;
		// 一百块钱换成一分硬币、两分硬币和五分硬币，共有多少种换法	
		for (int i = 1; i <= 100; i++) {			
			//取一分的硬币
			for (int j = 1; j <= 50; i++) {					
				//取两分的硬币
				for (int k = 1; k <= 20; k++) {
					//取五分的硬币				
					if (i * 1 + j * 2 + k * 5 == totalMoney) {	
						//判断钱数是否是100分
						System.out.println("一分硬币有：" + i + "个、" + "两分硬币有：" + j + "个、" + "五分硬币有：" + k + "个");
						count ++;
						System.out.println("一共有" + count + "种换法");
					}		
				}
			}
		}
	}

}
