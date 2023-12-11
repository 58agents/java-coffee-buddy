FROM amazoncorretto:17-alpine-jdk as builder

COPY gradle gradlew build.gradle settings.gradle /coffee-buddy

WORKDIR /coffee-buddy

RUN mkdir gradle && \
  mv wrapper gradle && \
  ./gradlew resolveDependencies

EXPOSE 8080

COPY src /coffee-buddy/src

RUN ./gradlew build --offline

ENTRYPOINT "java" "-jar" "./build/libs/coffee-buddy-0.0.1-SNAPSHOT.jar"
