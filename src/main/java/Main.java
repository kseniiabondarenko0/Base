public class Main {

    public static void main(String[] args) {
        System.out.println(task1(1));
        System.out.println(task1(0));
        System.out.println(task1(-3));

        System.out.println(task2(1));
        System.out.println(task2(0));
        System.out.println(task2(-3));

        System.out.println(task3(1));
        System.out.println(task3(0));
        System.out.println(task3(-3));

        System.out.println(task4(1));
        System.out.println(task4(0));
        System.out.println(task4(-3));

        System.out.println(task5(1));
        System.out.println(task5(0));
        System.out.println(task5(-3));

        System.out.println(task6(1));
        System.out.println(task6(0));
        System.out.println(task6(-3));

        System.out.println(task7("test"));
        System.out.println(task7("тест"));
        System.out.println(task7("3"));

        System.out.println(task8("1"));
        System.out.println(task8("1"));
        System.out.println(task8("3"));

        System.out.println(task9(true));
        System.out.println(task9(false));

    }

    public static String task1(int a){
        if (a==0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task2(int a){
        if (a>0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task3(int a){
        if (a<0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task4(int a){
        if (a>=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task5(int a){
        if (a<=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task6(int a){
        if (a!=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task7(String a){
        if (a.equals("test"))
            return "Right";
        else
            return "Wrong";
    }

    public static String task8(String a){
        if (a.equals("1"))
            return "Right";
        else
            return "Wrong";
    }

    public static String task9(boolean test){
        if (test==true)
            return "Right";
        else
            return "Wrong";
    }


}