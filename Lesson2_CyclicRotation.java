package Codility;

// https://app.codility.com/demo/results/trainingF8WMZ8-ETN/

class Solution1 {
	public int[] solution(int[] A, int K) {
		int aLength = A.length;
		if(aLength > 0) {
			while(K != 0){
				int num = A[aLength-1];
				for(int j = aLength-1; j > 0; j--) {
					A[j] = A[j-1];
				}
				A[0] = num;
				K--;
			}
		}
		return A;
	}

}
