public class MainEx4 {
	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.add(1);
		dynamicArray.add(2);
		System.out.println(dynamicArray.get(0));
		System.out.println(dynamicArray.size());
		dynamicArray.removeByIndex(0);
		System.out.println(dynamicArray);
		dynamicArray.add(1);
		dynamicArray.add(1);
		dynamicArray.removeByValue(1);
		System.out.println(dynamicArray);
		dynamicArray.add(1);
		dynamicArray.insert(0,3);
		System.out.println(dynamicArray);
	}
}
