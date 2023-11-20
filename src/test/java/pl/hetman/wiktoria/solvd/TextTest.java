package pl.hetman.wiktoria.solvd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class TextTest {

    private static final String INPUT_FILE = "input.txt";
    private static final String OUTPUT_COUNT_FILE = "testOutputCount.txt";
    private static final String OUTPUT_WORDS_FILE = "testOutputWords.txt";
    private static final String OUTPUT_EMPTY_FILE = "testEmptyFile.txt";

    @Test
    void testUniqueWordsCounter() {
        //given
        Text text = new Text();

        //when
        text.uniqueWordsCounter(INPUT_FILE, OUTPUT_COUNT_FILE);

        //then
        Assertions.assertAll(
                () -> assertFalse(OUTPUT_COUNT_FILE.isEmpty(), "File is empty"),
                () -> assertFalse(OUTPUT_EMPTY_FILE.isEmpty(), "File is not empty")
        );

    }

    @Test
    void testUniqueWordsPrinter() {
        //given
        Text text = new Text();

        //when
        text.uniqueWordsPrinter(INPUT_FILE, OUTPUT_WORDS_FILE);

        //then
        Assertions.assertFalse(OUTPUT_WORDS_FILE.isEmpty(), "File is empty");

    }
}