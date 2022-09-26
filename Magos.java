public class Magos {
    private String nombre, sangre, nacionalidad, boggart, patronus, escuela, casa;
    public String getNombre(){
        return nombre;
    }
    public String getSangre(){
        return sangre;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public String getBoggart(){
        return boggart;
    }
    public String getPatronus(){
        return patronus;
    }
    public String getEscuela(){
        return escuela;
    }
    public String getCasa(){
        return casa;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }
        else return false;
    }
    public boolean setSangre(String sangre){
        if(!sangre.isEmpty()){
            this.sangre = sangre;
            return true;
        }
        else return false;
    }
    public boolean setNacionalidad(String nacionalidad){
        if(!nacionalidad.isEmpty()){
            this.nacionalidad = nacionalidad;
            return true;
        }
        else return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }
        else return false;
    }
    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }
        else return false;
    }
    public boolean setEscuela(String escuela){
        if(!escuela.isEmpty()){
            this.escuela = escuela;
            return true;
        }
        else return false;
    }
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }
        else return false;
    }
    public String showMessage(){
        String msj;
        msj = "Nombre: " + nombre +
                "\nSangre: " + sangre +
                "\nNacionalidad: " + nacionalidad +
                "\nBoggart: " + boggart +
                "\nPatronus: " + patronus +
                "\nEscuela: " + escuela +
                "\nCasa: " + casa + "\n";
        return msj;
    }
}
