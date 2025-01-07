FROM openjdk:8-jre-alpine

ADD target/*.jar app.jar

EXPOSE 9999

ENV JAVA_OPTIONS="-Xms512m -Xmx1024m"

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTIONS} -jar /app.jar ${EXTENSION_PARAMS}"]