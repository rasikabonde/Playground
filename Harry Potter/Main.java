#include<iostream>
using namespace std;
int main()
{
 int n,first,last,sum;
std::cin>>n;
first = n%10;
last=n / 1000;
sum=first+last;
std::cout<<sum;
}