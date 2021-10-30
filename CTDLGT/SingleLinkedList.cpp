#include<stdio.h>
#include <iostream>
#include <string.h>

using namespace std;
struct Node
{
    int data;
    Node *next;
};

int main()
{
	Node *head = new Node();
	head->data=1;
	head->next=NULL;
	
	Node *second = new Node();
	second ->next=NULL;
	second->data=2;

	Node *third = new Node();
	third ->next=NULL;
	third->data=3;
	

	// liên kết các node lại với nhau

	head->next = second;
	second->next = third;

	// truy cập vào phần tử
	//head
	int data = head->data;
	cout<<data<<endl;

    return 0;
}
