package week_32_Queing_Hashing_TicketingORMpart2;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlterCaseTest {
    AlterCase solution = new AlterCase();

    File resourcesDirectory = new File("src/test/resources");
    String path = resourcesDirectory.getAbsolutePath() + "/input.txt";


    @Test
    void withFilesReadStringAndCounter() throws IOException {
        System.out.println(path);
        String expected = "We ArE tHe WoRlD\n" + "ThIs Is SoMe CoDe\n";
        assertEquals(expected, solution.withFilesReadStringAndCounter(path));
    }

    @Test
    void withCharAndFilesReadAllLines() throws IOException {
        String expected = "We ArE tHe WoRlD\n" + "ThIs Is SoMe CoDe";
        assertEquals(expected, solution.withCharAndFilesReadAllLines(path));
    }

    @Test
    void withScannerAndRecursive() throws FileNotFoundException {
        String expected = "We ArE tHe WoRlD\n" + "ThIs Is SoMe CoDe\n";
        assertEquals(expected, solution.withScannerAndRecursive(path));
    }
}