package pl.hetman.wiktoria.solvd;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Text {

    private static final Logger LOGGER = LogManager.getLogger(Text.class.getName());

    public Text() {
        LOGGER.info("Text()");
        LOGGER.info("Text(...)");
    }

    public void uniqueWordsCounter(String inputFile, String outputFile) {
        LOGGER.info("uniqueWordsCounter(" + inputFile + ", " + outputFile + ")");
        if (inputFile != null && outputFile != null) {
            try {
                List<String> input = FileUtils.readLines(new File(inputFile), StandardCharsets.UTF_8);
                String text = StringUtils.join(input, " ");
                String[] words = StringUtils.split(text);
                Set<String> uniqueWords = new HashSet<>();

                for (String word : words) {
                    uniqueWords.add(word.toLowerCase());
                }

                int uniqueWordsCount = uniqueWords.size();

                FileUtils.writeStringToFile(new File(outputFile), "Number of unique words in the text: " + uniqueWordsCount, StandardCharsets.UTF_8);

            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
            LOGGER.info("uniqueWordsCounter(...)");
        } else {
            LOGGER.warn("One of the Strings is null");
        }
    }

    public void uniqueWordsPrinter(String inputFile, String outputFile) {
        LOGGER.info("uniqueWordsPrinter(" + inputFile + ", " + outputFile + ")");
        if (inputFile != null && outputFile != null) {
            try {
                List<String> input = FileUtils.readLines(new File(inputFile), StandardCharsets.UTF_8);
                String text = StringUtils.join(input, " ");
                String[] words = StringUtils.split(text);
                Set<String> uniqueWords = new HashSet<>();

                for (String word : words) {
                    uniqueWords.add(word.toLowerCase());
                }

                FileUtils.writeStringToFile(new File(outputFile), "Unique words in the text: " + uniqueWords, StandardCharsets.UTF_8);

            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
            LOGGER.info("uniqueWordsPrinter(...)");
        } else {
            LOGGER.warn("One of the Strings is null");
        }
    }

    @Override
    public String toString() {
        return "Text{}";
    }
}
