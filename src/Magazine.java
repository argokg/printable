public class Magazine implements Printable{

    public String nameMagazine;

    public Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    @Override
    public void print() {
        System.out.println(nameMagazine);

    }

    public static Printable[] printMagazines(Printable[] printableMagazine){
        return printableMagazine;
    }

}
