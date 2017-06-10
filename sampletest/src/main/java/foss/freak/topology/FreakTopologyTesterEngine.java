package foss.freak.topology;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class FreakTopologyTesterEngine {
	private static String ip = "10.112.19.131";
	private static String port = "6654";
	private static String prefix="http://"+ip+":"+port; 
	public static void main(String[] args) {
		
			makeCallGetSwitchDPID();
	}

	private static void makeCallGetSwitchDPID() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(prefix+"/wm/core/controller/switches/json");
		
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
		System.out.println(response);
		
		
	}

}
