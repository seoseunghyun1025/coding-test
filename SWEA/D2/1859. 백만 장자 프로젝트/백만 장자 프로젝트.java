import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Solution
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            long sum = 0;
            StringTokenizer s = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(s.nextToken());
            }
            int max = arr[arr.length - 1];
            for(int j = arr.length - 2; j >= 0; j--){
                if(max < arr[j]){
                   max = arr[j];
                }
                else{
                    sum += (max - arr[j]);
                }
            }
            sb.append("#" + test_case + " " + sum + "\n");
        }
        System.out.print(sb);
    }
}