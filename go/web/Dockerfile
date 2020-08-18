# iron/go:dev is the alpine image with the golang tools added
FROM iron/go:dev
WORKDIR /app
ENV SRC_DIR=/go/src/github.com/Condoamanti/programming

# Add repository source code
ADD . $SRC_DIR

# Build it:
RUN cd $SRC_DIR;
RUN go build -o myapp
RUN cp myapp /app/
ENTRYPOINT ["./app"]