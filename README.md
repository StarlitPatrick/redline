# Redline  
For paying off the technical debt.  

## Dependencies  
- Docker  
- Docker Compose v2  
- JDK 17  
- Maven  
- `redline-nacos` docker container needs **x86_64 arch**

## Default Ports  
- 1848: `redline-nacos(core)`  
- 2848: `redline-nacos(gRPC)`  
- 1948: `redline-nacos-db`  
- 1001: `redline-gateway`  
- 1002: `redline-user-service`  
- 1102: `redline-user-db`  

## Run
### Docker
```shell
cd docker
./install.sh
docker compose up -d
```
