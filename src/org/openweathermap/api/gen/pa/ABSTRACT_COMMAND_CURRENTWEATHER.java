//	Generated using Unvired Modeller - Build R-4.000.0002
package org.openweathermap.api.gen.pa;

import org.openweathermap.api.gen.utils.BEUtility;

import com.unvired.ump.agent.IBusinessProcess;

public abstract class ABSTRACT_COMMAND_CURRENTWEATHER extends BotService {
	protected org.openweathermap.api.gen.be.BE_CurrentWeather inputBE_CurrentWeather;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_CurrentWeather = BEUtility.getBE_CurrentWeather(process.getBusinessEntityInput()).get(0);

	}

}
