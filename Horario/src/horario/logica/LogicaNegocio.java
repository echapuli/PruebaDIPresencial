/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.logica;

import horario.dto.Hora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class LogicaNegocio {
    private static List<Hora> listaHoras=new ArrayList<>();

    public static void anadirHora(Hora contacto){
        listaHoras.add(contacto);
    }

    public static List<Hora> getListaHoras() {
        return listaHoras;
    }

}
