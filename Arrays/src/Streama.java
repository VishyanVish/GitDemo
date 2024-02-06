import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streama {
	public static void main(String[] args) {
		streamFilter();
		streamMap();
	}

	@Test
	public static void streamFilter() {
		List<String> obj = new ArrayList<>();
		obj.add("vishwa");
		obj.add("abc");
		obj.add("rsd");
		obj.add("ad");
		Long c = obj.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(c);
		obj.stream().filter(d -> d.length() > 2).forEach(s -> System.out.println(s));
		obj.stream().filter(s -> s.length() > 2).limit(1).forEach(s -> System.out.println(s));
	}

	public static void streamMap() {
		Stream.of("Abcd", "efdf", "vishwa", "Aaa").filter(s -> s.length() > 4).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		Stream.of("Abcd", "efdf", "vishwa", "Aaa").filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		String[] a = {"Abcd", "efdf", "vishwa", "Aaa","Aaa"};
		List<String> li1 = Arrays.asList(a);
		int[] a2= new int [] {3,4,1,5,1,2,4};
		List<Integer> li = Arrays.asList(3,7,5,1,2,3);
		List<Integer> li2 = Arrays.stream(a2).boxed().collect(Collectors.toList());
		System.out.println("           ");
		li.stream().sorted().distinct().forEach(s-> System.out.println(s));
	List<Integer> list=	li2.stream().distinct().collect(Collectors.toList());
	System.out.println(list.get(3));
	}
}