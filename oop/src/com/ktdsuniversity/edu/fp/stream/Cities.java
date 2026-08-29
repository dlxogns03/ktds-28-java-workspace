package com.ktdsuniversity.edu.fp.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ktdsuniversity.edu.fp.objects.City;
import com.ktdsuniversity.edu.fp.objects.CityList;

public class Cities {
	
	//1. 모든 도시의 이름만 출력해본다.
	public static void printCounryName(String path, String filename ) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.map(city -> city.getName())
				.forEach(System.out::println);
				;
	}
	
	//2. countryName이 "South Korea"인 데이터의 Native를 중복없이 출력해본다.
	public static void printNativeSet(String path, String filename ) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.filter((cityNative) -> cityNative.getCountryName().equals("South Korea"))
				.map(cityNative -> cityNative.getNativeStr())
				.sorted()
				.forEach(System.out::println);
				;
	}
	
	//3. 모든 도시의 population을 출력해본다.
	
	public static void printPopulation(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.map(city -> city.getPopulation())
				.forEach(System.out::println);
	}
	
	//4. 모든 도시의 population을 출력해본다. 단 0이상만 출력해본다.
	public static void printPopulation0(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.map(city -> city.getPopulation())
				.filter(city -> city > 0)
				.sorted()
				.forEach(System.out::println);				
				;
	}
	//5. contryName이 "A"로 시작하는 국가의 도시들의 timezone을 중복없이 출력해본다.
	public static void printTimeZone(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		
		cityList.filter(str -> str.getCountryName().contains("A"))
				.map(time -> time.getTimezone())
				.distinct()
				.forEach(System.out::println);
	}
	//6. countryIdrk 10이상인 국가들의 도시명을 출력
	public static void printCountryid10up(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		
		cityList.filter(contryid -> contryid.getCountryId() >= 10)
				.map(str -> str.getName())
				.forEach(System.out::println);
	}
	//7. South Korea 도시의 population 총합 
	public static void populationSouthKoreaSum(String path, String filename ) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		IntSummaryStatistics sum = 	cityList.filter((cityNative) -> cityNative.getCountryName().equals("South Korea"))
								.mapToInt(cityNative ->  cityNative.getPopulation())
								.summaryStatistics()
								;
		System.out.println(sum.getSum());
		
	}
	//8. population 기준으로 내림차순 정령해 10개 도시의 이름과 population을 출력 
	public static void populationMin10(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList
				.sequential()
				.sorted((c1,c2) -> c2.getPopulation() - c1.getPopulation())
				.limit(10)
				.forEach(str ->System.out.println(str.getName() + " - " + str.getPopulation()));
				;
		
	}
	//9.type 이 "special self-governing province"인 도시의 이름과 countryName을 출력
	public static void specialType (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		String type = "special self-governing province";
		cityList.filter(str -> str.getType().equals(type))
				.map(str -> str.getCountryName())
				.forEach(System.out::println);
	}
	//10.모든 도시들을 id별로 오름차순 정렬해 출력해본다.
	public static void idReverseSort(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.sequential()
				.sorted((c1,c2) -> c1.getId() - c2.getId())
				.forEach(System.out::println);
	}
	//11. iso2값이 숫자형대인것만 출력
	public static void primitiveInt(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.map(str -> str.getIso2())
				.filter(Mapping::isIntFormat)
				.forEach(System.out::println);
				;
	}
	//12.iso2값이 숫자형태가 아닌 도시의 국가명을 오름차순 정렬
	public static void printIso2CountryName(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.sequential()
				.map(str -> str.getIso2())
				.sorted()
				.filter(str -> str.matches("[^0-9]+$"))
				.forEach(System.out::println);
	}
	//13.국가명 별 도시의 목록을 그룹핑하ㅕ 출력
	public static void groupingCountryName(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		Map<String,List<City>> citys =	cityList.collect(
														Collectors.groupingBy(str -> str.getCountryName()))
														;
		citys.forEach((key, value)-> {
			System.out.println(key);
			System.out.println(value);
		});
	}
	//14. latitude와 longitude가 없는 도시들의 이름만 출력
	public static void filterLatLong(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.filter(str -> str.getLatitude() == null || str.getLatitude().equals(""))
				.filter(str -> str.getLongitude() == null || str.getLatitude().equals(""))
				.forEach(System.out::println);
	}
	//15.국가명이 canada인 도시 중 3개는 건너띄고 2개만 출력
	public static void filterCanade (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.filter(str -> str.getCountryName().equalsIgnoreCase("canada"))
				.skip(3)
				.limit(2)
				.forEach(System.out::println);
	}
	//16. level과 parentId가 0보다 큰도시만 출력
	public static void filterLevelParentId(String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.filter(str -> str.getLevel() > 0 && str.getParentId() > 0 )
				.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Desktop\\java-stream-countries-states-cities-database-master\\csv";
		String filename = "states.csv";
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.forEach(System.out::println);
		
		//1
		printCounryName(path, filename);
		System.out.println("=".repeat(50));
		
		//2
		printNativeSet(path, filename);
		System.out.println("=".repeat(50));
		
		//3
		printPopulation(path, filename);
		System.out.println("=".repeat(50));
		
		//4
		printPopulation0(path, filename);
		System.out.println("=".repeat(50));
		
		//5
		printTimeZone(path, filename);
		System.out.println("=".repeat(50));
		
		//6
		printCountryid10up(path, filename);
		System.out.println("=".repeat(50));
		
		//7
		populationSouthKoreaSum(path, filename);
		System.out.println("=".repeat(50));
		
		//8
		populationMin10(path, filename);
		System.out.println("=".repeat(50));
		
		//9
		specialType(path, filename);
		System.out.println("=".repeat(50));
		
		//10
		idReverseSort(path, filename);
		System.out.println("=".repeat(50));
		
		//11
		primitiveInt(path, filename);
		System.out.println("=".repeat(50));
		
		//12
		printIso2CountryName(path, filename);
		System.out.println("=".repeat(50));
		
		//13
		groupingCountryName(path, filename);
		System.out.println("=".repeat(50));
		
		//14
		filterLatLong(path, filename);
		System.out.println("=".repeat(50));
		
		//15
		filterCanade(path, filename);
		System.out.println("=".repeat(50));
		
		//16
		filterLevelParentId(path, filename);
		System.out.println("=".repeat(50));
	}

}
