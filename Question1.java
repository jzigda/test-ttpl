package week5;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) throws IOException {
        Path initialFile = Paths.get("C:\\Users\\dell\\Downloads\\test.txt");
        Path sortedFile = Paths.get("C:\\Users\\dell\\Downloads\\sorted.txt");

        Stream<CharSequence> sortedLines = Files.lines(initialFile).sorted().map(Function.identity());

        Files.write(sortedFile, sortedLines::iterator, StandardOpenOption.CREATE);
    }
}