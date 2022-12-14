# dristribuida-spring


### done

Bom dia,

Seguem os critérios para avaliação dos trabalhos da terceira unidade:

1 - Usar o JMeter para invocar os 3 microserviços de negócio (2.0)

OK – Usar o Config Server em todos os microserviços do projeto (1.0)

OK – Usar o Discovery Service com registro dos microserviços do projetos (0.5)

OK – Implementar Loadbalance no Gateway(0.5) e chamadas RestTemplate(0.5)

OK  – Implementar Declarative Client (OpenFeign) (1.0)

OK – Implementar o padrão Gateway (1.0)

OK – Implementar as várias estratégias do Resilience4J
            CircutiBreak: 0.8
            Fallback: 0.2
            Bulkhead:0.5
            Retry: 0.5

OK – Implementar serviço serverless (1.0)

9 – Implementar monitoramento (0.5)

### observação

- USE FEING

### links
  https://start.spring.io/

`lsof -i tcp:8761 /  
  sudo kill -9 16881 `

colima start

docker ps -aq | xargs docker rm -f

docker-compose build
docker-compose up --remove-orphans

eureka-naming-server
service-gateway-API
alfa
beta
limits-service
oauth-authorization-server-jws-jwk-legacy
oauth-resource-server-jws-jwk-legacy


curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
