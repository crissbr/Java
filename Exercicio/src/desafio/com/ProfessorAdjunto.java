package desafio.com;

public class ProfessorAdjunto extends Professor {
       private Integer horasdeMonitoria;

    public ProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer tempoDeCasa, Integer codigoProfessor, Integer horasdeMonitoria){
        super(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor);
        this.horasdeMonitoria = horasdeMonitoria;
    }
}
