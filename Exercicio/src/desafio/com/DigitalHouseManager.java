package desafio.com;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunosDh = new ArrayList<>();
    private List<Professor> listaProfessoresDh = new ArrayList<>();
    private List<Curso> listaCursosDh = new ArrayList<>();
    private List<Matricula> listaMatriculaDh = new ArrayList<>();

    //1
    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdeMaximaAlunos) {
        Curso curso = new Curso(nome, codigoCurso, qtdeMaximaAlunos);
        listaCursosDh.add(curso);
        System.out.println("Curso criado no Sistema!");
    }

    //2
    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaCursosDh.size(); i++) {
            if (codigoCurso == listaCursosDh.get(i).getCodigoCurso()) {
                listaCursosDh.remove(listaCursosDh.get(i));
                System.out.println("Curso excluído do Sistema!");
            }
        }
    }

    //3
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras);
        listaProfessoresDh.add(professorAdjunto);
        System.out.println("Professor adicionado a lista de Professores!");
    }

    //4
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade);
        listaProfessoresDh.add(professorTitular);
        System.out.println("Professor adicionado a lista de Professores!");
    }

    //5
    public void excluirProfessor(Integer codigoProfessor){
        for (int i = 0; i < listaProfessoresDh.size(); i++) {
            if (codigoProfessor == listaProfessoresDh.get(i).getCodigoProfessor()) {
                listaProfessoresDh.remove(listaProfessoresDh.get(i));
                System.out.println("Professor excluído com sucesso!");
            }
        }
    }

    //6 Gerar Aluno
    public void registrarAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunosDh.add(aluno);

    }

    //7
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        int sistema1 = 0;
        int sistema2 = 0;
        for (int i = 0; i < listaCursosDh.size(); i++) {
            if (listaCursosDh.get(i).getCodigoCurso().equals(codigoCurso)) {
                for (int i1 = 0; i1 < listaAlunosDh.size(); i1++) {
                    if (listaAlunosDh.get(i1).getCodigoAluno().equals(codigoAluno)) {

                        sistema2 = 1;
                        if (listaCursosDh.get(i).adicionarUmAluno(listaAlunosDh.get(i1))){
                            Matricula matricula = new Matricula(listaAlunosDh.get(i1), listaCursosDh.get(i));
                            listaMatriculaDh.add(matricula);
                        }
                    }
                }
            }
        }
        if (sistema1 == 0) {
            System.out.println("Curso não disponível no sistema!");
        }
        if (sistema1 == 1 && sistema2 == 0) {
            System.out.println(" Matricular aluno no sistema!");
        }
    }

    //8
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        for (int i = 0; i < listaCursosDh.size(); i++) {
            if (listaCursosDh.get(i).getCodigoCurso() == codigoCurso) {
                for (int i1 = 0; i1 < listaProfessoresDh.size(); i1++) {
                    if (listaProfessoresDh.get(i1).getCodigoProfessor() == codigoProfessorAdjunto) {
                        listaCursosDh.get(i).setProfessorAdjunto(listaProfessoresDh.get(i1));
                        System.out.println("Professor Adjunto alocado ao curso! ");
                    }
                    if (listaProfessoresDh.get(i1).getCodigoProfessor() == codigoProfessorTitular) {
                        listaCursosDh.get(i).setProfessorTitular(listaProfessoresDh.get(i1));
                        System.out.println("Professor Titular alocado ao curso! ");
                    }
                }
            } else {
                System.out.println("O curso não existe! ");
            }
        }
    }
    public void imprimirDados(){
        System.out.println(listaProfessoresDh);
        System.out.println(listaMatriculaDh);
        System.out.println(listaCursosDh);
        System.out.println(listaAlunosDh);
    }
}