#include<iostream>
using namespace std;
int main()
{
  int mil,pet;
  float dis,pdis;
  std::cin>>mil>>pet>>dis;
  pdis=mil*pet;
  if(pdis >= dis)
  {
    std::cout<<"Can reach";
  }
  else
    std::cout<<"Cannot reach";
}