import java.util.Stream;


public class practInterface {




	public static Stream<String> f(String s) {
		return Stream.generate(new Supplier<String>() {
			int i = 0;
			public String get() {
				return s.repeat(i++);
			}
		});
	}					//prueba 
						//f("ab").limit(10).forEach(System.out::println);

	public static String f(List<String> list) {
		return list.stream()
					.filter(s -> !s.isBlank())
					.map(StringBuilder::new)
					.map(StringBuilder::reverse)
					.reduce(new StringBuilder(), StringBuilder::append)
					.toString();

						//["abc", "\n\t", "def"]
						//""cba fed"
	}
}