/*
 * https://app.codesignal.com/arcade/intro/level-6/6Wv4WsrsMJ8Y2Fwno
*/

boolean variableName(String name) {
    if(name.substring(0,1).matches("[0-9]"))
            return false;
        
    Matcher m = Pattern.compile("^[a-zA-Z0-9_]+").matcher(name);
    if (!m.matches()) return false;
    return true;
}
