package Home5;

import java.io.File;
import java.nio.file.Files;

public class mainRead {
        public static void main( String [] args) throws Exception {
            String fileName = "C:\\Users\\tsybi\\OneDrive\\Рабочий стол\\Data.text";
            File file = new File(fileName);

            byte [ ] fileBytes = Files.readAllBytes(file.toPath() ) ;
            for(byte b : fileBytes) {
                char singleChar = (char) b;
                System.out.print(singleChar);
            }
        }
    }