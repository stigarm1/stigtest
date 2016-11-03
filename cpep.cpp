// C++ tester

// SEN KOLL MED const i min(..), cppcon sutter
#include ....
int min(int x,int y)
{return (x<y):x?y;}

int main(void)
{ int& a=5;
  int& b=7;
  int& f=min(a,b);
  cout<<"f="<<f;
  return 0;
}
