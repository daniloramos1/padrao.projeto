package projeto;

public class Test {

    public static void main(String[] args) {
        SingletonLazy Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        

    }


}

