package DeretKarakter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DeretKarakter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Membuat Deret Batas  Dengan Inputan
        int m = 0;
        System.out.print("Masukan Batas Angka  : ");
        m = Integer.parseInt(br.readLine());

        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.print("* ");
            } else {
                System.out.print("# ");

            }
        }
    }
}