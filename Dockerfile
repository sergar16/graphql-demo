FROM serhiihokhkalenko/dev-image:latest

WORKDIR /
VOLUME /tmp
ARG DEPENDENCY=build/dependency

HEALTHCHECK --interval=10s --timeout=3s CMD curl --fail http://localhost:8080/health || exit 1

COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

EXPOSE 8080

ENTRYPOINT ["concurrently", "java -cp app:app/lib/* org.serhii.example.GraphQLApp","cd home/app/wetty && node ."]