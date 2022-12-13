# dristribuida-spring


### done

- [x] Spring Discovery Service (https://spring.io/guides/gs/service-registration-and-discovery/)
- [x] load balancer (https://spring.io/guides/gs/spring-cloud-loadbalancer/)

- [x] api gateway ([https://spring.io/projects/spring-cloud-gateway](https://spring.io/projects/spring-cloud-gateway))
- [x] eureka (spring clound discovery)

- [x] config server(https://spring.io/projects/spring-cloud-config)

- [x] resilience4j (https://www.baeldung.com/resilience4j) LOW PRIORITY
  - circuit breakers
  - bulk head
- [x] auth server (spring clound security OAuth2 JWT)


### falta
 
- create docker and docker compose
  - https://spring.io/guides/gs/spring-boot-docker/

senha secreta ?


- [x] Monitoramento - Zipkin ver funcionando no docker
- Serverless - perguntar se tenho q fazer?


### observação

- USE FEING

### links
  https://start.spring.io/

`lsof -i tcp:8080 /  
  sudo kill -9 12191 `

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