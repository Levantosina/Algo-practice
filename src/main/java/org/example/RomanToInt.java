package org.example;

/**
 * @author Levantosina
 */
public class RomanToInt {
    public int romanToInt(String s) {

        int result=0;
        int i=0;

       while (i<s.length()){

            char currentCh=s.charAt(i);
            int currentValue=romanNumbers(currentCh);
            if(i+1<s.length()){
                char nextCh=s.charAt(i+1);
                int nextValue=romanNumbers(nextCh);

                if(currentValue<nextValue){
                result+=(nextValue-currentValue);
                i++;
                }
                else {
                    result+=currentValue;
                }
            }
            else{
                result+=currentValue;
            }
            i++;
        }
        return result;
    }

private int romanNumbers(char c){
    switch (c) {
        case 'I':
            return (1);

        case 'V':
            return (5);

        case 'X':
            return (10);
        case 'L':
            return (50);
        case 'C':
            return (100);
        case 'D':
            return (500);
        case 'M':
            return (1000);
        default:
            return 0;
    }
}

}
