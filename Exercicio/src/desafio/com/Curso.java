package desafio.com;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer qtdeMaximaAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private Integer qtdeTotalAlunos;


    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Curso (String nomeCurso, Integer codigoCurso, Integer qtdeMaximaAlunos ){
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Boolean adicionarUmAluno (Aluno umAluno){
     if(qtdeMaximaAlunos< qtdeTotalAlunos) {
         System.out.println("Aluno matriculado no curso!");
         listaAlunos.add(umAluno);
         qtdeMaximaAlunos++;
         return true;
     }else {
         System.out.println("Não há vaga no curso!");
         return false;
     }
}
        public void excluirAluno (Aluno umAluno){
         listaAlunos.remove(umAluno);
            System.out.println("Aluno removido com sucesso!");

        }

    public void setProfessorAdjunto(Professor professor) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setProfessorTitular(Professor professor) {
        this.professorTitular = professorTitular;
    }
}






//Parte B
//Criar um diagrama de classes que modele a classe Curso.
// A princípio, umcurso possui um nome ​(String)​ e um código de curso ​(Integer)​.
// 2.Implementar a classe criando os atributos necessários.3.Criar os getters e setters para os atributos anteriores.
// 4.Um curso será igual a outro se seus códigos de curso forem iguais.