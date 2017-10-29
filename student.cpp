#include<iostream>
using namespace std;
class student
{
	private:
		
	char name[20],USN[10],branch[10];
	int sem;
	public:
		void input();
		void display();
			
		
};
void student::input()
{
	cout<<"Enter Name";
	cin>>name;
	cout<<"Enter USN";
	cin>>USN;
	cout<<"Enter Branch";
	cin>>branch;
	cout<<"Enter Sem";
	cin>>sem;
}
void student::display()
{
	cout<<"Enter the Name:"<<name;
	cout<<"USN:"<<USN;
	cout<<"Branch:"<<branch;
	cout<<"Sem:"<<sem;
}
class faculty
{
private:
		
	char name[20],id[10];
	
	public:
		void input();
		void display();
};

void faculty::input()
{
	cout<<"Enter faculty Name";
	cin>>name;
	cout<<"Enter ID";
	cin>>id;
	
}
void faculty::display(){
	cout<<"\nname:"<<name;
	cout<<"\nID"<<id;


}
class dept{
private:
	char name[20],coursesoffered[20];
	public:
	void input();
	void display();
};
void dept::input(){
	cout<<"Enter the Dept-Name";
	cin>>name;
	cout<<"courses offered";
	cin>>coursesoffered;
}
void dept::display(){
cout<<"dept name is "<<name;
cout <<"offered courses are:"<<coursesoffered;
}
int main()
{
	student s;
	dept d;
	faculty f;
	s.input();
	s.display();
	f.input();
	f.display();
	d.input();
	d.display();
}
