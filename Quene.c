#include <stdio.h>
#include <conio.h>
#define MAX 50  

struct Quene
{
     int ele[MAX];
    int front ,rear;

}q;

int empty(){
    if (q.rear <q.front)
    return 1;
    else return 0;

}

int full(){
    if (q.rear ==MAX)
    return 1;
    else 
    return 0;

}
 

 void insert (int x){
if (full())
    printf("Quene is full");
    else 
    q.ele[++q.rear]=x;
 }
 int removes (){
    if (empty())
    return -1;
    else 
    return 
    q.ele[q.front++];

 }

void show (){

    int i;
    if (empty ())
    printf("Quene empty");

    else 
    for (i=q.front;i<=q.rear;i++)
    printf(" %d ",q.ele[i]);

}

int main(){

    int ch,x;
    q.rear=-1;
    q.front =0;
    
    do{
        printf("\n Menu\n1.Insert\n2.Remove\n3.show\n4.Exit\n");
        printf("Enter your choice\n");
        scanf(" %d ",&ch);


        switch (ch)
        {
      case 1:printf("Enter elelment");
      scanf(" %d ",&x);
      insert(x);
      break;

      case 2:x=removes();
      if (x== -1)
      printf("Quene is empty");

      else 
      printf(" %d is removed",x);
      break;

      case 3:show();
      break;


      case 4:exit(0);
      break;
        }


    }while (ch != 4);
    {
        return 0;
    }
    
}


