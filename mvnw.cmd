@echo off
setlocal
set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
set WRAPPER_JAR=%DIRNAME%\.mvn\wrapper\maven-wrapper.jar
set WRAPPER_URL=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar

if not exist "%WRAPPER_JAR%" (
  echo Downloading Maven wrapper jar...
  if not exist "%DIRNAME%\.mvn\wrapper" mkdir "%DIRNAME%\.mvn\wrapper"
  powershell -Command "Invoke-WebRequest -Uri %WRAPPER_URL% -OutFile '%WRAPPER_JAR%'"
)

set JAVA_CMD=java
if not "%JAVA_HOME%"=="" set JAVA_CMD=%JAVA_HOME%\bin\java

"%JAVA_CMD%" -jar "%WRAPPER_JAR%" %*
endlocal
