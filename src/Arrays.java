public class Arrays {
    public static void main(String[] args) {


        int [] lottoTicket = new int[6];
        String  [] names = {"Bilal", "Aisha", "Aliya"};

        double s = System.nanoTime();
        lottoTicket[0] = 2;
        lottoTicket[2] = 99;
        lottoTicket[3] = 99;
        lottoTicket[4] = 99;
        lottoTicket[5] = 99;
        lottoTicket[2] = 33;
        double e = System.nanoTime();
        double total = s+e;

        System.out.println("total time executed " + total);

        for (int i = 0; i < lottoTicket.length; i++){
            System.out.println(lottoTicket[i]);
        }
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}
