FROM adoptopenjdk/maven-openjdk11 as build
WORKDIR /build
COPY . . 
RUN ls -l 
RUN mvn clean package

FROM prasadlvi/openjdk-11-jre:latest
COPY --from=build /build/target/*.jar acct.jar
EXPOSE 8091
ENV CUST_URL null
ENV CUST_PORT null
EXPOSE 8091

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar acct.jar" ]


