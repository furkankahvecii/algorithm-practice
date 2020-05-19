#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct Asal {
   int prime_number;
   struct Asal* next;
} prime;


bool asalmi(int number);
prime* ekle(prime *head,int value);


prime * olustur(int n)
{
	if (n <= 1) 
    	return NULL;
    
	Asal * head = NULL;
	int i,c;

	for (i = 2; i < n; i++)
	{
		if(asalmi(i))
		{
			head = ekle(head,i);
		}
	}
	return head;
}

bool asalmi(int number)
{
	if ( number > 2 && number%2 == 0 ) {
        return false;
    }
    
    int i;
    int top = (int)sqrt(number) + 1;
    for(i = 3; i < top; i+=2){
        if(number % i == 0){
            return false;
        }
    }
    return true; 
}

prime* ekle(prime *head,int value)
{
	struct Asal *p = (prime*)malloc(sizeof(prime));
	p->prime_number=value;
	p->next=head;
	return (p);
}

void asallari_goster(prime* head) 
{ 
    if (head == NULL) return; 

    asallari_goster(head->next); 
    printf("%d ", head->prime_number); 
} 

int main()
{
	int n = 1000;
	Asal * asallar = olustur(n);  
	asallari_goster(asallar);
    return 0;
}
