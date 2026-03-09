import com.example.Agenda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AgendaTest {
    @Test
    public void testAgregarTarea() {
        Agenda agenda = new Agenda();
        agenda.agregarTarea("Entregar tarea despliegue");
        assertEquals(1, agenda.totalTareas());
    }

    @Test
    public void testListarTareas() {
        Agenda agenda = new Agenda();
        agenda.agregarTarea("Entregar tarea despliegue");
        agenda.agregarTarea("Practicar consultas");
        assertEquals(2, agenda.listarTareas().size());
    }

    @Test
    public void testMarcarTareaCompletada() {
        Agenda agenda = new Agenda();
        agenda.agregarTarea("Entregar tarea despliegue");
        assertTrue(agenda.marcarTareaCompletada(0));
        assertFalse(agenda.marcarTareaCompletada(1));
    }

    @Test
    public void testEliminarTarea() {
        Agenda agenda = new Agenda();
        agenda.agregarTarea("Entregar tarea despliegue");
        assertTrue(agenda.eliminarTarea(0));
        assertFalse(agenda.eliminarTarea(1));
    }
    

}
