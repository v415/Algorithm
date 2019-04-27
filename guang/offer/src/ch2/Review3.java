package ch2;

public class Review3 {
	
	int duplicate(int numbers[]) {
		int length=numbers.length;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]<0||numbers[i]>length-1){
				return -1;
			}
		for (int j = 0; j < numbers.length; j++) {
			while(numbers[j]!=j) {
				if (numbers[j]==numbers[numbers[j]]) {
					return numbers[j];
				}
				int temp=numbers[j];
				numbers[j]=numbers[temp];
				numbers[temp]=temp;
			}
		}
		}
		return -1;
	}
	int duplicate2(int numbers[]) {
		return -1;
		
	}

}
