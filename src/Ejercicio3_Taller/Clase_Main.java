
package Ejercicio3_Taller;

public class Clase_Main {
    
    public static void main(String[] args) {
        // Creé el objeto Medicamento con los valores específicos que representan sus características
        Clase_Medicamento medicamento = new Clase_Medicamento("Aspirina", "Bayer", "Oral");
        
        // Creé la posología del medicamento para un grupo de usuarios específico
        Clase_Medicamento.Posologia posologia = medicamento.new Posologia("Adultos y mayores de 16 años", 500, "6 horas", "No debe tomar este medicamento con el estómago vacío");
        
        // Llamé al método para mostrar los atributos del medicamento
        medicamento.mostrarMedicamento(); // Mostré los atributos del medicamento
        posologia.mostrarPosologia(); // Mostré la posología del medicamento
    }
    
}
