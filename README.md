<h1 align="center"> Crud Operation Spring Boot with Docker </h1> <br>
<p align="center">
  <a href="#">
    <img alt="Techs" title="Techs" src="https://user-images.githubusercontent.com/34090058/56314382-9586c100-615d-11e9-8117-5bb67e9a44d7.png" width="600">
  </a>
</p>


#### Prerequisite

Installed: Docker, Java 1.8, Maven 3.x


## Introduction

 Crud Operation Spring Boot with Docker

#### Steps

##### Clone source code from git
```
$  git clone https://github.com/hasankadirdemircan/hello-world-spring-boot-docker.git .
```
##### Build project with Maven
```
$ mvn clean install
#should be maven test closed (skip test)
#IntelijIDEA steps -> File -> Settings -> Build,Execituion.. -> Build Tools -> Maven -> Runner -> Properties -> Skip Test (Should be Checked)
```
##### Up docker-compose
```
$ docker-compose up -d
#If your spring boot exit(stopped)
#IntelijIDEA steps -> File -> Settings -> Build,Execituion.. -> Docker -> Unix Socket (Should be Checked)
```

##### Test application
for test the running docker image
```
$ docker image ls
```
for test the running docker container
```
$ docker container ps
```
for test the running docker-compose
```
$ docker-compose ps
```


## Postman Screen

<p>
  <a href="#">
    <img alt="Screen" title="Screen" src="https://user-images.githubusercontent.com/34090058/56313083-628efe00-615a-11e9-9f2e-f0f63db0ac87.png" width="800">
  </a>
</p>
<p>
  <a href="#">
    <img alt="Screen" title="Screen" src="https://user-images.githubusercontent.com/34090058/56313280-ef39bc00-615a-11e9-90a0-f76a178901b0.png" width="800">
  </a>
</p>

​    
