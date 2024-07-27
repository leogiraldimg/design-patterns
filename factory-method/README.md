<h1 align="center">Factory Method</h1>

Padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

Para executar a classe principal você precisa fornecer qual é o tipo de logística desejado. Exemplo:

```bash
# Primeiramente, compile o projeto
$ mvn clean package

# Execute a classe principal fornecendo o tipo de logística desejado
$ java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App Marítima
```

Os tipos de logística disponíveis são:

- Marítima
- Rodoviária