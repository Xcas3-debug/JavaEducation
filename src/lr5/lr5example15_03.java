package lr5;
import java.util.Scanner;

public class lr5example15_03 {
    public static void main(String[] args) {
        Constructor constructor_1 = new Constructor();
        int num1 = 7;
        Constructor constructor_2 = new Constructor(num1);
        int num2 = 9;
        Constructor constructor_3 = new Constructor(num1,num2);
    }
}
class Constructor{

    Constructor(){
        System.out.println("1 экземпляр конструктора");
    }

    Constructor(int num1){
        System.out.println("2 экзембляр конструктора со значением: "+ num1);
    }
    Constructor(int num1, int num2){
        System.out.println("3 экзембляр конструктора со значением: "+ num1 + " " + num2);
    }
}

