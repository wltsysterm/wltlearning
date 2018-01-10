package strategy.object;

// 老客户大批量
public class OldCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {

        System.out.println("老客户大批量，打七折");
        return standardPrice * 0.7;
    }

}