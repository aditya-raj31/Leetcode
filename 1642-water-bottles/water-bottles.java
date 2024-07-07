class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        for(int numBottle = 1;numBottles>=numExchange; numBottle++) {
            totalBottles += numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles % numExchange);
        }
        return totalBottles;
        //for(int i=0; i<numBottles; i++)
    }
}