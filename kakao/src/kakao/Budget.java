package kakao;

import java.util.Arrays;

public class Budget {
	  public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);
        for(int i : d){
        	sum += i;
        	if(sum <= budget) {
        		count++;
        	}
        	else {
        		sum -= i;
        		break;
        	}
        }
        return count;
    }
}
