package ArrayChallenges;
public class ArraySortElement {
    public static void main (String[] args) {
        String[] orderIds={"M123","M234","B15","G3037","C235"};
        for (String item:orderIds){
            if(item.startsWith("M")){
                System.out.println(item);
            }
        }
    }
}
