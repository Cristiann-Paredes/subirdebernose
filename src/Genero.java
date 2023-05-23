public class Genero {
    String tipo;
    String ritmo;
    int anio;
    String pais;

    String festival;
//Constructores generados
    //la direccion de memoria inicializa es un constructor


    public Genero(String tipo, String ritmo, int anio, String pais, String festival) {
        this.tipo = tipo;
        this.ritmo = ritmo;
        this.anio = anio;
        this.pais = pais;
        this.festival = festival;
    }

    // generamos getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public void imprimirDatos(){
        System.out.println(this.tipo);
        System.out.println(this.ritmo);
        System.out.println(this.anio);
        System.out.println(this.festival);
    }


}
