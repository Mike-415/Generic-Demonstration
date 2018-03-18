package Generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBox<T>
{
    List<T> list;
    public RandomBox()
    {
        list = new ArrayList<>();
    }

    public void addItem(T newItem)
    {
        list.add(newItem);
    }

    public T drawWinner() { return list.remove((new Random()).nextInt(list.size()));}

    public void displayEntries()
    {
        System.out.println("There are "+list.size()+" entries.");
    }

    @Override
    public String toString()
    {
        String results = "";
        int elementCount = 0;
        for(Object element: list)
        {
            results += element + " ";
            if(elementCount % 10 == 0)
            {
                results += "\n";
            }
            elementCount++;
        }
        return results;
    }

}
