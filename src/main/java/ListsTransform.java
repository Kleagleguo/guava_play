import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This is showing Lists.transform(list, function) returns a view of list,
 * which means everytime when you access an element in the returned list, it is essentially
 * applying the function on the item in the original list.
 *
 * @author Bingkun Guo
 * @date: 11/9/15
 **/
public class ListsTransform
{
  public static void main(String[] args)
  {
    final List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
    final List<Integer> transformedList = Lists.transform(
        list, new Function<Integer, Integer>()
        {
          public Integer apply(Integer integer)
          {
            System.out.println(String.format("apply for [%d]", integer));
            return integer * 2;
          }
        }
    );
    for (int i : transformedList) {
      System.out.println(i);
    }
    for (int i : transformedList) {
      System.out.println(i);
    }
  }
}
