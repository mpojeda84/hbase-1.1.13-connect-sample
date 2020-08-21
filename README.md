Prepare:

`create 'emp', 'personal data'`

`put 'emp','1','personal data:name','maikel'`


1. Create “conf” directory and copy mapr-clusters.conf from cluster. Set MAPR_HOME to the directory where “conf” folder exists.
2. Set MAPR_TICKETFILE_LOCATION to the ticket file copied form the cluster
3. Copy hbase-site.xml from cluster node to conf directory. 

Make sure hese values exist in the hbase-site.xml
"hbase.zookeeper.quorum" -> your zookeeper nodes with port. For example: 10.163.169.42:5181,10.163.169.43:5181,10.163.169.44:5181
"mapr.hbase.default.db" -> hbase


4. Run the program:

`java -cp <conf-directory>:<jar> <Main Class>`

  EX.
  
 `java -cp ~/Desktop/mapr/conf/:target/hbase-demo-jar-with-dependencies.jar com.mapr.demos.hbase.Demo`


For Windows download `https://github.com/steveloughran/winutils/tree/master/hadoop-2.7.1` 
and create an environment variable called HADOOP_HOME=<path to folder containing /bin. AKA: hadoop-2.7.1>
HADOOP_HOME=C:\Users\Administrator\Desktop\winutils\hadoop-2.7.1

`java -cp "C:\Users\Administrator\Desktop\mapr\conf\*;C:\Users\Administrator\Desktop\hbase-1.1.13-connect-sample\target\hbase-demo-jar-with-dependencies.jar" com.mapr.demos.hbase.Demo`
