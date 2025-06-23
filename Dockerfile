# 使用 JDK 17 作為 base image
FROM eclipse-temurin:17-jdk-alpine

# 設定工作目錄
WORKDIR /app

# 複製 jar 檔案到容器中，假設名稱如下
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 設定啟動指令
ENTRYPOINT ["java", "-jar", "app.jar"]
