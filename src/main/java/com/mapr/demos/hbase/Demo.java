package com.mapr.demos.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Demo {

  private static final Logger log = LogManager.getLogger(Demo.class.getName());

  public void execute() throws IOException {
    Configuration configuration = HBaseConfiguration.create();

    Connection connection = ConnectionFactory.createConnection(configuration);
    Table table = connection.getTable(TableName.valueOf("emp"));

    Scan scan = new Scan();
    scan.addColumn(Bytes.toBytes("personal data"), Bytes.toBytes("name"));
    ResultScanner scanner = table.getScanner(scan);

    for (Result result = scanner.next(); result != null; result = scanner.next()) {
      byte[] valueBytes = result.getValue(Bytes.toBytes("personal data"), Bytes.toBytes("name"));
      System.out.println("Found row : " + Bytes.toString(valueBytes));
    }

    scanner.close();
    table.close();

  }

  public static void main(String[] args) throws IOException {
    new Demo().execute();
  }

}
