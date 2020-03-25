/*
 * https://app.codesignal.com/interview-practice/task/gX7NXPBrYThXZuanm
*/

// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    if(l == null) return null;
    else {
        if(l.value == k) return removeKFromList(l.next, k);
        else {
            l.next = removeKFromList(l.next, k);
            return l ;
        }
    }
}