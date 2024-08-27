FROM adoptopenjdk/maven-openjdk11 as build
WORKDIR /build
COPY . .
RUN ls -l
RUN mvn clean package

FROM prasadlvi/openjdk-11-jre:latest
COPY --from=build /build/target/*.jar cust1.jar
EXPOSE 8090
ENV DB_DET null
ENV DB_PORT null
ENV DBUSER_NAME NULL
ENV DBUSER_PWD null
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar cust1.jar" ]
