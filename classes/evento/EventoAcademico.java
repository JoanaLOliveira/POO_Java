package classes.evento;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento(){
        System.out.println("nome do evento: " + nomeDoEvento);
        System.out.println("local do evento: " + localDoEvento);
        System.out.println("numero de participantes: " + numeroDeParticipantes);
    }
}
