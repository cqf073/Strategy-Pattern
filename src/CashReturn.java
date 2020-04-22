/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2217:12
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class CashReturn implements CashSuper {
    private double	moneyCondition	= 0;
    private double	moneyReturn		= 0;

    public CashReturn(double moneyCondition, double moneyReturn)
    {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money)
    {
        double result = money;
        if (money >= moneyCondition)
        {
            result = money - money / moneyCondition * moneyReturn;
        }
        return result;
    }
}
