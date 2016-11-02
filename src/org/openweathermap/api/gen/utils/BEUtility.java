//	Generated using Unvired Modeller - Build R-4.000.0002
package org.openweathermap.api.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.openweathermap.api.gen.be.BE_CurrentWeather;
import org.openweathermap.api.gen.be.BE_CurrentWeatherSample;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BEUtility
{
	public static List<BE_CurrentWeather> getBE_CurrentWeather(List<BusinessEntity> beList)
	{
		ArrayList<BE_CurrentWeather> typedBEs = new ArrayList<BE_CurrentWeather>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_CurrentWeather.NAME))
				{
					BE_CurrentWeather typedBE = new BE_CurrentWeather();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

	public static List<BE_CurrentWeatherSample> getBE_CurrentWeatherSample(List<BusinessEntity> beList)
	{
		ArrayList<BE_CurrentWeatherSample> typedBEs = new ArrayList<BE_CurrentWeatherSample>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_CurrentWeatherSample.NAME))
				{
					BE_CurrentWeatherSample typedBE = new BE_CurrentWeatherSample();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

}