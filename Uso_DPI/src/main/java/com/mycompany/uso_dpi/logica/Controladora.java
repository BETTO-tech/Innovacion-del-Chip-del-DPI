package com.mycompany.uso_dpi.logica;

import com.mycompany.uso_dpi.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String cui, String nombres, String apellidos, String edad, 
            String fechanac, String sangre, String alergico, String cronica) {
      
        //Creamos paciente y asignamos valores
        Paciente paciente = new Paciente();
        paciente.setCui(cui);
        paciente.setNombres(nombres);
        paciente.setApellidos(apellidos);
        paciente.setEdad(edad);
        paciente.setFechanac(fechanac);
        paciente.setTipo_sangre(sangre);
        paciente.setAlergias(alergico);
        paciente.setCronica(cronica);
        
        controlPersis.guardar(paciente);
    }
}
