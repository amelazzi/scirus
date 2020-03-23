package mainpack;

import java.sql.Timestamp;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;

public class SendDataUsingMQTT {
	
		private MqttClient client;
		private MqttConnectOptions	conOpt;


	String brokerUrl="tcp://mqtt.thingspeak.com:1883";
	String clientId="ExamplePublish";
	String channel="channels/992740/publish/NEO1D8GAW9BA5I8N";
	String channel2="channels/992740/subscribe/fields/field1/8XH6AGY8U9AROBQ2";
	
	
	int qos=0;
	public  SendDataUsingMQTT() throws MqttException {
	    	String tmpDir = System.getProperty("java.io.tmpdir");
	    	MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(tmpDir);

	    	try {
		    	conOpt = new MqttConnectOptions();
		    	conOpt.setCleanSession(true);
				client = new MqttClient(brokerUrl,MqttClient.generateClientId(), dataStore);
		    	client.setCallback(new MqttCallback() {
		    		
				@Override
				
				public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
					String time = new Timestamp(System.currentTimeMillis()).toString();
					System.out.println("Time:\t" +time +
			                           "  Topic:\t" + arg0 +
			                           "  Message:\t" + new String(arg1.getPayload()) +
			                           "  QoS:\t" + arg1.getQos());
				}
				
				@Override
				public void deliveryComplete(IMqttDeliveryToken arg0) {
					// TODO Auto-generated method stub

		        	try {
						System.out.println("PUBLISHED");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				@Override
				public void connectionLost(Throwable arg0) {
					// TODO Auto-generated method stub

					System.out.println("Connection to " + brokerUrl + " lost!");

					System.out.println("Reconnecting..");
		        	try {
						client.connect(conOpt);
			        	System.out.println("Connected");
					} catch (MqttException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
	    	if(client.isConnected()){

	        	System.out.println("was already Connected");
	        	client.disconnect();
	    	}
        	client.connect(conOpt);
        	System.out.println("Connected");


		} catch (MqttException e) {
			e.printStackTrace();
			System.out.println("Unable to set up client: "+e.toString());
			System.exit(1);
		}
    		

    	
    }
    public void publish(String data) throws MqttPersistenceException, MqttException{
    	String time = new Timestamp(System.currentTimeMillis()).toString();
    	System.out.println("Publishing at: "+time+ " to topic \""+channel+"\" qos "+qos);

    	// Create and configure a message
   		MqttMessage message = new MqttMessage(data.getBytes());
    	message.setQos(qos);
    	message.setRetained(false);
    	client.publish(channel, message);

    }
    public void close() throws MqttException{    	
    	client.disconnect();
    	System.out.println("Disconnected");
    }
    

    }
    
    
   
    



