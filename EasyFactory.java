package factory.easy_factory;

import java.util.Scanner;
//简单工厂模式
public class EasyFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EasyFactory easyFactory = new EasyFactory();
        System.out.println("请输入你要购买的电脑名：");
        String name = in.nextLine();
        AllComputers allComputers = ComputerFactory.getInstance(name);
        easyFactory.buyComputer(allComputers);
    }
    public static void buyComputer(AllComputers allComputers){
        allComputers.printComputer();
    }
}

class ComputerFactory{
    public static AllComputers getInstance(String name){
        AllComputers allComputers = null;
        if(name.equals("Dell")){
            allComputers = new Dell();

        }else if(name.equals("Lenovo")){

            allComputers = new Lenovo();

        }else if(name.equals("MacPro")){

            allComputers = new MacPro();

        }else{
            System.out.println("error");
        }
        return allComputers;
    }

}

class Dell implements AllComputers{

    @Override
    public void printComputer() {
        System.out.println("Buy Dell");
    }
}

class Lenovo implements AllComputers{

    @Override
    public void printComputer() {
        System.out.println("Buy Lenovo");
    }
}

class MacPro implements AllComputers{

    @Override
    public void printComputer() {
        System.out.println("Buy MacPro");
    }
}


interface AllComputers{
    void printComputer();
}
