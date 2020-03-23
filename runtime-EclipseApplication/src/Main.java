public class Main { 


public static void main(String[] args) throws Exception{ 


RESTCall rc = new RESTCall("https://api.thingspeak.com","8XH6AGY8U9AROBQ2",0,99740);

System.out.println(rc.readDataOverRest("Temperature","Min",100,8));

mysql db1 = null;
db1 = new mysql("localhost",3309,"root","root","MySQL","scirus");

int res= db1.excute("Temperature","Average",100,5);

mysql db2 = null;
db2 = new mysql("localhost",3309,"root","root","MySQL","scirus_global");

db2.save( "Average", res);} 
 } 
