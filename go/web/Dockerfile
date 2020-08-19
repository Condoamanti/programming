# iron/go:dev is the alpine image with the golang tools added
FROM centos:centos7
MAINTAINER Condoamanti "Condoamanti@gmail.com"
RUN yum update -y
RUN yum install epel-release -y
RUN yum install golang -y
RUN yum install git -y
RUN yum clean all

RUN mkdir /app
ADD . /app

WORKDIR /app
RUN cd /app

RUN go build -o main
ENTRYPOINT ["./app"]
EXPOSE 80/tcp 443/tcp