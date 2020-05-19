#include <stdio.h>
#include <stdlib.h>
 
typedef struct iskambil_destesi {
    char sayi;
    char renk;
    struct iskambil_destesi * next;
    struct iskambil_destesi * prev;
} deste;
 
deste * yeni_deste_olustur(){
    deste * head = NULL;
    deste * current = NULL;
    char s[13]={'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
    char r[4]={'S','K','M','C'};
    int i, j;
    for(i=0;i<4;i++){
        for(j=0;j<13;j++){
            if(i==0 && j==0){
                current = (deste*)malloc(sizeof(deste));
                current->renk = r[i];
                current->sayi = s[j];
                current->next = NULL;
                current->prev = NULL;
               // current = head;
            }else{
                current->next = (deste*)malloc(sizeof(deste));
                current->next->renk = r[i];
                current->next->sayi = s[j];
                current->next->next = NULL;
                current->next->prev = current;
                current=current->next;
            }
        }
    }
    return current;
}
 
 void karistir (deste * head) {
    deste * current = head;
    deste * temp = head;
    char s,r;
    int i,j;
 
    while(current->next!=NULL)
        current = current->next;
        
    for(i=51;i>0;i--)
	{
        j=(rand()%i);
        while(j>0)
		{
            temp=temp->prev;
            j--;
		}
		
        r=temp->renk;
        s=temp->sayi;
        head->renk=current->renk;
        head->sayi=current->sayi;
        temp->sayi=s;
        temp->renk=r;
        temp = current;
        current=current->prev;
    }
}
 
void desteyi_goster(deste * head) {
    deste * current = head;
    if(current==NULL){
		printf("Kart yok.\n");
    }
	else{
	    while(current != NULL){
	        printf("%c%c\n", current->renk,current->sayi);
	        current=current->prev;
	    }
	}
}
 
int main()
{
	deste *yeni_deste = yeni_deste_olustur();
	karistir(yeni_deste);
	desteyi_goster(yeni_deste);
    return 0;
}
