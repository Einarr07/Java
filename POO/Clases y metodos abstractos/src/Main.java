public class Main {
    public static void main(String[] args) {
        //SerVivo SER = new SerVivo(); Como ser vivo es abstracto no se pueden crear objetos de dicha clase
        Planta girasol = new Planta();

        girasol.alimentarse();

        AnimalCarnivoro leon = new AnimalCarnivoro();

        leon.alimentarse();

        AnimalHerbivoro vaca = new AnimalHerbivoro();

        vaca.alimentarse();
    }
}