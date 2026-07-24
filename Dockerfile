FROM eclipse-temurin:21-jre

WORKDIR /app

COPY Hello.class .

CMD ["G.PRAVEEN"]

ENTRYPOINT ["java","Hello"]