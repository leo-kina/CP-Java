# 🚗 CP-Java — Sistema de Gestão de Autoescola

Projeto desenvolvido para o CP 1 da disciplina de **Domain Driven Design** — FIAP 2025.  
Sistema que permite o cadastro de alunos, instrutores e veículos, agendamento e cancelamento de aulas teóricas e práticas, e realização de exames para aprovação.

---

## 📊 Diagrama UML

Visualize a estrutura e o relacionamento entre as classes do projeto no diagrama abaixo:

> 🔗 [Clique aqui para ver o Diagrama UML completo](https://www.canva.com/design/DAHEWkDbUlA/F5EVXiXuyEtqKhtk0Fr2Dw/view?utm_content=DAHEWkDbUlA&utm_campaign=designshare&utm_medium=link2&utm_source=uniquelinks&utlId=h6df7145c2d)

---

## 📁 Estrutura do Projeto

```
CP-Java/
├── src/
│   ├── Aluno.java         # Classe principal do aluno
│   ├── Instrutor.java     # Classe do instrutor
│   ├── Veiculo.java       # Classe do veículo
│   ├── AutoEscola.java    # Classe da autoescola
│   └── Main.java          # Classe principal de execução
├── .idea/                 # Configurações do IntelliJ IDEA
├── CPJava.iml
└── .gitignore
```

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado)

### Rodando pelo IntelliJ

1. Clone o repositório:
   ```bash
   git clone https://github.com/leo-kina/CP-Java.git
   ```
2. Abra o projeto no IntelliJ IDEA (`File → Open → selecione a pasta CP-Java`)
3. Aguarde o IntelliJ indexar o projeto
4. Navegue até `Main.java` em `src/` e clique em **Run**

### Rodando pela linha de comando

```bash
# Compile
javac src/*.java

# Execute
java -cp src Main
```

---

## 🧠 Conceitos Aplicados

- Orientação a Objetos (Classes, Objetos, Atributos e Métodos)
- Tipos Primitivos em Java (`int`, `boolean`, `String`)
- Encapsulamento e responsabilidade de classes
- Instanciação de objetos e chamada de métodos
- Lógica condicional e aleatoriedade (`Math.random()`)
- Diagrama de Classes UML

---

## ❓ Perguntas Discursivas

### 1. Classes e Objetos
**Classe** é o molde que define a estrutura e o comportamento de um conjunto de objetos — por exemplo, `Aluno` define os atributos `nome`, `idade`, `aulasTeoricas`, etc.  
**Objeto** é uma instância concreta dessa classe — por exemplo, `aluno1 = new Aluno("João", 20, "Carro")` é um objeto real criado a partir da classe `Aluno`.

---

### 2. Funcionamento do Objeto

**A) O que acontece ao executar `aluno1.agendarAulaPratica()`?**  
O programa acessa o objeto `aluno1` na memória e chama o método `agendarAulaPratica()` definido na classe `Aluno`. Esse método executa sua lógica interna e modifica o estado do objeto.

**B) Qual atributo é modificado e por quê?**  
O atributo `aulasPraticas` (do tipo `int`) é incrementado em +1. Isso acontece porque o método foi projetado para registrar cada aula prática agendada pelo aluno.

---

### 3. Lógica do sistema

O método `realizarExame()` primeiro verifica se o aluno possui **no mínimo 5 aulas teóricas e 5 aulas práticas**. Caso não atinja esse requisito, exibe uma mensagem informando que o exame não pode ser realizado. Se a condição for satisfeita, a aprovação é decidida **aleatoriamente** usando `Math.random()`, simulando o resultado do exame — o atributo `aprovado` é definido como `true` ou `false`.

---

### 4. Diagrama de Classes

Para adicionar uma **bicicleta elétrica** como novo tipo de veículo, seria necessário:
- Adicionar `"Bicicleta Elétrica"` como valor válido para o atributo `tipo` na classe `Veiculo`
- Atualizar a classe `Aluno` para aceitar esse novo tipo no atributo `tipoVeiculo`
- Atualizar a classe `Instrutor`, adicionando uma nova `categoria` compatível
- Refletir essas mudanças no Diagrama UML, incluindo os novos valores possíveis nos atributos das classes afetadas

Uma abordagem mais escalável seria transformar `Veiculo` em uma **classe abstrata** com subclasses (`Carro`, `Moto`, `BicicletaEletrica`), facilitando a adição de novos tipos no futuro sem modificar as classes existentes.

---

## 🛠 Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

---

## 👥 Integrantes

| Nome | RM |
|------|----|
| Leonardo Eiji Kina | 562784 |
| Nicholas Braga de Souza | 561733 |
| Tomé Rossi Giani | 562422 |
| Vitor Ramos | 561958 |
