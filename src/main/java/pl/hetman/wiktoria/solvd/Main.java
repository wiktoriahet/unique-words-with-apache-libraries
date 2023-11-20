package pl.hetman.wiktoria.solvd;

public class Main {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputCountFile = "outputCount.txt";
        String outputWordsFile = "outputWords.txt";

        Text text = new Text();
        text.uniqueWordsCounter(inputFile, outputCountFile);
        text.uniqueWordsPrinter(inputFile, outputWordsFile);
    }
}