package hw4;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }
        int newPrice[] = new int[count];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
              newPrice[j]=prices[i];
                j++;
            }

        }
        return newPrice;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        String [] arr = new String[showcaseStocks.length+warehouseStocks.length];
        System.arraycopy(showcaseStocks, 0, arr, 0,showcaseStocks.length);
        System.arraycopy(warehouseStocks, 0, arr, showcaseStocks.length, warehouseStocks.length);
        return arr;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i]>=minPrice && prices[i]<= maxPrice){
                sum+=prices[i];
            }
        }
        return sum;
    }





    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
    }


