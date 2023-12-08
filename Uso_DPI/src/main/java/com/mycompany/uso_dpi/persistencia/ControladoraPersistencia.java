package com.mycompany.uso_dpi.persistencia;

import com.mycompany.uso_dpi.logica.Paciente;

public class ControladoraPersistencia {
    PacienteJpaController pacienteJpa = new PacienteJpaController();

    public void guardar(Paciente paciente) {
        
        //Crear en la BD el paciente
        pacienteJpa.create(paciente);
        
    }
}
