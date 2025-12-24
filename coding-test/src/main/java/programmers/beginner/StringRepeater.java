package programmers.beginner;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class StringRepeater {

    public String solution(String my_string, int n) {
        return stream(my_string.split(""))
                .map(s -> s.repeat(n))
                .collect(Collectors.joining());
    }
}
