package gradleAssignment;

public class CSVBuilderFactory {
	public static <E> CSVBuilderInterface createCSVBuilder() {
		return new OpenCSVBuilder();
	}
}
