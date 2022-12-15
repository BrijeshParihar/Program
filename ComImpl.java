import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {


        if((o1%100)/10>(o2%100)/10)
        {
            return 1;
        }
        else if ((o1%100)/10<(o2%100)/10)
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}
