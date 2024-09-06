<h1 align="center">Abstract Factory</h1>

Padrão de projeto criacional que permite produzir famílias de objetos relacionados sem especificar suas classes concretas.

Para executar a classe principal você precisa fornecer qual é o estabelecimento desejado. Exemplo:

```bash
# Primeiramente, compile o projeto
$ mvn clean package

# Execute a classe principal fornecendo o estabelecimento desejado
$ java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App pizzaria
```

