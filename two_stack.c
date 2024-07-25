#include <stdio.h>
#include <conio.h>
#define MAX 50

struct stack {
    int ele[MAX];
    int tos1;
    int tos2;
} s;

int empty1() {
    if (s.tos1 == -1)
        return 1;
    else
        return 0;
}

int empty2() {
    if (s.tos2 == MAX)
        return 1;
    else
        return 0;
}

int full() {
    if (s.tos1 == s.tos2 - 1)
        return 1;
    else
        return 0;
}

void push1(int x) {
    if (full())
        printf("Stack is full\n");
    else
        s.ele[++s.tos1] = x;
}

void push2(int x) {
    if (full())
        printf("Stack is full\n");
    else
        s.ele[--s.tos2] = x;
}

int pop1() {
    if (empty1())
        return -1;
    else
        return s.ele[s.tos1--];
}

int pop2() {
    if (empty2())
        return -1;
    else
        return s.ele[s.tos2++];
}

void show() {
    if (empty1())
        printf("Stack 1 is empty\n");
    else {
        printf("Stack 1 elements: ");
        for (int i = 0; i <= s.tos1; i++)
            printf("%d ", s.ele[i]);
        printf("\n");
    }

    if (empty2())
        printf("Stack 2 is empty\n");
    else {
        printf("Stack 2 elements: ");
        for (int i = MAX - 1; i >= s.tos2; i--)
            printf("%d ", s.ele[i]);
        printf("\n");
    }
}

int main() {
    int ch, x1, x2;
    s.tos1 = -1;
    s.tos2 = MAX;

    do {
        printf("\n 1.push1\n 2.push2\n 3.pop1\n 4.pop2\n 5.show\n 6.exit\n ");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch) {
        case 1:
            printf("Enter element: ");
            scanf("%d", &x1);
            push1(x1);
            break;

        case 2:
            printf("Enter element: ");
            scanf("%d", &x2);
            push2(x2);
            break;

        case 3:
            x1 = pop1();
            if (x1 == -1)
                printf("Stack 1 is empty\n");
            else
                printf("%d is removed from Stack 1\n", x1);
            break;

        case 4:
            x2 = pop2();
            if (x2 == -1)
                printf("Stack 2 is empty\n");
            else
                printf("%d is removed from Stack 2\n", x2);
            break;

        case 5:
            show();
            break;

        case 6:
            exit(0);
        }
    } while (ch != 6);
    return 0;
}