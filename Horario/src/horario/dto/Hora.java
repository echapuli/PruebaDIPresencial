/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.dto;

/**
 *
 * @author eduar
 */
public class Hora {

    private String dia;
    private String hora;
    private String modulo;

    public Hora(String dia, String hora, String modulo) {
        this.dia = dia;
        this.hora = hora;
        this.modulo = modulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String[] contactoArray() {
        String[] hora = new String[3];
        hora[0] = dia;
        hora[1] = this.hora;
        hora[2] = modulo;
        return hora;
    }

    public String lineaFichero() {
        return dia + ';' + hora + ';' + modulo;
    }

}
