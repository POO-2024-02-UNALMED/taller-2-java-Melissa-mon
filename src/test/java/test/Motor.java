package test;

public class Motor {
    Integer numeroCilindros;
    String tipo;
    Integer registro;

    void cambiarRegistro(int nuevoRegistro){
        this.registro = nuevoRegistro;
    }
    void asignarTipo(String nuevoTipo){
        if (nuevoTipo == ("electrico")){
            this.tipo = "electrico";
        }
        if (nuevoTipo == ("gasolina")){
            this.tipo = "gasolina";
        }
    }
}