import java.util.*;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    PriorityQueue<Patient> pq =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {
        pq.offer(p);
    }

    public Patient callNextPatient() {
        return pq.poll();
    }

    public static void main(String[] args) {

        HospitalER er = new HospitalER();

        er.admitPatient(new Patient(3, "Rahul"));
        er.admitPatient(new Patient(1, "Amit"));
        er.admitPatient(new Patient(2, "Priya"));

        while (!er.pq.isEmpty()) {
            Patient p = er.callNextPatient();
            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}