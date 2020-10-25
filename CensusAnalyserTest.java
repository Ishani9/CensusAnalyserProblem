package gradleAssignment;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class CensusAnalyserTest {
	private static final String STATECENSUSFILE = "C:\\Users\\Ishani\\eclipse-workspace\\gradleAssignment\\IndiaStateCensusData.csv";
	private static final String USCENSUSFILE = "C:\\Users\\Ishani\\eclipse-workspace\\gradleAssignment\\USCensusData.csv";

	@Test
	public void givenStateCSVFile_IfMatchNumberOfRecords_ShouldReturnTrue() throws IOException {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		int count = 0;
		try {
			count = analyser.loadCSVData(STATECENSUSFILE);
		} 
		catch (CensusAnalyserException e) {
			e.printStackTrace();
		}
		assertEquals(29, count);
	}

}
