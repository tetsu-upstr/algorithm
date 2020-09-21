package practice;

public class SearchBinary {

	public static void main(String[] args) {
		int[] data = { 10, 30, 40, 60, 80, 90, 110, 140, 170, 190, 210, 260 };
		System.out.println(search(data, 80) + "番目に見つかりました。");
	}
 
	public static int search(int[] data, int target) {
		int ret = -1; // 探索して見つからなかった場合は、-1（ありえない数字）を返す
		int left = 0;
		int right = data.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2; // 走査範囲を２分する
//			System.out.println(mid);
			if (data[mid] == target) {
				return mid + 1; // 一致したら、mid+1（見つかった場所）を返す
			} else if (target < data[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ret;
	}
}