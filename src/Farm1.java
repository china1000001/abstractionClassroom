import java.util.Arrays;

public class Farm1 { String adress;
    Cow [] cows;
    Sheep [] sheeps;
    Horse [] horses;
    String ownerName;

    public Farm1() {
    }

    public Farm1(String adress, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm" +"\n"+
                "adress=" + adress + "\n" +
                "cows=" + Arrays.toString(cows) +"\n"+
                "sheeps=" + Arrays.toString(sheeps) +"\n"+
                "horses=" + Arrays.toString(horses) +"\n"+
                "ownerName=" + ownerName+"\n"
                ;
    }
}
