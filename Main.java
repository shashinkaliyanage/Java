
//default constructor

class Test{
   int a,b;
   Test(){
      System.out.println("default constructor");
      a=10;
      b=20;
   }

   void disp(){
      System.out.println("value of A="+ a);
      System.out.println("value of B="+ b);
   }
}

class Main{
    public static void main(String args[]){
	Test obj = new Test();
        obj.disp();
    }
}
