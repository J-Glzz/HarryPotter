public class Prueba{
    public static void main(String[] args) {
       testHJP();
    }
    private static void testHJP(){
        Magos harryPotter = new Magos();
        harryPotter.setNombre("Harry James Potter");
        harryPotter.setSangre("Mestiza");
        harryPotter.setNacionalidad("Britanico");
        harryPotter.setBoggart("Dementor");
        harryPotter.setPatronus("Ciervo");
        harryPotter.setEscuela("Colegio Hogwarts de Magia y Hechiceria");
        harryPotter.setCasa("Gryffindor");
        System.out.println(harryPotter.showMessage());
    }
}
