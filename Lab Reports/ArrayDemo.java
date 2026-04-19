public class ArrayDemo {
public static void main(String[] args) { int[] marks = {100, 85, 60, 70, 95};

int total = 0; double average;

for (int m : marks) { total += m;
}

average = (double) total / marks.length;

System.out.println("Total = " + total); System.out.println("Average = " + average);
}
}
