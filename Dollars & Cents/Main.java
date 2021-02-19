#include<iostream>
#include <iomanip>  
using namespace std;
int main()
{
 int a,b,c,d;
 float x,y,z,o;
 cin>>a>>b>>c>>d;
 do
 {
   x= (a+c);
   y= (b*.01)+(d*.01);
   z=x+y;
   cout<<(int)z<<"\n";
   o=(z-(int)z)*100;
   cout<<fixed<<setprecision(0)<<o;
 }while(a<0);
 return 0;
}