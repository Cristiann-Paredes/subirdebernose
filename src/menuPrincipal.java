import java.util.Scanner;
public class menuPrincipal {
    public static void main (String[] args) {
        //Primer objeto
        Genero rock = new Genero("rock", "120bpm", 1950, "EEUU", "Chuck Berry");
        //segundo objeto
        Genero salsa = new Genero("Pop", "90bpm", 2001, "Colombia", "Maelo Ruiz");

        Genero reggae = new Genero("Reggae", "50bpm", 1968, "Jamaica", "Bob Marley");
        Genero genero1 = new Genero(
                "",
                "",
                2010,
                " ",
                " ");

        System.out.println("Bienvenido al menu principal: ");


        System.out.println("Año rock:"+rock.getAnio());
        System.out.println("Año salsa:"+salsa.getAnio());
        System.out.println("Año regue:"+reggae.getAnio());

int aniorock;

        System.out.println(" Ingrese el año del rock ");
       
        rock.setAnio(aniorock);
        System.out.println("Escoja una opcion:");


        reggae.imprimirDatos();
        }

    }