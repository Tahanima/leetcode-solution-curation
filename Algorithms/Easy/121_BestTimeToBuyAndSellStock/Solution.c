int maxProfit(int* prices, int pricesSize){
    int answer = 0;
    int buyingPrice = prices[0];
    
    for (int i = 1; i < pricesSize; i++){
        if (prices[i] < buyingPrice)
            buyingPrice = prices[i];
        else if (prices[i] - buyingPrice > answer)
            answer = prices[i] - buyingPrice;
    }
    
    return answer;
}
