public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() 
    {
        int total = 0;
        for(int i = 0; i<10000; i++)
        {
            int num6 = 0;
            for(int j = 0; j<6; j++)
            {
                int roll = (int)(Math.random() * 6 + 1);
                if(roll == 6)
                {
                    num6++;
                }
            }
            if(num6 >= 1)
            {
                total++;
            }
        }        
        double percentage = 100*((double)total/10000); 
        return percentage;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
                int total = 0;
        for(int i = 0; i<10000; i++)
        {
            int num6 = 0;
            for(int j = 0; j<12; j++)
            {
                int roll = (int)(Math.random() * 6 + 1);
                if(roll == 6)
                {
                    num6++;
                }
            }
            if(num6 >= 2)
            {
                total++;
            }
        }        
        double percentage = 100*((double)total/10000); 
        return percentage;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int total = 0;
        for(int i = 0; i<10000; i++)
        {
            int num6 = 0;
            for(int j = 0; j<18; j++)
            {
                int roll = (int)(Math.random() * 6 + 1);
                if(roll == 6)
                {
                    num6++;
                }
            }
            if(num6 >= 3)
            {
                total++;
            }
        }        
        double percentage = 100*((double)total/10000); 
        return percentage;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
