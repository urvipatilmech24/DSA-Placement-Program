public class ScopeEx {
    int instanceVar =100;
    static int staticVar =20;
    int localVar = 50;
    public static void main(String[] args){
    
    ScopeEx obj = new ScopeEx();
    System.out.println("Instance variable (via object): "+ obj.instanceVar);
    obj.showAll();
    }

    void showAll(){
        int methodLocal =300;
        System.out.println("Inside showAll():");
        System.out.println("Static variable: "+ staticVar);
        System.out.println("Instance variable: "+ instanceVar);
        System.out.println("Method local: "+ methodLocal);
    }

    public void Show(){
        System.out.println("Local variable: "+ localVar);
        System.out.println("Static variable: "+ staticVar);
    }
}

