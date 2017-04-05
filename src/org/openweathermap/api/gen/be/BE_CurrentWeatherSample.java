//	Generated using Unvired Modeller - Build R-4.000.0042
package org.openweathermap.api.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_CurrentWeatherSample extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_CurrentWeatherSample";
	public BE_CurrentWeatherSample()
	{
		setName(NAME);
		setHeader(new CurrentWeatherSample_HEADER());
	}

	public CurrentWeatherSample_HEADER getCurrentWeatherSample_HEADER()
	{
		return (CurrentWeatherSample_HEADER)super.getHeader();
	}

	public static class CurrentWeatherSample_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "CurrentWeatherSample_HEADER";

		public static final String FLD_city = "city";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_city);
		}

		public CurrentWeatherSample_HEADER()
		{
			setName(NAME);
		}

		public String getcity()
		{
			return getField(FLD_city);
		}

		public void setcity(String value)
		{
			if(value != null)
				addField(FLD_city, value);
		}

	}
}