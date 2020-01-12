package desafio.com;

public class ProfessorTitular extends Professor {
    private  String especialidade;

    public ProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer tempoDecasa, String especialidade){
        super(nomeProfessor, sobrenomeProfessor, tempoDecasa, codigoProfessor);
        this.especialidade = especialidade;
    }


}
