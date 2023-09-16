FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} grafana-loki-0.0.1-SNAPSHOT
ENV JAVA_OPTS "--add-opens java.base/java.lang=ALL-UNNAMED"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.config.use-legacy-processing=true -jar /grafana-loki-0.0.1-SNAPSHOT" ]