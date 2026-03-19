//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Leozin", 18, "Carro");
        Aluno a2 = new Aluno("Nicholas", 20, "Moto");
        Aluno a3 = new Aluno("Tome", 69, "Carro");
        Aluno a4 = new Aluno("Vitor", 24, "Moto");
        Instrutor instrutor = new Instrutor("Junin", 2, "Carro");
        Veiculo veiculo = new Veiculo("Carro", "Onix", "ABC-1234");
        for (int i = 0; i < 5; i++) {
            a1.agendarAulaTeoria();
            a1.agendarAulaPratica();
        }

        a1.cancelarAulaTeorica();


        a1.realizarExame();
        a2.realizarExame();

        AutoEscola autoEscola = new AutoEscola(a1, a2, a3, a4);


        autoEscola.exibirResumo();

        }

    }
