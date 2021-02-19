#include <iostream>
using namespace std;

int main() 
{
   int a=0,b=0;
  int i,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      if(i>1)
        a=a+2;
    }
    else{b=a/2;
        }
  }
  if(n%2!=0)
  {
    cout<<a;
  }
  else{
    cout<<b;
  }
    return 0;
}