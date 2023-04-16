package projeto;

/**Um singleton Lazy holder é um padrão de projeto que permite criar
 * uma instância única de uma classe de forma preguiçosa, ou seja,
 * apenas quando for necessária. Esse padrão usa uma classe interna estática
 * que contém a instância do singleton e que só é inicializada quando o método getInstance
 * é invocado na classe externa. Isso garante que o singleton seja criado de forma segura e eficiente,
 * sem bloqueios ou inicializações desnecessárias.*/

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder( ) {
    	super();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
