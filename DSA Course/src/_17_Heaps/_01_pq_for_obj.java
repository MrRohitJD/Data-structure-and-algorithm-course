package _17_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class _01_pq_for_obj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank -s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq =new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Student("A", 100));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 10));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
            pq.remove();
        }
    }
}
