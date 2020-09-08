#include<iostream>

using namespace std;
 
//*s为字符串，n为字符串的长度
bool IsPalindrome(char *str, int n)
{
	//指向字符串首尾的指针
	char *front = str;
	char *back = str + n - 1;
 
	if(str==NULL||n<1)
	{
		return false;
	}
	while (front<back)
	{
		if (*front != *back)
		{
			return false;
		}
		front++;
		back--;
	}
	
	return true;	
}
 
int main( )
{
	char str[] = "";
	cout << "please, give a string: ";
    cin >> str;
	int n = strlen(str);
	bool sign;
	sign = IsPalindrome(str, n);
	if (sign == true)
	{
		cout << "it is Palindrome"<<endl;
	}
	else
	{
		cout << "it is not Palindrome" << endl;
	}
 
	return 0;
}
