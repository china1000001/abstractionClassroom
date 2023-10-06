public class Cow extends  Animal{
    public Cow() {
    }

    public Cow(String name, String gender, int age, int weight) {
        super(name, gender, age, weight);
    }

    @Override
    public String toString() {
        return "Cow: "+
                super.toString();
    }
}
