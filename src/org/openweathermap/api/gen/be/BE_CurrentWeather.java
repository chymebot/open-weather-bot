//	Generated using Unvired Modeller - Build R-4.000.0002
package org.openweathermap.api.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_CurrentWeather extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_CurrentWeather";
	public BE_CurrentWeather()
	{
		setName(NAME);
		setHeader(new CurrentWeather_HEADER());
	}

	public CurrentWeather_HEADER getCurrentWeather_HEADER()
	{
		return (CurrentWeather_HEADER)super.getHeader();
	}

	public static class CurrentWeather_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "CurrentWeather_HEADER";

		public static final String FLD_CITY = "CITY";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_CITY);
		}

		public CurrentWeather_HEADER()
		{
			setName(NAME);
		}

		public String getCITY()
		{
			return getField(FLD_CITY);
		}

		public void setCITY(String value)
		{
			if(value != null)
				addField(FLD_CITY, value);
		}

	}
}