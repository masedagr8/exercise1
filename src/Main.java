public class Main {
    public static void main(String[] args) {


        String city="Columbus";
        System.out.println("city: "+city);
        int zip= 43123;
        System.out.println("zip code: "+zip);
        double dailyHigh[]={32.0,25.0,27.0,40.0,45.0};
        double total=0;
        for(int i=0 ;i<4;i++ ){
            total= dailyHigh[i]+total;
        }
        double high = total/5;
        System.out.println("Average High Temperqature: "+high);






    }
}