import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAvg(marks));
        System.out.println("Highest: " + findHighest(marks) );
    }

    public static void addMarks(List<Integer> marks, int mark){
        marks.add(mark);
    }

    public static double calculateAvg(List<Integer> marks){
        double sum = 0.0;
        for(int i : marks){
            sum += i;
        }
        return sum/marks.size();
    }

    public static int findHighest(List<Integer> marks){
        int max = marks.get(0);
        for(int ele : marks){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    public static void displayMarks(List<Integer>marks) {
        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


