public class Cat {

    String name;
    private int age;

    public static void meow(){
        System.out.println("Meow!");
    }

    public int getAge(){
        return age;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
}
