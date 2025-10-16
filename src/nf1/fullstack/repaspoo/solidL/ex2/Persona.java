package nf1.fullstack.repaspoo.solidL.ex2;

/**
 * Exemple per explicar Liskov Principle
 * Persona, Main implementació que viola el principi
 * PersonActions i Main2 és la opció correcte
 */
public class Persona {
    private String nom;

    public Persona(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

class Anglesa extends Persona {
    public Anglesa(String nom) {
        super(nom);
    }

    public void saludar() {
        System.out.println("Hello!");
    }
}

class Catalana extends Persona {
    public Catalana(String nom) {
        super(nom);
    }

    public void saludar() {
        System.out.println("Hola!");
    }
}

class Main {
    public static void main(String[] args) {
        Persona p = new Anglesa("Peter");
        Persona p2 = new Catalana("Jordi");
        salutacions(p);
        salutacions(p2);
    }

    public static void salutacions(Persona persona) {

        if(persona instanceof Anglesa){
            Anglesa a = (Anglesa) persona;
            a.saludar();
        }
        if(persona instanceof Catalana) {
            Catalana c = (Catalana) persona;
            c.saludar();
        }
    }
}