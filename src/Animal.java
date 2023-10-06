public abstract class Animal {
    String name;
    String gender;
    int age;
    int weight;

    public Animal() {
    }

    public Animal(String name, String gender, int age, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "\n"+"name= " + name + "\n" +
                "gender= " + gender + "\n" +
                "age= " + age +"\n"+
                "weight= " + weight+"\n";
    }
}
