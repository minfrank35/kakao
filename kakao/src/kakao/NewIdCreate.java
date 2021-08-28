package kakao;

public class NewIdCreate {

	public String solution(String new_id) {
		
		// 1단계
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		// 2단계

		String result = "";
//		for (int i = 0; i < new_id.length(); i++) {
//			char buffer = new_id.charAt(i);
//			if (Character.isLowerCase(buffer) || buffer == '.' || Character.isDigit(buffer) || buffer == '_'
//					|| buffer == '-') {
//				result += buffer;
//			}
//		}

		
//		System.out.println(result);
//		new_id = result;
		new_id = new_id.replaceAll("[^0-9a-z._-]", "");
		System.out.println(new_id);
		// 3단계
		char prevState = 0;
		char nowState = 0;
		for (int i = 0; i < new_id.length(); i++) {
			nowState = new_id.charAt(i);
			if (nowState == '.' && prevState == '.' && nowState == prevState) {
			} else {
				result += nowState;
			}
			prevState = nowState;
		}
		new_id = result;
		System.out.println(new_id);

		// 4단계
		/*
		 * 
		 */
		if (new_id.length() != 1) {
			if (new_id.indexOf(".") == 0) {
				new_id = new_id.substring(1);
			}
			if (new_id.lastIndexOf(".") == new_id.length() - 1) {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		} else {
			if (new_id.indexOf(".") == 0) {
				new_id = "";
			}
		}

		System.out.println(new_id);

		// 5단계
		new_id = new_id.trim();
		if (new_id.equals("")) {
			new_id = "a";
		}

		System.out.println(new_id);

		// 6단계
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
		if (new_id.lastIndexOf(".") == new_id.length() - 1) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		System.out.println(new_id);

		// 7단계
		if (new_id.length() > 0 && new_id.length() <= 2) {
			for (int i = new_id.length() - 1; i < 2; i++) {
				new_id += new_id.charAt(i);
			}
		}

		System.out.println(new_id);
		return new_id;
	}
}
