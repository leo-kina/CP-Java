public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;
    public void agendarAulaTeoria(){
        aulasTeoricas++;

    }
    public void agendarAulaPratica(){
        aulasPraticas++;
    }
    public void cancelarAulaTeorica(){
        if(aulasTeoricas > 0){
            aulasTeoricas--;
        }
    }
    public void cancelarAulaPratica(){
        if (aulasPraticas > 0){
            aulasPraticas--;
        }
    }
    public void realizarExame(){
        if(aulasPraticas >= 5 && aulasTeoricas >=5 ){
            System.out.println("Faca");
            boolean resultado = Math.random() < 0.5;
            System.out.println(resultado);
        }
        else{
            System.out.println("nao receba pai, amem");
        }
    }


}
