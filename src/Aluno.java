public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;
    public Aluno(String nome, int idade, String tipoVeiculo) {
        this.nome = nome;
        this.idade = idade;
        this.tipoVeiculo = tipoVeiculo;
        this.aulasTeoricas = 0;
        this.aulasPraticas = 0;
        this.aprovado = false;
    }
    public void agendarAulaTeoria(){
        aulasTeoricas++;
        System.out.println(nome + " agendou aula teórica.");

    }
    public void agendarAulaPratica(){
        aulasPraticas++;
        System.out.println(nome + " agendou aula prática.");
    }
    public void cancelarAulaTeorica(){
        if(aulasTeoricas > 0){
            aulasTeoricas--;
            System.out.println(nome + " cancelou a aula teórica.");
        }
    }
    public void cancelarAulaPratica(){
        if (aulasPraticas > 0){
            aulasPraticas--;
            System.out.println(nome + " cancelou aula prática.");
        }
    }
    public void realizarExame(){
        if(aulasPraticas >= 5 && aulasTeoricas >=5 ){
            System.out.println("Pode fazer");
            boolean resultado = Math.random() < 0.5;
            System.out.println(resultado);
        }
        else{
            System.out.println("Nao pode fazer");
        }
    }


}
