class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    int calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days * 5;
    }
}

public class libraryMembership {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Hemant", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Aman", "G301")
        };

        int overdueDays = 4;

        System.out.println("Member Details and Fine\n");

        for (LibraryMember m : members) {

            m.printDetails();

            System.out.println("Fine = Rs. " + m.calculateFine(overdueDays));

            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching Member ID : " + searchId);

        for (LibraryMember m : members) {

            if (m.memberId.equals(searchId)) {
                System.out.println("Member Found");
                m.printDetails();
            }
        }
    }
}