public class call_function {
    static int a=10;
    void fun()
    {
    int b=10;
    System.out.println(a+" "+b);
    ++a;  ++b;                  
    }
    public static void main(String[] args){
        call_function A=new call_function();
        A. fun();//first time print 10 10
        A. fun();//2nd time print   11 10, because static variable after giveing output ,it destroy
    }

    }
    

