package gradleAssignment;

import java.io.Reader;
import java.util.Iterator;

public interface CSVBuilderInterface<E> {

	public <E> Iterator<E> getCSVFileIterator(Reader reader, Class<E> csvClass) throws CensusAnalyserException;
}
