package domain.Classes.StudentGroup;

import java.util.Comparator;

public class StudentGroupComparator {

    public static Comparator<StudentGroup> getComparatorByCountMembersInGroup() {
        return new Comparator<StudentGroup>() {
            public int compare(StudentGroup o1, StudentGroup o2) {
                if (o1.getStudents().size() == o2.getStudents().size()) {
                    return 0;
                } else if (o1.getStudents().size() > o2.getStudents().size()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
    }

    public static Comparator<StudentGroup> getComparatorByGroupIndex() {
        return new Comparator<StudentGroup>() {
            public int compare(StudentGroup o1, StudentGroup o2) {
                if (o1.getGroupID() == o2.getGroupID()) {
                    return 0;
                } else if (o1.getGroupID() > o2.getGroupID()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
    }
}
