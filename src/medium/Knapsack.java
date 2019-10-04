package medium;

class BitFlyerTransactionReward {

    static double BONUS_REWARD = 12.5;

    static double findTotalReward(long blockSize, long transaction[], double reward[], int items) {
        double result = 0;
        if (items == 0 || blockSize == 0)
            return 0;

        if (transaction[items] > blockSize)
            return findTotalReward(blockSize, transaction, reward, items - 1);

        else {
            double temp1 = findTotalReward(blockSize, transaction, reward, items - 1);
            double temp2 = reward[items] + findTotalReward(blockSize - transaction[items], transaction, reward, items - 1);
            result =  Math.max(temp1, temp2);

        }
        return result;
    }

    public static void main(String args[]) {
        double rewards[] =
                new double[] {0.0887, 0.1856, 0.2307, 0.1522, 0.0532, 0.0250, 0.1409, 0.2541, 0.1147, 0.2660, 0.2933,
                        0.0686};
        long transactions[] =
                new long[] {57247, 98732, 134928, 77275, 29240, 15440, 70820, 139603, 63718, 143807, 190457, 40572};
        long blockSize = 500000;
        int items = rewards.length - 1;
        double v = findTotalReward(blockSize, transactions, rewards, items);

        System.out.println(v + BONUS_REWARD);
    }
}
