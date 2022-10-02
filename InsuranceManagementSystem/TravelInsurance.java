import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceType) {

        super("Seyahat sigortası", new Date(), new Date());

        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=699.99;
        if(insuranceType.equals("Individual"))
        {
            setInsurancePrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setInsurancePrice(price*0.9);
        }
    }
}
