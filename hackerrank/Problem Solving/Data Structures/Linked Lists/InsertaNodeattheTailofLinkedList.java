/*
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
*/



// Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null){
            head = new SinglyLinkedListNode(data);
        }
        else{
            SinglyLinkedListNode node = head;
        
            while(node.next != null){
                node = node.next;
            }
            node.next = new SinglyLinkedListNode(data);
        }
        return head;
    }