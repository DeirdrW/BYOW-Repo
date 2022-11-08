package byow.Core;

import byow.InputDemo.InputSource;

/**
 * Created by hug.
 */
public class StringInputDevice implements InputSource {
    private final String input;
    private int index;

    public StringInputDevice(String s) {
        index = 0;
        input = s;
    }

    public char getNextKey() {
        char returnChar = Character.toUpperCase(input.charAt(index));
        index += 1;
        return returnChar;
    }

    public boolean possibleNextInput() {
        return index < input.length();
    }

}
