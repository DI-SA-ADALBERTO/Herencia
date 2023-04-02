public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Alejandro", "Carranza", "alecarranza@gmail.com", "Conocido en Iguala Gro.",27,"informatica",8.8);

                Teacher teacher1 = new Teacher( "Maria", "Morales", "maria@gmail.com", "Ruffo Figueroa");

       // System.out.println("El nombre del student1 = " + student1.getName() + " " + student1.getLastname());
       // System.out.println("El nombre del teacher1 = " + teacher1. getName() + " " + teacher1.getLastname());

       /* student1.setControlNumber(123456);
        System.out.println("El número de control de " + student1.getName() + " " + student1.getControlNumber());*/


        //Probando la sobre carga de métodos
       /* System.out.println("Método toString() de Student: " + student1.toString());
        System.out.println("Método toString() de Teacher: " + teacher1  .toString());*/
        student1.soy();
        student1.toString();

        System.out.println("");

        teacher1.soy();
        teacher1.toString();

    }
}
