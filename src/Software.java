public class Software {

    public Software(){}

    private Aluno[] listaAluno = new Aluno[10];
    private int primeiro = 0;
    private int ultimo = 0;

    public void limpar(){
        this.primeiro = 0;
        this.ultimo = 0;
        listaAluno = new Aluno[10];
    }

    public void inserir(Aluno aluno){
        if(ultimo >= 10){
            System.out.println("Sala cheia.");
        }
        else{
            this.listaAluno[ultimo] = aluno;
            this.ultimo +=1;
        }
    }

    public void remove(Integer matricula){
        for(int i = 0; i < this.listaAluno.length; i++){
            if(this.listaAluno[i].getMatricula() == matricula && this.primeiro != this.ultimo){
                this.listaAluno[i] = null;
                for(int j = i;j < this.listaAluno.length - 1;j++){
                    this.listaAluno[j] = this.listaAluno[j+1];
                }
                this.ultimo -=1;
            }
        }
    }

    public boolean vazio(){
        return primeiro == ultimo;
    }

    public void imprime(){
        for(int i=0; i<ultimo; i++){
            System.out.println(listaAluno[i].toString());
        }
    }

    public void mediaIdade(Integer idade, Aluno[]alunos){
        for (int i = 0; i != alunos.length; i++)
        {
           Integer media = idade / alunos.length;
            System.out.println("A média de idade é de ".concat(media.toString()));
        }
    }
    }

