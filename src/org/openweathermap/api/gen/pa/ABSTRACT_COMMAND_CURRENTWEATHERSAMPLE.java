//	Generated using Unvired Modeller - Build R-4.000.0042
package org.openweathermap.api.gen.pa;

import org.openweathermap.api.gen.utils.BEUtility;

import com.unvired.ump.agent.IBusinessProcess;

public abstract class ABSTRACT_COMMAND_CURRENTWEATHERSAMPLE extends BotService {
	protected org.openweathermap.api.gen.be.BE_CurrentWeatherSample inputBE_CurrentWeatherSample;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_CurrentWeatherSample = BEUtility.getBE_CurrentWeatherSample(process.getBusinessEntityInput()).get(0);

	}

}
