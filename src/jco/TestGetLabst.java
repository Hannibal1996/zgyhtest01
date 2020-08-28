package jco;

/**
 * @author gyh
 * @create 2020-08-27 9:34
 */
public class TestGetLabst {
    public static void main(String[] args) {

        GetLabst gt = new GetLabst();
        Labst lat = gt.GetLabst("HM7058","hm9288","1000","AS0000000015","3105");
        System.out.println("非限制库存：" +  lat.getLabst());
        System.out.println("单位：" + lat.getMeins());
    }
}
