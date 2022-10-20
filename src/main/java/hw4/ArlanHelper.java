package hw4;

public class ArlanHelper {
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        System.out.println(helper.drawQuad(2));
        System.out.println(helper.drawRect(2, 3, 'X'));
        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }

    public String drawPattern(char[] pattern, int repeatCount){
        String result = "";
        int index = 0;
        while (repeatCount>0){
            while (index<pattern.length){
                result+=pattern[index];
                index++;
            }
            repeatCount--;
            index = 0;
        }
    return result;
    }
    public String drawLine(int length){
        String result = "";
        int start = 0;
        int hash = 0;

        while (start+hash<length){
            result+="*";
            start++;
            if (start+hash<length){
                result+="#";
                hash++;
            }
        }
        return result;

    }

    public String drawRect(int width, int height, char c){
        int row = 1;
        int line = 1;
        String result = "";
        while (line<=height){
            while (row<=width){
                result+=c;
                row++;
            }
            result+="\n";
            row = 1;
            line++;
        }
        return result;
    }


    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }
            result += "\n";
        }
        return result;
    }

}


