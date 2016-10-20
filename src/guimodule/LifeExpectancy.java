package guimodule;

import java.util.HashMap;
import java.util.List;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LifeExpectancy extends PApplet{

	/**
	 * Visualizes life expectancy in different countries.  
	 */
	
	UnfoldingMap map;
	HashMap<String,Float> lifeExpMap;
	List<Feature> countries;
	List<Marker> countryMarkers;
	
	public void setup(){
		size(800,600,OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);

		// load data
		lifeExpMap = loadLifeExpectancyFromCSV("LifeExpectancyWorldBankModule3.csv");
		println ("loaded " + lifeExpMap.size() + " data entries");
		
		//load country polygons and adds them as markers
		countries = GeoJSONReader.loadData(this, "countries.geo.json");
		countryMarkers = MapUtils.createSimpleMarkers(countries);
		
		map.addMarkers(countryMarkers);
		shadeCountries();
	}
	
	
	public void draw(){
		//draws map and file markers
		map.draw();
		
	}	
	
	//helper method to get data from file
	private HashMap<String, Float> loadLifeExpectancyFromCSV (String fileName){
		HashMap<String, Float> lifeExpMap = new HashMap<String, Float>();
		
		String[] rows = loadStrings(fileName);
		for (String row : rows){
			// Reads country name and population density value from CSV row
			// Note: Splitting on just a comma is not a great idea here, because
			// the CSV file might have commas in their entries, as this one does.
			// We do a smarter thing in ParseFeed, but for simplicity,
			// we just use a comma here, and ignore the fact that the first field is split
			
			String[] columns = row.split(",");
			if (columns.length == 6 && !columns[5].equals("..")){
				lifeExpMap.put(columns[4], Float.parseFloat(columns[5]));
			}
		}
		return lifeExpMap;
	}

	//helper method to color each country based on life expectancy
	// red-irange indicates low (near 40)
	//blue indicates high(near 100)
	private void shadeCountries(){
		for (Marker marker : countryMarkers){
			//find data for country of the current marker
			String countryID = marker.getId();
			if(lifeExpMap.containsKey(countryID)){
				float lifeExp = lifeExpMap.get(countryID);
				//Encode value as brightness (values range: 40 - 90)
				int colorLevel = (int) map(lifeExp,40,90,10,255);
				marker.setColor(color(255-colorLevel,100,colorLevel));				
			}
			else{
				marker.setColor(color(150,150,150));
			}
		}
		
	}
}
