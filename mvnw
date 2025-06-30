#!/bin/sh

# Simple Maven wrapper script

BASEDIR=$(cd "$(dirname "$0")"; pwd)
WRAPPER_JAR="$BASEDIR/.mvn/wrapper/maven-wrapper.jar"
WRAPPER_URL="https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"

if [ ! -f "$WRAPPER_JAR" ]; then
  echo "Downloading Maven wrapper jar..."
  mkdir -p "$(dirname "$WRAPPER_JAR")"
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "$WRAPPER_URL" -o "$WRAPPER_JAR" || true
  elif command -v wget >/dev/null 2>&1; then
    wget -q "$WRAPPER_URL" -O "$WRAPPER_JAR" || true
  fi
  if [ ! -f "$WRAPPER_JAR" ]; then
    if command -v mvn >/dev/null 2>&1; then
      echo "Falling back to system Maven..."
      exec mvn "$@"
    else
      echo "Error: Maven wrapper jar not available and no mvn command found." >&2
      exit 1
    fi
  fi
fi

JAVA_CMD="java"
if [ -n "$JAVA_HOME" ]; then
  JAVA_CMD="$JAVA_HOME/bin/java"
fi

exec "$JAVA_CMD" -jar "$WRAPPER_JAR" "$@"
