package Builder;

public class Program {
   public static void main(String[] args) {
       Contract contract = Contract.builder().setName("Contract v-c").setValid(false).build();
       Contract contract2 = Contract.builder().setName("Contract chirie").setValid(true).build();

       System.out.println(contract);
       System.out.println(contract2);
   }
}
