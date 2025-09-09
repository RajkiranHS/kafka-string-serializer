
<img width="1285" height="594" alt="image" src="https://github.com/user-attachments/assets/6ae5e4a2-b4f7-43e3-852b-5147eafd5da9" />



Kafka commandes : First start Zookeepr then run Kafka server

**E:\kafka_2.12-3.7.2>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties**


**E:\kafka_2.12-3.7.2>.\bin\windows\kafka-server-start.bat .\config\server.properties**



>**kafka-topics.bat --describe --topic sale-order  --bootstrap-server localhost:9092**

kafka-topics.bat --create --topic order --partitions 3 -**-replication-factor 2 **--bootstrap-server localhost:9092
Error will get
Error while executing topic command :** Replication factor: 2 larger than available brokers: 1.**
[2025-09-09 15:15:59,333] ERROR org.apache.kafka.common.errors.InvalidReplicationFactorException: Replication factor: 2 larger than available brokers: 1.
 (org.apache.kafka.tools.TopicCommand)
 
** kafka-topics.bat --create --topic order --partitions 3 --replication-factor 1 --bootstrap-server localhost:9092
Created topic order.**

E:\kafka_2.12-3.7.2\bin\windows>kafka-topics.bat --describe --topic order --bootstrap-server localhost:9092
Topic: order    TopicId: fpml0IgYQHeaRDzzCbfwrQ PartitionCount: 3       ReplicationFactor: 1    Configs:
        Topic: order    Partition: 0    Leader: 0       Replicas: 0     Isr: 0
        Topic: order    Partition: 1    Leader: 0       Replicas: 0     Isr: 0
        Topic: order    Partition: 2    Leader: 0       Replicas: 0     Isr: 0

E:\kafka_2.12-3.7.2\bin\windows>kafka-console-producer.bat --topic order --bootstrap-server localhost:9092
>Rajkiran Harishchandra Suryawanshi
>Kiran
>pintoo

ctrl+c


================================= consumer======================================

E:\kafka_2.12-3.7.2\bin\windows>kafka-console-consumer.bat --topic order --bootstrap-server localhost:9092 --from-beginning

son
too
many
Processed a total of 13 messages
Terminate batch job (Y/N)? y

E:\kafka_2.12-3.7.2\bin\windows>kafka-console-consumer.bat --topic order --bootstrap-server localhost:9092 --from-beginning
raj
kiran
son
too
