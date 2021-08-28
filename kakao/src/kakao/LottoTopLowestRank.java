package kakao;

public class LottoTopLowestRank {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int countZero = 0;// 0ÀÇ °³¼ö
		int countMatch = 0;	
		int top = 0;
		int bottom = 0;
		for(int i =0 ; i<lottos.length; i++) {
			if(lottos[i] == 0) {
				countZero++;
				continue;
			}
			for(int j =0; j<win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					countMatch++;
				}
			}
		}
		top =  6-(countMatch+countZero-1);
		bottom = 6-(countMatch-1);
		answer[0] = (top < 7) ?top: 6;
		answer[1] =	(bottom < 7) ?bottom : 6;
		
		return answer;
	}
}
