#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 
#include <ctype.h>

struct Node { 
	int data; 
	struct Node* next; 
	struct Node* prev; 
}; 



void append(struct Node** head_ref, int new_data) 
{ 
	struct Node* new_node = (struct Node*)malloc(sizeof(struct Node)); 
	struct Node* last = *head_ref; 

	new_node->data = new_data; 
	new_node->next = NULL; 
	
	if (*head_ref == NULL) { 
		new_node->prev = NULL; 
		*head_ref = new_node; 
		return; 
	} 

	while (last->next != NULL) 
		last = last->next; 

	last->next = new_node; 
	new_node->prev = last; 

	return; 
} 


Node* SmallestNumberNodeInDLL(struct Node** head_ref) 
{ 
    struct Node *minNode, *temp; 
    temp = minNode = *head_ref; 
  
    while (temp != NULL) { 
  
        if (temp->data < minNode->data) 
            minNode = temp; 
  
        temp = temp->next; 
    } 
    return minNode;
} 

void deleteNode(struct Node** head_ref, struct Node* del) 
{ 
    if (*head_ref == NULL || del == NULL) 
        return; 
  
    if (*head_ref == del) 
        *head_ref = del->next; 
  
    if (del->next != NULL) 
        del->next->prev = del->prev; 
  
    if (del->prev != NULL) 
        del->prev->next = del->next; 
  
    free(del); 
    return; 
} 

Node* SelectionSort(struct Node** head_ref)
{
	struct Node* sorted = NULL; 
    struct Node* current = *head_ref; 
    
	while (current != NULL) { 
  		Node* maxNode = SmallestNumberNodeInDLL(&current);
  		append(&sorted, maxNode->data); 
  		deleteNode(&current,maxNode);
    }    
    return sorted;
}

void printList(struct Node* node, char* message) 
{ 
	struct Node* last; 
	printf(message); 
	while (node != NULL) { 
		printf(" %d ", node->data); 
		last = node; 
		node = node->next; 
	} 
} 

int main() 
{ 
	struct Node* head = NULL; 
	struct Node* sorted = NULL; 
	printf("Write numbers. Exit for Q.\n");

	while(true)
	{
		char getNumber[10];
		scanf("%s",getNumber);
		if(strcmp(getNumber,"Q") == 0)
			break;
		else{
			append(&head, atoi(getNumber)); 
		}
	}
	
	printList(head,"\nTraversal in forward direction \n");
	sorted = SelectionSort(&head);
	printList(sorted,"\nSorted array use Selection Sort \n");

	return 0; 
} 

