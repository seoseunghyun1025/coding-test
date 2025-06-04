//잘 이해 못 함
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[][] star;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N==1) {
            star = new char[1][1];
        }else {
            star = new char[4*N-1][4*N-3];
        }

        for (int i=0; i<star.length; i++) {
            Arrays.fill(star[i],' ');
        }

        Pattern(0, star.length-1, star[0].length-1, N);
        System.out.print(print(star));
        br.close();
    }

    static void Pattern(int top, int bottom, int x, int N) {
        if (N==1) {
            star[0][0] = '*';
            return;
        }else {
            if(cnt!=0) {
                star[top][x+1]='*';
            }
            if(N==2) {
                star[top+2][x-1]='*';
                star[top+2][x-2]='*';
                star[top+3][x-2]='*';
                star[top+4][x-2]='*';
            }
            star[top+1][cnt]='*';

            for(int j=cnt; j<=x; j++) {
                star[top][j]='*';
                star[bottom][j]='*';
            }
            for(int j=2+cnt; j<=bottom; j++) {
                star[j][cnt]='*';
                star[j][x]='*';
            }
            cnt += 2;
            Pattern(top+2, bottom-2, x-2, N-1);
        }
    }

    static StringBuilder print(char[][] star) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[0].length; j++) {
                if (i==1 && j==0) {
                    sb.append(star[i][j]);
                    break;
                }
                sb.append(star[i][j]);
            }
            sb.append('\n');
        }
        return sb;
    }
}