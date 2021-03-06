import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[][] encryptedText = {{4,4},{5,4},{1,1},{3,4},{5,4},{1,1},
                {2,3},{3,3},{5,3},{4,4},{5,4},{1,2},{4,2},{4,3},{4,2},
                {4,4},{3,2},{5,1},{4,1},{2,1},{2,3},{1,1},{3,1},{1,3},
                {5,3},{1,5},{5,4},{4,2},{5,4},{4,2},{4,4},{4,2},{4,3},
                {4,4},{3,2},{5,1},{4,1},{5,3},{4,3},{5,4},{3,2},{4,2},
                {3,4},{4,1},{1,1},{2,5},{5,1},{3,5},{5,3},{3,4},{1,3},
                {4,2},{4,3},{2,2},{5,3},{4,3},{1,1},{4,4},{5,4},{3,4},
                {5,3},{4,3},{2,2},{5,1},{3,4},{3,1},{4,2},{1,4},{3,2},
                {5,1},{3,4},{1,2},{5,3},{3,4},{1,2},{1,5},{5,4},{1,5},
                {3,4},{5,1},{3,3},{5,1},{4,4},{4,4},{1,1},{2,2},{5,1},
                {4,4},{4,2},{5,4},{4,2},{4,4},{4,4},{1,5},{3,4},{5,1},
                {2,3},{5,5},{1,5},{4,3},{2,1},{3,4},{5,1},{1,1},{1,3},
                {1,1},{2,1},{2,3},{5,1},{4,2},{5,4},{3,1},{5,3},{3,3},
                {2,1},{4,2},{4,3},{5,1},{4,4},{5,3},{1,5},{3,4},{1,4},
                {3,4},{5,1},{2,5},{4,2},{5,3},{1,5},{4,4},{3,3},{5,1},
                {5,4},{3,2},{5,3},{4,1},{4,4},{3,4},{3,5},{1,3},{5,4},
                {4,1}};

      List<String> decrypted = decryptText(encryptedText);

      decrypted.forEach(System.out::print);



    }

    static List<String> decryptText(int[][] encryptedText){

        String[][] square = {{"A","B","C","D","E"},
                             {"F","G","H","I","J"},
                             {"K","L","M","N","O"},
                             {"P","Q","R","S","T"},
                             {"U","V","W","X","Y"},
                             {"Z"}
                              };
        List<String> decryptedMessage = new ArrayList<>();
        int x , y ;
        int j = 0 ;
        for (int i = 0; i < encryptedText.length; i++){

                x = encryptedText[i][j];
                y = encryptedText[i][j+1];
                decryptedMessage.add(square[y-1][x-1]);

        }
        return decryptedMessage;
    }
}
