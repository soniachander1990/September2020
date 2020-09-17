public class Telecom {
    public static void main(String[] args) {
        int countryCode=4;

        switch(countryCode){
            case 1:{
                System.out.println("USA");
            }break;
            case 2:{
                System.out.println("Canada");
            }break;
            case 3:{
                System.out.println("Europe");
            }break;
            case 4:{
                System.out.println("India");
            }break;
            case 5:{
                System.out.println("Pakistan");
            }break;
            case 6:{
                System.out.println("Dubai");
            }break;
            default:{
                System.out.println("Nothing Match");
            }
        }
    }
}
