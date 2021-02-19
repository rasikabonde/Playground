#include<iostream> 
using namespace std; 
  
int main() 
{ 
    int n,a1=0,a2=1,nt=0,i;
  cin>>n;
  if(n==0 || n==1)
    cout<<n;
  else
    nt=a1+a2;
  for(i=3;i<=n;++i)
  {
    a1=a2;
    a2=nt;
    nt=a1+a2;
  }
  cout<<a2;
}