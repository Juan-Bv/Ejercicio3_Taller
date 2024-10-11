package Ejercicio3_Taller;

public class Clase_Medicamento {

    private String nombreMedicamento; // Creé esta variable para almacenar el nombre del medicamento
    private String fabricanteMedicamento; // Creé esta variable para almacenar el fabricante del medicamento
    private String viaAdministracion; // Creé esta variable para almacenar la vía de administración del medicamento

    // Constructor que inicializa los atributos del medicamento
    public Clase_Medicamento(String nombreMedicamento, String fabricanteMedicamento, String viaAdministracion) {
        this.nombreMedicamento = nombreMedicamento; // Asigné el nombre del medicamento
        this.fabricanteMedicamento = fabricanteMedicamento; // Asigné el fabricante del medicamento
        this.viaAdministracion = viaAdministracion; // Asigné la vía de administración
    }

    // Profesor, creé una clase interna Posologia que define la dosificación y recomendaciones para el medicamento
    public class Posologia {

        private String grupoUsuarios; // Creé esta variable para almacenar los usuarios que pueden tomar el medicamento
        private int dosis; // Creé esta variable para almacenar la dosis recomendada en mg
        private String periodo; // Creé esta variable para almacenar el periodo de administración
        private String recomendaciones; // Creé esta variable para almacenar las recomendaciones sobre el medicamento

        // Creé un constructor para Posologia que inicializa los atributos
        public Posologia(String grupoUsuarios, int dosis, String periodo, String recomendaciones) {
            this.grupoUsuarios = grupoUsuarios; // Asigné los grupos de usuarios
            this.dosis = dosis; // Asigné la dosis recomendada
            this.periodo = periodo; // Asigné el periodo de administración
            this.recomendaciones = recomendaciones; // Asigné las recomendaciones
        }

        // Método que muestra la posología del medicamento
        public void mostrarPosologia() {
            /*
               Profesor, en este método mostré cada atributo de la posología del medicamento.
               Incluí los grupos de usuarios, la dosis, el periodo de administración y las recomendaciones.
             */
            System.out.println("Usuarios: " + grupoUsuarios); // Imprimí los grupos de usuarios
            System.out.println("Dosis: " + dosis + " mg"); // Imprimí la dosis recomendada
            System.out.println("Periodo: " + periodo); // Imprimí el periodo de administración
            System.out.println("Recomendaciones: " + recomendaciones); // Imprimí las recomendaciones
        }
    }

    // Cree un método que muestra los atributos del medicamento
    public void mostrarMedicamento() {
        /*
           Profesor, en este método muestra los atributos del medicamento, incluyendo su nombre,
           fabricante y vía de administración. Esto ayuda a tener un resumen completo del medicamento.
         */
        System.out.println("Nombre del medicamento = " + nombreMedicamento); // Imprimí el nombre del medicamento
        System.out.println("Fabricante del medicamento = " + fabricanteMedicamento); // Imprimí el fabricante del medicamento
        System.out.println("Vía de administración = " + viaAdministracion); // Imprimí la vía de administración
    }

}
