package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/

        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidados.length){
            String candidato = candidados[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
            }else{
                System.out.println("O Candidato " + candidato + " nao foi selecionado para vaga");
            }
            System.out.println("----------------------------------------------------------------------------");
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com outra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
