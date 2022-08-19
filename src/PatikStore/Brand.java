import java.util.LinkedHashMap;

//Marka
public class Brand implements Comparable {

    private int id;
    private String brandName;
    private static String[]brand =new String[9];
    private static LinkedHashMap<String,Integer>nameId=new LinkedHashMap<>();
    private Product product;

    public Brand(int id, String brandName){
        this.brandName=brandName;
        this.id=id;
    }

    public static void printBrand(){
        compara(brand);
        System.out.println();
        System.out.println("BRANDS");
        System.out.println("----------------------------");
        for (String brand : brand) {
            System.out.println("- " + brand);
        }
        System.out.println();
    }

    private static void compara(String[] brand) {

        for(int i=0; i< brand.length; i++){
            String first =brand[i];
            int index =i;
            for(int j=i+1; j< brand.length; j++){
                int result =first.compareTo(brand[j]);

                if(result>0){
                    first=brand[j];
                    index=j;
                }
            }
            /*
            brand[index] = brand[i];
            brand[i]=first;
            */
            String temp = brand[i];
            brand[i] = first;
            brand[index] = temp;

        }
    }

    @Override
    public int compareTo(Object o) {
        return getBrandName().compareTo(brandName);
    }
    public static void addBrand(String brands,int index){
        brand[index]=brands;
        nameId.put(brands,(index+1));

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static String[] getBrand() {
        return brand;
    }

    public static void setBrand(String[] brand) {
        Brand.brand = brand;
    }
}
