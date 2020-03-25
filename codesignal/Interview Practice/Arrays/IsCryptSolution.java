/*
 * https://app.codesignal.com/interview-practice/task/yM4uWYeQTHzYewW9H
*/

boolean isCryptSolution(String[] crypt, char[][] solution) {
	HashMap<Character,Character> hmap = new HashMap<>();
	for(int q = 0 ; q<solution.length;q++) {
		hmap.put(solution[q][0], solution[q][1]);
	}
	
	ArrayList<Long> array = new ArrayList();
	StringBuilder str = new StringBuilder("");
	int count = 0;
	
	for(int i = 0 ; i<crypt.length;i++) {
		for(int j = 0 ; j<crypt[i].length();j++) {		
			char a = hmap.get(crypt[i].charAt(j));
			if(a == '0' && j == 0 && crypt[i].length() >1) {
				return false;
			}
			str.append(a);
		}
		
		array.add(Long.valueOf(str.toString()));
		str.setLength(0);
	}
	
	if(array.get(0) + array.get(1) == array.get(2))
		return true;
	
	return false;
}

