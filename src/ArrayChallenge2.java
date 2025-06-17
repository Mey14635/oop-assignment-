import java.util.Random;
public class ArrayChallenge2 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIds = new String[6];
        for (int i=0; i<orderIds.length; i++) {
            char prefix=(char)(random.nextInt(26)+'A');
            int number=random.nextInt(99)+1;
            String suffix= String.format("%06d",number);
            orderIds[i]=prefix+suffix;
        }
        for(String orderId:orderIds){
            System.out.println(orderId);
        }
    }

}
