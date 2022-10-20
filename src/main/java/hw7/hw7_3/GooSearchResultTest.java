package hw7.hw7_3;

public class GooSearchResultTest {
    public static void main(String[] args){
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
