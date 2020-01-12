package desafio.com;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

     public Aluno(String nome, String sobrenome, Integer codigoAluno){
         this.nome = nome;
         this.sobrenome = sobrenome;
         this.codigoAluno = codigoAluno;

     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
}



//Parte A
//Criar um diagrama de classes que modele a classe Aluno.
// A princípio, umaluno possui um nome ​(String​), um sobrenome ​(String)​ e um código dealuno ​(Integer)​.
// 2.Implementar a classe criando os atributos necessários.
// 3.Criarumconstrutorparaoalunoquetomecomoparâmetroumnome,umsobrenome e um código de aluno.4.
// Um aluno será igual a outro se seus códigos de aluno forem iguais​