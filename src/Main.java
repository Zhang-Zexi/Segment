/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/4/22 11:40
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        Integer[] nums = {-2, 0, 3, -5, 2, -1};
//        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, new Merge<Integer>() {
//            @Override
//            public Integer merge(Integer a, Integer b) {
//                return a + b;
//            }
//        });

        //另一种写法，简化这个匿名函数
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, (a, b) -> a + b);
        System.out.println(segmentTree);
    }
}
