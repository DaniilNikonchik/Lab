package Занятие14.OutOfMemoryError;

import java.util.LinkedList;
import java.util.List;

public class OOME {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void grabAllMemory() {
        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }
}
