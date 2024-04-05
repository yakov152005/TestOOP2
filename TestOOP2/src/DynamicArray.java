public class DynamicArray {
	private int[] arr;

	public DynamicArray(){
		this.arr = new int[0];
	}
	public int size(){
		return arr.length;
	}
	public void add(int value) {
		int[] temp = new int[size() +1];
		for (int i = 0; i < arr.length ; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}
	public int get(int index){
		return arr[index];
	}
	public void removeByIndex(int index){
		int[] temp = new int[size() -1];
		int count = 0;
		for (int i = 0; i < arr.length ; i++) {
			int check = arr[index];
			if (this.arr[i] != check){
				temp[count] = this.arr[i];
				count++;

			}
		}
		arr = temp;
	}
	public void removeByValue(int value){
		 int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value){
				count++;
			}
		}
		int[] temp = new int[size() - count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value){
				temp[index] = arr[i];
				index++;
			}
		}
		arr = temp;
	}
	public void insert(int index, int value){
		int[] temp = new int[size() +1];
		for (int i = 0, j = 0; i < arr.length + 1; i++) {
			if (i == index) {
				temp[i] = value;
			} else {
				temp[i] = arr[j++];
			}
		}
		arr = temp;
	}



	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sb.append(arr[i]);
			if (i < size() - 1) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
}
