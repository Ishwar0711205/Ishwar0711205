#include <stdio.h>
#include <conio.h>
#define MAX 50

struct stack
{
    int ele[MAX];
    int tos;

} s;

int empty()
{
    if (s.tos == -1)
        return 1;

    else
        return 0;
}
int full()
{

    if (s.tos == MAX - 1)
        return 1;

    else
        return 0;
}

void push(int x)
{

    if (full())
        printf("Stack is full\n");
    else
        s.ele[++s.tos] = x;
}
int pop()
{
    if (empty())
        return -1;

    else
        return s.ele[s.tos--];
}

void show()
{
    int i;
    if (empty())
        printf("Stack is empty\n");

    else
        for (i = 0; i <= s.tos; i++)
            printf("%d", s.ele[i]);
}


int main(){

int ch,x;
s.tos =-1;

do{

    printf("\n Menu 1.Push\n  2.Pop\n 3.Show\n 4.Exit\n");
    printf("Enter your choice ");

    scanf("\n %d ",&ch);

    switch(ch){

        case 1 :printf("Enter elememts");
        scanf("\n %d ",&x);
        push(x);
        break;
     

     case 2:
                x =pop();
                if(x==-1)
                printf("stack empty ");

                else 
                printf("%d is removed ");
                break;  


                case 3 :
                        show();
                        break;
                case 4: exit(0);
                
                }
            }

        while(ch =4);
        //return 0;
        getch();
        return 0;
}

    
    


