#!/bin/bash

# Ensure docker postgres datbase is running before executing the bash script.
# docker pull postgres:11
# docker run -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password --name nyby-postgres postgres:11


# Run the docker image named nyby-server on port 9100
#docker run -p 9100:9100 nyby-server