FROM condoamanti/test:centos7

RUN mkdir /app
ADD . /app

WORKDIR /app
RUN cd /app

RUN go build -o main
ENTRYPOINT ["./app"]
EXPOSE 80/tcp 443/tcp