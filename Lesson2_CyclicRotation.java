package Codility;

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

public class Lesson2_CyclicRotation {
	public static void main(String[] args) {
		Solution1 sol =  new Solution1();
		int[] A = {};
		int K = 5;
		int[] B = sol.solution(A,K);
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i]);
		}
	}
}
