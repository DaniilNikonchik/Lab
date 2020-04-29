package Занятие10.Container;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> {
    private E[] data;

    public DataContainer(E[] data) {
        this.data = data;
    }

    public void add(E item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return;
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
    }

    public E[] getData() {
        return data;
    }

    public static <E> void sort(DataContainer<E> item, Comparator<E> comparator) {
        E newData;
        E[] data = item.getData();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j <data.length ; j++) {
                if (comparator.compare(data[i], data[j]) == -1) {
                    newData = data[j];
                    data[j] = data[i];
                    data[i] = newData;
                } else {
                    continue;
                }
            }
        }
    }

    public void deleteIndex(int index) {
        int deleted = data.length - index - 1;
        System.arraycopy(data, index + 1, data, index, deleted);
        data[this.data.length - 1] = null;
    }

    public void deleteItem(E item) {
        data = ArrayUtils.removeElement(data, item);
        data = Arrays.copyOf(data, data.length - 1);
    }
}
