FROM eclipse-temurin:17-alpine as jre-build

RUN $JAVA_HOME/bin/jlink \
         --add-modules ALL-MODULE-PATH \
         --no-man-pages \
         --no-header-files \
         --compress=2 \
         --output /javaruntime

FROM alpine:latest

# Use the custom Java runtime
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH "${JAVA_HOME}/bin:${PATH}"
COPY --from=jre-build /javaruntime $JAVA_HOME

RUN \
    apk update \
    && addgroup -S -g 1000 appgroup \
    && adduser -S -u 1000 -G appgroup appuser \
    && apk add tini bash

WORKDIR /home/appuser

USER appuser
COPY ./target/limits-service-1.0-SNAPSHOT.jar ./app.jar
COPY ../entrypoint.sh ./entrypoint.sh

EXPOSE 8887
ENTRYPOINT ["/sbin/tini", "--", "./entrypoint.sh"]