/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2217:12
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class CashFactory {
    public static CashSuper createCash(String type)
    {
        CashSuper cs = null;
        if ("正常收费".equals(type))
        {
            cs = new CashNormal();
        }
        else if ("满300返100".equals(type))
        {
            cs = new CashReturn(300, 100);
        }
        else if ("打8折".equals(type))
        {
            cs = new CashRebate(0.8);
        }

        return cs;
    }
}
