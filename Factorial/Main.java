#include<iostream>
int main()
{
  int f=1,a=1,i,n;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    f=f*i;
    a++;}
    std::cout<<"The factorial of "<<n<<" is "<<f;
}