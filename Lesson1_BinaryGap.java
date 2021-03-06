package Codility;

//https://app.codility.com/demo/results/trainingE7Z6V9-D8W/

class Solution {
	public int solution(int N) {
		String binaryString = Integer.toBinaryString(N);
		int count = 0;
		int answer = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			char binaryChar = binaryString.charAt(i);
			if(binaryChar == '1') {
				for(int j = i+1; j < binaryString.length(); j++) {
					char binaryChar1 = binaryString.charAt(j);
					if(binaryChar1 == '0') {
						count++;
					}else {
						answer = answer < count ? count : answer;
						count = 0;
						break;
					}
				}
			}
		}
		return answer;
	}

}
