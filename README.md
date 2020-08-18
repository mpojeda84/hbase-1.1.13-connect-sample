Prepare:

`create 'emp', 'personal data'`

`put 'emp','1','personal data:name','maikel'`


1. Create “conf” directory and copy mapr-clusters.conf from cluster. Set MAPR_HOME to the directory where “conf” folder exists.
2. Set MAPR_TICKETFILE_LOCATION to the ticket file copied form the cluster
3. Copy hbase-site.xml from cluster node to conf directory. 
4. Run the program:

`java -cp <conf-directory>:<jar> <Main Class>`

  EX.
  
 `java -cp ~/Desktop/mapr/conf/:target/hbase-demo-jar-with-dependencies.jar com.mapr.demos.hbase.Demo`
