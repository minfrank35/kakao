package kakao;

public class StringCompression {
	 public int solution(String s) {
		int answer = 0;
		char prevState = 0;
		char nowState = 0;
		int count = 1;
		
		StringBuilder buffer = new StringBuilder();
		
		for(int i = 0; i <= s.length(); i++) {
			if(i < s.length()) nowState  = s.charAt(i);
			else if(i == s.length()){
				nowState = 0;
			}
			if(nowState == prevState) {
				count++;
			}else if(nowState != prevState && prevState != 0){
				buffer.append((count > 1 ?Integer.toString(count) : "")+ prevState);
				count = 1;
			}
			prevState = nowState;
		}
		
		answer = buffer.length();
		System.out.println(buffer.toString());
        return answer;
	 }
}
