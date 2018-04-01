# hive-jdbc-service
Hive JDBC Service

Connecting Hive through JDBC connection from Java

| HADOOP_HOME=/usr/lib/hadoop |
| HIVE_HOME=/usr/lib/hive/    |

```sh
export CLASSPATH=$HADOOP_HOME/lib/commons-logging-1.1.3.jar:$HADOOP_HOME/lib/hadoop-common.jar:$HIVE_HOME/lib/hive-jdbc-2.1.1.jar:$HADOOP_HOME/lib/httpcore-4.4.4.jar:$HADOOP_HOME/lib/libthrift-0.9.3.jar:$HADOOP_HOME/lib/log4j-core-2.4.1.jar:$HADOOP_HOME/lib/hadoop-auth.jar:$HADOOP_HOME/lib/httpclient-4.5.3.jar:libfb303-0.9.3.jar:$HADOOP_HOME/lib/log4j-api-2.4.1.jar:$HADOOP_HOME/lib/log4j-slf4j-impl-2.4.1.jar:$HIVE_HOME/lib/hive-service-2.1.1.jar:.:$HIVE_HOME/lib/hive-exec-2.1.1.jar:$HADOOP_HOME/lib/slf4j-log4j12-1.7.10.jar:$HADOOP_HOME/lib/slf4j-api-1.7.10.jar
```

Run the HiveClient to test

**java HiveClient hadoop hadoop**
