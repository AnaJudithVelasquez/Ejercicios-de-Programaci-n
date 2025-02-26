public class Vehículo {
    
     String empresaPropietaria;
     int numPasajeros;
     int capacidadCombustible;
     int consumoPorGalon;

   
    public Vehículo(String empresaPropietaria, int numPasajeros, int capacidadCombustible, int consumoPorGalon) {
        this.empresaPropietaria = empresaPropietaria;
        this.numPasajeros = numPasajeros;
        this.capacidadCombustible = capacidadCombustible;
        this.consumoPorGalon = consumoPorGalon;
    }

    
    public int calcularRango() {
        return capacidadCombustible * consumoPorGalon;
    }

  
    public void mostrarInformacion(String tipoVehiculo) {
        System.out.println("La " + tipoVehiculo + " de la empresa " + empresaPropietaria + 
                           " puede llevar " + numPasajeros + " pasajeros con un rango de " + calcularRango() + " millas");
    }

  
    public static void main(String[] args) {
       
        Vehículo minivan = new Vehículo("Cootranar", 11, 29, 22);
        Vehículo duobus = new Vehículo("Trans Arauca", 40, 28, 35);

       
        minivan.mostrarInformacion("Minivan");
        duobus.mostrarInformacion("Duobus");
    }
}