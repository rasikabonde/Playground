#include<iostream>
int main()
{
  int n,count=0,temp;
  std::cin>>n;
  temp=n;
  do
  {
    count++;
    temp/=10;
  } while(temp != 0);      
  std::cout<<count;
  return 0;
}