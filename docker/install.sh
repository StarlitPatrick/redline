#!/bin/bash
cd ../
mvn clean package
mkdir -p docker/redline-gateway/app
mkdir -p docker/redline-user-service/app
cp redline-gateway/target/redline-gateway-0.0.1-SNAPSHOT.jar docker/redline-gateway/app/app.jar
cp redline-user-service/target/redline-user-service-0.0.1-SNAPSHOT.jar docker/redline-user-service/app/app.jar
