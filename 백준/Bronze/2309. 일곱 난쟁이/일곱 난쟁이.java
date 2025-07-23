import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//길이가 9인 배열 생성 -> 난쟁이가 9명이니까
		int[] arr = new int[9];

		//전체 난쟁이들의 키 총합을 위한 변수 선언
		int sum=0;

		for(int i=0;i<9;i++) {
			int n = Integer.parseInt(br.readLine()); //값을 입력받고
			arr[i] = n; //그 값을 배열에 저장
			sum += arr[i]; //키 총합 누적합산
		}

		//키 데이터가 저장된 배열을 오름차순으로 정렬
		Arrays.sort(arr);

		//범인을 찾기위한 변수 선언
		int a=0,b=0;

		//바깥 for문 : 맨 마지막 값까지 갈 필요 없다.
		//왜? 안쪽 for문이 맨 마지막 값을 체크해줌
		for(int i=0;i<arr.length-1;i++) {

			//안쪽 for문 : i+1번째 값부터 시작한다.
			//왜? i번째 값은 바깥 for문이 체크해줌
			for(int j=i+1;j<arr.length;j++) {

				//총합에서 어떤 두 값을 뺐을 때 100이 되면, 그 두 값이 범인이다!
				if(sum - arr[i] - arr[j] == 100) {
					a=i;
					b=j;
					break;
				}
			}
		}

		//범인을 제외한 진짜 일곱난쟁이 키 출력
		for(int i=0;i<arr.length;i++) {

			//배열의 9개 데이터 인덱스값 중에 범인인덱스와 값이 다를 경우에만 출력
			if(i!=a && i!=b) {
				System.out.println(arr[i]);
			}
		}
	}
}