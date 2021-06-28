import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class ArrayCreator {

	public static <T> T[] create(int length, T value) {
		T[] arr = (T[]) Array.newInstance(value.getClass(), length);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
		}

		return arr;

	}

	public static <T> T[] create(Class<T> clazz, int length, T value) {
		T[] arr = (T[]) Array.newInstance(value.getClass(), length);
		IntStream.range(0, length).forEach(i -> arr[i] = value);
		return arr;
	}

}
