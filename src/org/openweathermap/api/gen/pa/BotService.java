//	Generated using Unvired Modeller - Build R-4.000.0042
package org.openweathermap.api.gen.pa;

import java.util.Hashtable;
import java.util.Vector;

import com.unvired.chyme.api.ChymeAPI;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.IHTTPRequest;
import com.unvired.ump.agent.IHTTPResponse;
import com.unvired.ump.agent.IProcessAgent;
import com.unvired.ump.agent.InvalidOutput;

public abstract class BotService implements IProcessAgent {
	protected Vector<InfoMessage> infoMessages;
	protected IBusinessProcess process;
	protected ChymeAPI chymeAPI;

	public void init(IBusinessProcess process) {
		this.process = process;
		infoMessages = new Vector<InfoMessage>();
		chymeAPI = new ChymeAPI(process);
	}

	public void finish() {
		try {
			process.setOutput(chymeAPI.getBusinessEntityOutput(), null);
		} catch (InvalidOutput e) {
			process.getInfoMessageList().add(new InfoMessage(e.getMessage(), InfoMessageCategory.FAILURE));
		}
	}

	protected void addParameter(Hashtable<String, String> parameters, String name, String value, String defaultValue) {
		if (!isEmpty(name)) {
			if (!isEmpty(value))
				parameters.put(name, value);
			else if (!isEmpty(defaultValue))
				parameters.put(name, defaultValue);
		}
	}

	protected boolean isEmpty(String value) {
		return (value == null || value.trim().isEmpty());
	}

	public IHTTPResponse CURRENT_WEATHER(String q, String APPID) {
		Hashtable<String, String> postParameters = new Hashtable<String, String>();
		addParameter(postParameters, "q", q, "");
		addParameter(postParameters, "APPID", APPID, "8a1af5734b536e738f32c75e78db730e");

		String resource = "/data/2.5/weather";

		IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);
		httpRequest.setPath(resource);
		httpRequest.setVerb(IHTTPRequest.HTTPVerb.GET);

		httpRequest.setParameters(postParameters);

		IHTTPResponse httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
				Constant.OPENWEATHERMAP_SAMPLE_REST_EXECUTE);
		return httpResponse;
	}

}
