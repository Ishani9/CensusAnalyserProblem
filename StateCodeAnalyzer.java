package gradleAssignment;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCodeAnalyzer {
	public int loadCSVData(String csvFile) throws CensusAnalyserException, IOException {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFile));
			@SuppressWarnings({ "rawtypes", "unchecked" })
			CsvToBeanBuilder<CSVStateCode> csvToBeanBuilder = new CsvToBeanBuilder(reader);
			csvToBeanBuilder.withType(CSVStateCode.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<CSVStateCode> csvToBean = csvToBeanBuilder.build();
			Iterator<CSVStateCode> censusIterator = csvToBean.iterator();
			int countOfRecord = 0;
			while (censusIterator.hasNext()) {
				countOfRecord++;
				@SuppressWarnings("unused")
				CSVStateCode censusData = censusIterator.next();
			}
			return countOfRecord;
		} 
		catch (IOException e) {
			throw new CensusAnalyserException(e.getMessage(),
					CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
		}
		catch (RuntimeException e) {
			throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.INCORRECT_FILE);
		}
	}
}
