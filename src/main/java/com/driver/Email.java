package com.driver;

public class Email {

    private String emailId;
    private String password;

    Email(){

    }
    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        boolean digitPresent = false;
        boolean upperPresent = false;
        boolean lowerPresent = false;
        boolean specialChar = false;

        //if oldPassword is correct and newPassword is of length 8
        if(oldPassword.equals(this.password) && newPassword.length()==8){


            for(int i = 0 ;i < newPassword.length();i++){
                
                char ch = newPassword.charAt(i);
                
                //checking if it's a digit
                if(Character.isDigit(ch)){
                    digitPresent = true;
                }
                //checking if it's lowercase
                else if(Character.isUpperCase(ch)){
                    upperPresent = true;
                }
                //checking if it's lowercase
                else if (Character.isLowerCase(ch)){
                    lowerPresent = true;
                }
                //checking if it's a special character
                else if (!Character.isDigit(ch)&& !Character.isLetter(ch)&& !Character.isWhitespace(ch)) {
                    specialChar = true;
                }
            }

          if(digitPresent && upperPresent && lowerPresent && specialChar){
              this.password = newPassword;
          }
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
