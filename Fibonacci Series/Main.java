#include<iostream>
using namespace std;
int main()
{
    int n, a1 = 0, b2 = 1, nt = 0, i;
    cin >> n;
  cout<<"The term "<<n<<" in the fibonacci series is ";
    if(n == 0 || n == 1) 
        cout << n; 
    else
        nt = a1 + b2;
    for (i = 3; i <= n; ++i)
    {
        a1 = b2;
        b2 = nt;
        nt = a1 + b2;
    }
    cout <<b2;
}
