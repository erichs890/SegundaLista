public class TesteExcecao {
    public static void teste() throws MinhaExcecao {
        throw new MinhaExcecao("Uma exceção foi lançada pelo método teste!");
    }

    public static void main(String[] args) {
        try {
            System.out.println("try ");
            teste();
        } catch (MinhaExcecao e) {
            System.out.println("catch ");
        } finally {
            System.out.println("finally ");
            // Não é uma boa prática lançar exceções no bloco 'finally' porque pode ofuscar exceções anteriores.
            // Mas, se esse é o comportamento desejado para o exercício, aqui está:
            throw new RuntimeException("Uma exceção foi lançada pelo bloco finally!");
        }
        // Este bloco não será atingido devido à exceção lançada no bloco 'finally'.
        // System.out.println("fim");
    }
}
