package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentFlow implements Iterable<StudentGroup> {
    private long studentFlowID;
    private String flowLabel;
    private List<StudentGroup> groups;
    private int groupsContains;

    public StudentFlow(String label, long id) {
        this.studentFlowID = id;
        this.flowLabel = label;
        this.groups = new ArrayList<StudentGroup>();
    }

    public long getStudentFlowID() {
        return studentFlowID;
    }

    public String getFlowLabel() {
        return flowLabel;
    }

    public void setFlowLabel(String flowLabel) {
        this.flowLabel = flowLabel;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void addGroupToFlow(StudentGroup group) {
        this.groups.add(group);
        this.groupsContains++;
    }

    public int getGroupsContains() {
        return this.groupsContains;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < groups.size();
            }
            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        String flowHeader = new String();
        String border = new String();
        flowHeader += String.format("**** Flow #%d %s (Groups: %d) ****", this.studentFlowID, this.flowLabel, this.groupsContains);
        for (int i = 0; i < flowHeader.length(); i++) {
            border += "*";
        }
        border += "\n";
        /**
         * Generate Flow Label with borders
         */
        flowHeader = border + flowHeader + "\n" + border;
        return flowHeader;
    }

}
