import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


public class Uniformes
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<TShirt> list = new ArrayList<>();

        var n = Integer.parseInt(st.nextToken());

        while (n > 0)
        {
            var name = br.readLine();
            var tShirtDetails = br.readLine().split(" ");

            list.add(new TShirt(name, tShirtDetails[0], tShirtDetails[1]));

            n--;
        }

        Comparator<TShirt> comparator = Comparator
                .comparing(TShirt::getColor).reversed()
                .thenComparing(TShirt::getSize).reversed()
                .thenComparing(TShirt::getOwner);

        list.stream().sorted(comparator).forEach(System.out::println);
    }
}

class TShirt
{
    private String size;
    private String color;
    private String owner;

    public TShirt (String owner, String color, String size)
    {
        this.owner = owner;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}