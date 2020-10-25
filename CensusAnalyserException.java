package gradleAssignment;

@SuppressWarnings("serial")
public class CensusAnalyserException extends Exception {
	public enum ExceptionType {
		INCORRECT_FILE,
		CENSUS_FILE_PROBLEM;
	}

	public ExceptionType type;

	public CensusAnalyserException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}