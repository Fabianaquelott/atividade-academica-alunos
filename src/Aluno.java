public class Aluno {

    public Aluno(String nome, Integer matricula, Integer idade, String endereco){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.endereco = endereco;

    }

    private String nome;
    private Integer matricula;
    private Integer idade;
    private String endereco;

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public Integer getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
}
