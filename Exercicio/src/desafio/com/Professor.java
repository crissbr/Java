package desafio.com;

public class Professor {

    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;

    public Professor(String nomeProfessor, String sobrenomeProfessor, Integer tempoDeCasa, Integer codigoProfessor){
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;

    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}


//Criar um diagrama de classes que modele a classe Professor.
// A princípio,um professor possui um nome ​(String)​, um sobrenome ​(String)​, um tempode casa ​(Integer)​ e um código de professor ​(Integer)​.
// 2.Implementar a classe criando os atributos necessários.
// 3.Criar os getters e setters para os atributos anteriores.
// 4.Um professor será igual a outro se seus códigos de professor forem iguais