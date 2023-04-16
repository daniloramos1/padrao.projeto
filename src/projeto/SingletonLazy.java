package projeto;

/**Singleton Preguiçoso: é um padrão de design que permite criar uma única instância
 * de uma classe e garantir que ela seja inicializada apenas quando for necessária.
 * Esse padrão é útil para evitar a criação desnecessária de objetos que consomem recursos
 * ou que dependem de algum estado externo.*/

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
