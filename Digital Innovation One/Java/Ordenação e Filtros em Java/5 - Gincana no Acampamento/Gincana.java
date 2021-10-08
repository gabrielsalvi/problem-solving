import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gincana
{
    public static int setCurrentPosition(final int value, final int removePosition, final int sizeOfStudents)
    {
        if (value % 2 == 0)
        {
            if (removePosition <= sizeOfStudents - 1)
                return removePosition;
            else
                return 0;
        }
        else
        {
            if (removePosition == 0)
                return sizeOfStudents - 1;
            else
                return removePosition - 1;
        }
    }

    public static int setRemovePosition(final int value, final int currentPosition, final int sizeOfStudents)
    {
        if (value % 2 == 0)
            return (sizeOfStudents - (value % sizeOfStudents) + currentPosition) % sizeOfStudents;
        else
            return (value % sizeOfStudents + currentPosition) % sizeOfStudents;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        List<Student> students;

        int numOfStudents = Integer.parseInt(scanner.next());

        while (numOfStudents > 0)
        {
            students = new ArrayList<>();

            for (int i = 0; i < numOfStudents; i++)
            {
                students.add(new Student(scanner.next(), Integer.parseInt(scanner.next())));
            }

            int removePosition, currentPosition = 0;
            int value = students.get(currentPosition).getNumber();

            for (int i = 0; i < numOfStudents - 1; i++)
            {
                int sizeOfStudents = students.size();

                removePosition = setRemovePosition(value, currentPosition, sizeOfStudents);

                value = students.get(removePosition).getNumber();
                students.remove(removePosition);

                currentPosition = setCurrentPosition(value, removePosition, students.size());
            }

            System.out.println("Vencedor(a): " + students.get(0).getName());

            numOfStudents = Integer.parseInt(scanner.next());
        }

        scanner.close();
    }
}

class Student
{
    private final String name;
    private final int number;

    public Student(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}