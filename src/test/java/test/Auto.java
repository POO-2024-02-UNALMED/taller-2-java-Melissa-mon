package test;

public class Auto {
    String modelo;
    Integer precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    Integer registro;
    static int cantidadCreados;//int o string?

    public int cantidadAsientos() {
        int numAsientos = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                numAsientos++;
            }
        }
        return numAsientos;
    }
    String verificarIntegridad() {
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";

    }
}
