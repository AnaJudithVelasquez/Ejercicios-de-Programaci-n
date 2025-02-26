public class Cuenta {
 
   
    String titular;
    double total = 5000; 
    double cantidad;

    
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0; 
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
    public double consulta() {
        return total;
    }

   
    public void ingresar(double cantidad) {
        if (cantidad > 0) { 
            total += cantidad;
        }
    }

    
    public void retirar(double cantidad) {
        if (cantidad > 0) { 
            if (total - cantidad < 0) {
                total = 0; 
            } else {
                total -= cantidad;
            }
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo total: $" + consulta()); 
    }

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jairo Pérez");
        Cuenta cuenta2 = new Cuenta("Lucia López", 2000);

        cuenta1.ingresar(1500);
        cuenta1.retirar(000);

        cuenta2.ingresar(-500); 
        cuenta2.retirar(2500); 

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}


  