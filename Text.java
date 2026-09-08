public class Text {
    Text(){
        System.out.println("A");
    }
int a = 10;
    {
        System.out.println("B");
    }

    static{
        System.out.println("C");
    }

    public static void main(String[] args){
        Text t =new Text();
    }
}
