public class Main {
    public static void main(String[] args) {
Cow[] cows = {new Cow("mumu","men",3,120),
        new Cow("mumu","men",3,120),
        new Cow("mumu","men",3,120),
        new Cow("mumu","men",3,120),
        new Cow("mumu","men",3,120)};

Sheep[] sheep = {new Sheep("ba","men",4,60),
        new Sheep("ba","men",4,60),
        new Sheep("ba","men",4,60)};

Horse [] horses = {new Horse("bullet","men",5,110)};

        Farm farm= new Farm("hyla",cows,sheep,horses,"nurdolot");

        System.out.println( farm);

        Cow [] cows1 = {new Cow("mumushka","women",2,90)};

        Sheep[] sheep1 = {new Sheep("baba","women",2,50)};

        Horse[] horses1 = {new Horse("sakura","women",4,90)};

        Farm1 farm1 = new Farm1("kochkor-ata",cows1,sheep1,horses1,"nursultan");
        System.out.println(farm1);
    }
}