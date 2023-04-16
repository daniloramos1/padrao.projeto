package projeto;

/**Singleton Apressado: é um padrão de design que garante que apenas uma instância
 * de uma classe seja criada durante a execução do programa. Essa instância é criada
 * na inicialização da classe, antes de qualquer outra classe ou método acessá-la.
 * Isso evita a necessidade de sincronização ou verificação de nulidade para obter a instância.*/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

 }




