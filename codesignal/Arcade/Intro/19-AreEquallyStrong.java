/*
 * https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL
*/

boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return (yourLeft + yourRight == friendsLeft + friendsRight) && 
			(((yourLeft == friendsLeft) && (yourRight == friendsRight)) || 
			((yourLeft == friendsRight) && (yourRight == friendsLeft)));
}
