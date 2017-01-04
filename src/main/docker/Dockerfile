FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD sidecar-service-0.0.1-SNAPSHOT.jar sidecar-service.jar
RUN sh -c 'touch /sidecar-service.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /sidecar-service.jar" ]
