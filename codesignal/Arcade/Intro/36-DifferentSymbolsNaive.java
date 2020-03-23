/*
 * https://app.codesignal.com/arcade/intro/level-8/8N7p3MqzGQg5vFJfZ
*/

int differentSymbolsNaive(String s) {
    Set<Character> set = new HashSet<Character>();
    for(char ch : s.toCharArray()) {
        if(set.add(ch)) {}
    }
    
    return set.size();
}
