public class AutoEscola extends Aluno{
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    Aluno aluno4;

    public void exibirResumo() {
        Aluno[] lista = {aluno1, aluno2, aluno3, aluno4};

        for (Aluno aluno : lista) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Aulas Teóricas feitas: " + aluno.aulasTeoricas);
                System.out.println("Aulas Teóricas práticas : " + aluno.aulasPraticas);
                System.out.println("Aprovado: " + (aluno.aprovado ? "Sim" : "Não"));
                System.out.println("-------------------");
            }
        }
    }
}
