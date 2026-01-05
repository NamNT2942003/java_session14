package Gioi2;

import java.util.regex.Pattern;

public class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }
    public static void validate(String phoneNumber) throws InvalidPhoneNumberLengthException {
        phoneNumber = phoneNumber.trim();
        if(!Pattern.matches("^\\d+$", phoneNumber)) {
            throw new InvalidPhoneNumberLengthException("Chứa ký tự không hợp lệ");

        }
        if(phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Độ dài không hợp lệ (Phải đúng 10 số )");
        }

    }
}
