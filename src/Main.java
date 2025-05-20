import main.java.domain.model.Paciente;
import main.java.domain.service.AvatarMedico;


public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Maria Silva", 75, "5511999999999");
        paciente.setDeficienciaVisual(true);

        AvatarMedico avatarMedico = new AvatarMedico();
        avatarMedico.iniciarSaudacao(paciente);
    }
}