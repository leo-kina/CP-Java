public class AutoEscola {
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    Aluno aluno4;

    public AutoEscola(Aluno a1, Aluno a2, Aluno a3, Aluno a4) {
        this.aluno1 = a1;
        this.aluno2 = a2;
        this.aluno3 = a3;
        this.aluno4 = a4;
    }

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
