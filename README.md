# Explorando Padrões de Projetos na Prática com Java

Padrões de projeto são soluções reutilizáveis para problemas comuns de software. Eles descrevem como diferentes classes e objetos podem se relacionar e colaborar para realizar uma tarefa. Em Java, existem vários padrões de projeto reconhecidos que se enquadram em três categorias: criacionais, estruturais e comportamentais. Os padrões criacionais lidam com a criação de objetos, os padrões estruturais lidam com a composição de classes e objetos, e os padrões comportamentais lidam com a comunicação e responsabilidade entre objetos. Alguns exemplos de padrões de projeto em Java são: Singleton, Factory, Adapter, Observer e Strategy.

Neste projeto abordamos o Singleton juntamente com o Tech Lead da Digital Inovation One - DIO Venilton Falvo Jr a prática de padrões em Java puro. 

Um singleton é um padrão de projeto criacional que permite garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância . Esse padrão é útil para controlar o acesso a algum recurso compartilhado, como uma base de dados ou um arquivo. Para implementar um singleton, é necessário fazer o construtor padrão da classe privado, para evitar que outros objetos usem o operador new com a classe singleton. Além disso, é preciso criar um método estático de criação que age como um construtor e retorna a mesma instância da classe, armazenada em um campo estático. Assim, sempre que o método estático for chamado, o mesmo objeto será retornado. O singleton oferece uma alternativa segura às variáveis globais, pois protege a instância de ser sobrescrita por outro código.

O objetivo do projeto é implementar a prática no desenvolvedor de criar padrões reutilizáveis para projetos futuros.

#CONTRATODECOMPROMISSO

DIO

Encarar os desafios é o primeiro passo para mudar de vida!
