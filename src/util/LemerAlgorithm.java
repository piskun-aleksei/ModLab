package util;

import java.util.ArrayList;

/**
 * Created by Aliaksei_Piskun1 on 16-Sep-16.
 */
public class LemerAlgorithm {
    public static ArrayList<Integer> computeSequence(Double a, Double r, Double m, Integer radix){
        ArrayList<Integer> result = new ArrayList<>();
        Double tempValue = r, tempParam = 0D;

        for(int i = 0; i < 20; i ++){
            result.add(0);
        }

        for(int i = 0; i < radix - 1; i ++){
            tempValue = ((a * tempValue) % m);
            tempParam = tempValue / m;
            if((tempParam >= 0) && (tempParam < 0.05)){
                result.set(0, result.get(0) + 1);
            }
            if((tempParam >= 0.05) && (tempParam < 0.1)){
                result.set(1, result.get(1) + 1);
            }
            if((tempParam >= 0.1) && (tempParam < 0.15)){
                result.set(2, result.get(2) + 1);
            }
            if((tempParam >= 0.15) && (tempParam < 0.2)){
                result.set(3, result.get(3) + 1);
            }
            if((tempParam >= 0.2) && (tempParam < 0.25)){
                result.set(4, result.get(4) + 1);
            }
            if((tempParam >= 0.25) && (tempParam < 0.3)){
                result.set(5, result.get(5) + 1);
            }
            if((tempParam >= 0.3) && (tempParam < 0.35)){
                result.set(6, result.get(6) + 1);
            }
            if((tempParam >= 0.35) && (tempParam < 0.4)){
                result.set(7, result.get(7) + 1);
            }
            if((tempParam >= 0.4) && (tempParam < 0.45)){
                result.set(8, result.get(8) + 1);
            }
            if((tempParam >= 0.45) && (tempParam < 0.5)){
                result.set(9, result.get(9) + 1);
            }
            if((tempParam >= 0.5) && (tempParam < 0.55)){
                result.set(10, result.get(10) + 1);
            }
            if((tempParam >= 0.55) && (tempParam < 0.6)){
                result.set(11, result.get(11) + 1);
            }
            if((tempParam >= 0.6) && (tempParam < 0.65)){
                result.set(12, result.get(12) + 1);
            }
            if((tempParam >= 0.65) && (tempParam < 0.7)){
                result.set(13, result.get(13) + 1);
            }
            if((tempParam >= 0.7) && (tempParam < 0.75)){
                result.set(14, result.get(14) + 1);
            }
            if((tempParam >= 0.75) && (tempParam < 0.8)){
                result.set(15, result.get(15) + 1);
            }
            if((tempParam >= 0.8) && (tempParam < 0.85)){
                result.set(16, result.get(16) + 1);
            }
            if((tempParam >= 0.85) && (tempParam < 0.9)){
                result.set(17, result.get(17) + 1);
            }
            if((tempParam >= 0.9) && (tempParam < 0.95)){
                result.set(18, result.get(18) + 1);
            }
            if((tempParam >= 0.95) && (tempParam <= 1)){
                result.set(0, result.get(0) + 1);
            }
        }
        return result;
    }
}

