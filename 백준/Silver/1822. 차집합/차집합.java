import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 두 집합의 원소 개수를 입력받는다.
        int n = in.nextInt();
        int m = in.nextInt();
        
        // 집합 A와 B의 원소들을 저장할 Set 선언
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        // 집합 A의 원소들을 입력받아 setA에 저장
        for (int i = 0; i < n; i++) {
            setA.add(in.nextInt());
        }
        
        // 집합 B의 원소들을 입력받아 setB에 저장
        for (int i = 0; i < m; i++) {
            setB.add(in.nextInt());
        }
        
        // 집합 A에서 집합 B에 속하지 않는 원소들만 추출
        setA.removeAll(setB);
        
        // 집합 A에서 집합 B에 속하지 않는 원소들이 없다면 0을 출력
        System.out.println(setA.size());
        
        // 존재하면 원소들을 오름차순으로 출력
        if (setA.size() > 0) {
            List<Integer> result = new ArrayList<>(setA);
            Collections.sort(result);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
        
        in.close();
    }
}
