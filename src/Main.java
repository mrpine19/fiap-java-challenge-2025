import main.java.domain.controller.TestDrive;
import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Maria Silva", 50, "5511999999999");
        paciente.setDeficienciaVisual(true);
        paciente.setDeficienciaAuditiva(false);

        Consulta consulta = new Consulta("João Carlos", "Cardiologia", LocalDateTime.now().plusDays(1));

        // Criar e executar Test Drive
        TestDrive testDrive = new TestDrive(paciente, consulta);

        testDrive.getCuidadorService().cadastrarCuidador("Albertinho Matos");
        testDrive.iniciarSimulacao();
    }
}