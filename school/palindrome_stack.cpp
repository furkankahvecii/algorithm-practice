#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 9999

int count = 0;

struct stack {
  char items[MAX];
  int top;
};
typedef struct stack st;

int isfull(st *s);


st * push(st *s, char newitem) {
  if (isfull(s)) {
    printf("STACK FULL");
  } else {
    s->top++;
    s->items[s->top] = newitem;
  }
  count++;
  return s;
}

char pop(st *s) {
  	char popped = s->items[s->top];
	s->top--;
	count--;
	return popped;
}

st * olustur(char cumle[])
{
	if (cumle == NULL) 
    	return NULL;
    
	st *s = (st *)malloc(sizeof(st));
	int c=0;

	while (cumle[c] != '\0') {
      s = push(s, cumle[c]);
      c++;
   }
	return s;
}

void stack_goster(st *s) {
  printf("Stack: ");
  for (int i = 0; i <= count; i++) {
    printf("%c ", s->items[i]);
  }
  printf("\n");
}


bool isPalin(st *s, char str[]) {
	int i=0;
    while (str[i] != '\0') { 
	    char ele = pop(s); 
	    if (ele != str[i]) 
	        return false;
	    i++; 
	} 
	
	return true;
}

int isfull(st *s) {
  if (s->top == MAX - 1)
    return 1;
  else
    return 0;
}

char * noktalama_isaretlerden_arindir(char cumle[])
{
	for (int i = 0, j; cumle[i] != '\0'; ++i) {
		
      while (!(cumle[i] >= 'a' && cumle[i] <= 'z') && !(cumle[i] >= 'A' && cumle[i] <= 'Z') && !(cumle[i] == '\0')) {
         for (j = i; cumle[j] != '\0'; ++j) {
            cumle[j] = cumle[j + 1];
         }
         cumle[j] = '\0';
      }
   }
   
   return cumle;
}



int main()
{
	char cumle[] = "ey edip adanadapideye";
	strcpy(cumle,noktalama_isaretlerden_arindir(cumle));
	st * stack = olustur(cumle);  
	bool a = isPalin(stack, cumle);
	if(a) printf("palindrome");
	else printf("palindrome degil");
    return 0;
}
