public class PracticeProblem {


    public static void main(String args[]) {
		
	}

	//q1
	public static String pyramid(int rows) {
        String pyr = "";
		for (int i = 0; i < rows; i++) {
			if(i != 0) pyr = pyr + "\n";
			for (int j = 0; j < (rows - i - 1); j++) {
				pyr = pyr + ' ';
			}
			for (int j = 0; j < i; j++) {
				pyr = pyr + "* ";
			}
			pyr = pyr + "*";
	
		}
		return pyr;
    }

	public static String square(int num) {
		String sqr = "";
		for (int i = 0; i < num; i++) {
			if (i == num - 1) {
				for (int j = 0; j < num; j++) {
					sqr = sqr + "*";
				}
			} else if (i == 0) {
				for (int j = 0; j < num; j++) {
					sqr = sqr + "*";
				}
				sqr = sqr + "\n";
			} else {
				sqr = sqr + "*";
				for (int j = 1; j < num - 1; j++) {
					sqr = sqr + " ";
				} 
				sqr = sqr + "*\n";
				}
		}
		return sqr;
	}

	public static boolean hasLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}

	



