import java.util.Arrays;

class Turma{
    private int numero;
    private String professor;
    private int vagas;
    private Aluno[] alunos;
    private int qtdadeAlunos;

    public Turma(int nro,String nomeProf,int vagas){
        if (nro<=0 || nomeProf.length() < 2 || vagas <=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.numero = nro;
        this.professor = nomeProf;
        this.vagas = vagas;
        this.alunos = new Aluno[vagas];
        this.qtdadeAlunos = 0;
    }

    public int getNroTurma(){
        return numero;
    }

    public String getNomeProfessor(){
        return professor;
    }

    public void novoAluno(Aluno aluno){
        if (qtdadeAlunos == vagas){
            throw new IllegalStateException("Turma cheia!");
        }
        alunos[qtdadeAlunos] = aluno;
        qtdadeAlunos++;
    }

    public Aluno recuperaAlunoPorMatricula(long matricula){
        for(int i=0;i<qtdadeAlunos;i++){
            if (alunos[i].getMatricula() == matricula){
                return alunos[i];
            }
        }
        return null;
    }

    public void informaNota(long matricula, int nroNota, float nota){
        Aluno aluno = recuperaAlunoPorMatricula(matricula);
        if (aluno == null) throw new IllegalArgumentException("Aluno inexistente");
        aluno.setNota(nroNota, nota);
    }

    public Aluno[] getAlunos(){
        return Arrays.copyOf(alunos,qtdadeAlunos);
    }

    public Aluno[] aprovados(){
        int cont = 0;
        for(int i=0;i<qtdadeAlunos;i++){
            if (alunos[i].notasValidas() && alunos[i].aprovado()){
                cont++;
            }
        }
        Aluno aprovados[] = new Aluno[cont];
        int pos = 0;
        for(int i=0;i<qtdadeAlunos;i++){
            if (alunos[i].notasValidas() && alunos[i].aprovado()){
                aprovados[pos] = alunos[i];
                pos++;
            }
        }
        return aprovados;
    }
}