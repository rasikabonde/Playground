#include<iostream>
using namespace std;
int main()
{
  int fs,fd,fsh,ss,sd,ssh,as,ad,ash;
  int d1,t1,d2,t2,d3,t3;
  std::cin>>fs>>fd>>fsh;
  std::cin>>ss>>sd>>ssh;
  std::cin>>as>>ad>>ash;
  d1=(fs*fd)/100;
  t1=fs-d1+fsh;
  std::cout<<"In Flipkart Rs."<<t1;
  d2=(ss*sd)/100;
  t2=ss-d2+ssh;
  std::cout<<"\nIn Snapdeal Rs."<<t2;
  d3=(as*ad)/100;
  t3=as-d3+ash;
  std::cout<<"\nIn Amazon Rs."<<t3;
  
  if(t1 <= t2 && t1<=t3)
  {
    std::cout<<"\nHe will prefer Flipkart";
  }
  else if(t2 <= t3 && t2 <= t1)
  {
    std::cout<<"\nHe will prefer Snapdeal";
  }
  else
  {
    std::cout<<"\nHe will prefer Amazon";
  }
}