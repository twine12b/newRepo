/**
 * @url https://medium.com/cloud-native-the-gathering/how-to-mirror-copy-an-entire-existing-git-repository-into-a-new-one-3bb8faefad9e
 * After cloning repository. make a copy to your own git account
 * -- git push --mirror https://gitsite.com/yourusername/new-repository.git --
 */
package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1) +"."+ lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        DecimalFormat df = new DecimalFormat("0.00");
        String withVat = df.format(originalPrice+ (originalPrice * (vatRate/100)));

        return Double.parseDouble(withVat);
    }

    public String reverse(String sentence) {
        char[] chars = sentence.toCharArray();
        String revStr = "";

        // Reverse iterate the character array
        for (int i = chars.length - 1; i >= 0; i--) {
            revStr = revStr + chars[i];
        }
        return revStr;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
