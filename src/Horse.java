public class Horse extends Animal{
    public Horse() {
    }

    String color;
    public Horse(String name, String gender, int age, int weight) {
        super(name, gender, age, weight);
    } @Override
    public String toString() {
        return "Horse" +"\n"+
                "name= " + name + "\n" +
                "gender= " + gender + "\n" +
                "age= " + age +"\n"+
                "weight= " + weight;
    }
}
