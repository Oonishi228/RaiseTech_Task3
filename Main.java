import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Map<String, String> animalMap = new HashMap<>();
		animalMap.put("dog", "犬");
		animalMap.put("cat", "猫");
		animalMap.put("bird", "鳥");
		animalMap.put("cow", "牛");
		for (Map.Entry<String, String> entry : animalMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		//	猫をマンチカンに変更
		String name = animalMap.put("cat", "マンチカン");
		//	ラムダ式で出力
		animalMap.forEach((key, val) -> System.out.println(key + ":" + val));

		System.out.println("-------------------");

		List<String> animalNameList = List.of("ポチ", "タマ", "ロッキー", "ジョセフィーヌ");

		System.out.println(animalNameList.size());
		System.out.println("ロッキーのindexは" + animalNameList.indexOf("ロッキー") + "です。");
		try {
			System.out.println(animalNameList.get(4));
		} catch (Exception e) {
			System.out.println("エラーです。");
			throw e;
		}

	}
}
