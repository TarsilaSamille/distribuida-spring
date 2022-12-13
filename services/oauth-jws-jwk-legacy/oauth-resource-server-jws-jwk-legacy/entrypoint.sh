#!/bin/bash
set -e
eval "exec java -Dio.grpc.netty.shaded.io.netty.transport.noNative=true $JAVA_OPTS -jar /home/appuser/app.jar"
exec "$@"