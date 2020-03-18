package mainpack;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.joshworks.restclient.http.*;
import io.joshworks.restclient.http.async.Callback;
import io.joshworks.restclient.http.exceptions.RestClientException;








public class RESTCall implements Callback<JsonNode>{
	String url,api;
	int port,idchannel;
	public  RESTCall(String url1, String api1,int port1,int idchannel1 ) {
		url=url1;
		api=api1;
		port=port1;
		idchannel=idchannel1;
	}
	public void sendDataOverRest(double temp) {
		
	Unirest.post(url+"/update.json")
		//Unirest.get("https://api.thingspeak.com/channels/992740/feeds.json?days=45")
		  .header("accept", "application/json")
		 .field("api_key", "NEO1D8GAW9BA5I8N")
		  .field("field1",temp)
		  .asJsonAsync(this);
	}
	
	public String readDataOverRest(String metric,String typefun,int period,int seuil ) throws ParseException {
		int idmetric=0;
		String result="";
	
		if (metric=="Temperature"){
			idmetric=992740;
		}
		
		@SuppressWarnings({"unchecked"})
			
		
		 HttpResponse<JsonNode> jsonResponse = Unirest.get(url+"/channels/"+Integer.toString(idmetric)+"/feeds.json?api_key="+api)
		.header("accept", "application/json").asJson();

		 JSONParser parser = new JSONParser();
		org.json.simple.JSONObject jo = (org.json.simple.JSONObject) parser.parse(jsonResponse.getBody().toString());
			
			
		Object  companyList = jo.get("feeds");
			
			float a =0, cpt =0, val=0;float max=0, min=1000, re=0;
			if (companyList instanceof JSONArray) {
				JSONArray itemsArray =(JSONArray) companyList;
				//Select min 
				if (typefun=="Min"){
					List <Float> arrList = new ArrayList();
					for (int index = 0; index < itemsArray.size(); index++) {
						JSONObject modelItereative = (JSONObject) itemsArray.get(index);
						String ss = modelItereative.get("field1").toString();
						
					//	System.out.println("1"+Float.parseFloat(ss));
						if (Float.parseFloat(ss)>seuil){
							//System.out.print(Float.parseFloat(ss));
							arrList.add(Float.parseFloat(ss));
						}
					
				}
				//Get min from List
					float mini= arrList.get(0);
					for (int j=1; j<arrList.size();j++){
						if (mini >  arrList.get(j)){
							mini=arrList.get(j);
						}
					}
					//System.out.print("le mini est : "+ mini);
					result= Float.toString(mini);
				}
				
				max=seuil;
				for (int index = 0; index < itemsArray.size(); index++) {
					JSONObject modelItereative = (JSONObject) itemsArray.get(index);
					String ss = modelItereative.get("field1").toString();
					
					//System.out.println(ss);
					
						if (typefun=="Average"){
					
						
						//Verification des valeurs par rapport au seuil
						if(Float.parseFloat(ss)>seuil){
					//		System.out.println(cpt);
							a+=	Float.parseFloat(ss); cpt++;
						}
						result= Float.toString(a/cpt);
					 	//System.out.print("la moyenne est : "+result);
						return result;
					}
					
					
					
				
				if (typefun=="Max"){
					
					//System.out.println(max);
						
						//Verification des valeurs par rapport au seuil
						if(max>=seuil && max<(Float.parseFloat(ss))){
							max=	Float.parseFloat(ss); 
							result = Float.toString(max);
						}
					//System.out.println("La valeur maximale est "+ max);
					result= Float.toString(max);
						
					}
					
					
				
				
					}
					
			
				}
			
			return ("Cloud-"+typefun+" est: "+result);
		}


	public void cancelled() {
		// TODO Auto-generated method stub
        System.out.println("The request has been cancelled");
	}


	public void completed(HttpResponse<JsonNode> response) {
		// TODO Auto-generated method stub
		  int code = response.getStatus();
	       //  Map<String, String> headers = response.getHeaders();
	         JsonNode body =response.getBody();
	         InputStream rawBody = response.getRawBody();

		        System.out.println(code);
		        System.out.println(body);
		        System.out.println(rawBody);
	}


	public void failed(RestClientException arg0) {
		// TODO Auto-generated method stub
        System.out.println("The request has failed");
	}

}