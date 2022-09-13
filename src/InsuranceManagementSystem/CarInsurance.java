import java.util.Date;
public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceType) {

        super("Araba sigortası", new Date(), new Date());

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
