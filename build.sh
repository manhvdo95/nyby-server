#!/bin/bash

# Create JAR from java application
mvn clean package

# Build a docker image named nyby-server
docker build -t nyby-server .
