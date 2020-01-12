package desafio.com;

public class Principal {

    public static void main(String[] args) {
        DigitalHouseManager digitalH = new DigitalHouseManager();

        //Registrar Professores Titulares/Adjunto
        digitalH.registrarProfessorTitular("Ana", "Souza", 01, "Java");
        digitalH.registrarProfessorTitular("Luiz", "Augusto", 02, "Kotlin");
        digitalH.registrarProfessorAdjunto("Paulo", "Silva", 03, 32);
        digitalH.registrarProfessorAdjunto("Mariana", "Brito", 04, 36);

        //Registrar 2 cursos
        digitalH.registrarCurso("Full stack", 20001, 3);
        digitalH.registrarCurso("Android", 20002, 2);

        //Alocar Professor Titular/Adjunto
        digitalH.alocarProfessores(20001, 01, 03);
        digitalH.alocarProfessores(20002, 02, 04);


        //Gerar alunos
        digitalH.registrarAluno("Alfredo", "Gomes", 01);
        digitalH.registrarAluno("Paula","Oliveira", 02);
        digitalH.registrarAluno("Luciana", "Pereira", 03);
        digitalH.registrarAluno("Felipe", "Araujo", 04);
        digitalH.registrarAluno("Fabiana", "Netto", 05);


        //Matricular 2 alunos curso Full Stack
        digitalH.matricularAluno(01, 20001);
        digitalH.matricularAluno(02, 20001);

        //Matricular 3 alunos curso Android
        digitalH.matricularAluno(03, 20002);
        digitalH.matricularAluno(04, 20002);
        digitalH.matricularAluno(05, 20002);


    }
}
