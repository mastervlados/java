package gb.homework;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumericalSequence {
    private List<Integer> sequence;

    public ListOfNumericalSequence(List<Integer> sequence) {
        this.sequence = new ArrayList<Integer>(sequence);
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public void addNumber(Integer number) {
        this.sequence.add(number);
    }
}
