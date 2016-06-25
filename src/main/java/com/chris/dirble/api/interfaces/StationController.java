package com.chris.dirble.api.interfaces;

import java.util.List;
import java.util.Optional;

import com.chris.dirble.model.Station;

public interface StationController {
	/**
	 * Retrieve all station registered in Dirble.
	 * 
	 * 
	 * @param page the stations returned are paginated, this argument
	 *        indicates what page of the search is needed.
	 * 
	 * @param size this is the size of elements returned per page.
	 * 
	 * @param offset the offset of the stations to be returned.
	 * 
	 * @return a list with all the Dirble stations requested.
	 */
	List<Station> getAllStations(int page, int size, int offset);
	
	/**
	 * Retrieve the first 20 stations registered in Dirble.
	 * 
	 * @return
	 */
	List<Station> getAllStations();
	
	/**
	 * Retrieve the recent radios registered in Dirble.
	 * 
	 * @param page the stations returned are paginated, this argument
	 *        indicates what page of the search is needed.
	 * 
	 * @param size this is the size of elements returned per page.
	 * 
	 * @param offset the offset of the stations to be returned.
	 * 
	 * @return a list with all the recent Dirble stations requested.
	 */
	List<Station> getRecentAddedStations(int page, int size, int offset);
	
	/**
	 * Retrieve the recent 20 radios registered in Dirble.
	 * 
	 * @return
	 */
	List<Station> getRecentAddedStations();
	
	/**
	 * Retrieve the 20 most popular stations in Dirble on unique views.
	 * 
	 * @return
	 */
	List<Station> getPopularStations();
	
	/**
	 * Retrieve the most popular stations in Dirble on unique views.
	 * 
	 * @param page the stations returned are paginated, this argument
	 *        indicates what page of the search is needed.
	 * 
	 * @param size this is the size of elements returned per page.
	 * 
	 * @param offset the offset of the stations to be returned.
	 * 
	 * @return a list with all the recent Dirble stations requested.
	 */
	List<Station> getPopularStations(int page, int size, int offset);
	
	/**
	 * Get a Dirble station per ID.
	 * 
	 * @param id is the ID of the Station requested.
	 * 
	 * @return The Station requested.
	 */
	Optional<Station> getStation(int id);
	
	/**
	 * Get similar stations to the one requested.
	 * 
	 * @param id is the ID of the Station used to search similar stations.
	 * 
	 * @return The list with similar stations.
	 */
	List<Station> getSimilarStations(int id);
	
}
