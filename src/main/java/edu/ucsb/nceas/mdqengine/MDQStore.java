package edu.ucsb.nceas.mdqengine;

import edu.ucsb.nceas.mdqengine.model.Check;
import edu.ucsb.nceas.mdqengine.model.Run;
import edu.ucsb.nceas.mdqengine.model.Suite;

import java.util.Collection;

public interface MDQStore {
	
	public Collection<String> listSuites();
	public Suite getSuite(String id);
	public void createSuite(Suite suite);
	public void updateSuite(Suite suite);
	public void deleteSuite(Suite suite);

	public Collection<String> listChecks();
	public Check getCheck(String id);
	public void createCheck(Check check);
	public void updateCheck(Check check);
	public void deleteCheck(Check check);
	
	public Collection<String> listRuns();
	public Run getRun(String suite, String id );
	public void createRun(Run run);
	public void deleteRun(Run run);

}
