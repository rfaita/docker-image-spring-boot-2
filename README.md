# docker-image-spring-boot-1

## Para compilar

```sh

mvn clean install

```

## Para executar

```sh

docker-compose up --build

```

## Gerar Registro

```sh

curl -X POST localhost:8080/example -H "Content-Type: application/json" -d '{"example":"Exemplo 1"}'

```

## Consultar Registro

```sh

curl localhost:8080/example/[ID AQUI]

```