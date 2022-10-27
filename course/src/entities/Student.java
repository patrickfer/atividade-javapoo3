package entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;


    public double notafinal() {
            return nota1 + nota2 + nota3;
    }

    public double restpontos() {
            if (notafinal() < 60) {
                return 60.00 - notafinal();
            }
            else {
                return 0.0;
            }

    }


}