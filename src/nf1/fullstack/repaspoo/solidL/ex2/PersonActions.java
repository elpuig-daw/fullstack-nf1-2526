package nf1.fullstack.repaspoo.solidL.ex2;

public interface PersonActions {
    void saludar();
}


class Catala2 extends Persona implements PersonActions {

    public Catala2(String nom) {
        super(nom);
    }

    @Override
    public void saludar() {
        System.out.printf("%s: Hola!%n",getNom());
    }
}

class Angles2 extends Persona implements PersonActions {

    public Angles2(String nom) {
        super(nom);
    }

    @Override
    public void saludar() {
        System.out.printf("%s: Hello!%n",getNom());
    }
}

class Main2 {
    public static void main(String[] args) {
        PersonActions a = new Catala2("Jordi");
        PersonActions b = new Angles2("Peter");
        salutacions(a);
        salutacions(b);
    }

    public static void salutacions(PersonActions person) {
        person.saludar();
    }

}
